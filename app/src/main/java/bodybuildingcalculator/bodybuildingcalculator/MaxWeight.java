package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MaxWeight extends AppCompatActivity {

    private TextView weightTextView;
    private EditText weightEditText;
    private TextView repsTextView;
    private EditText repsEditText;
    private EditText colemanPhraze;
    private Button result;
    private TextView resultMaxWeight;
    private TextView gymnasticTextView;
    private Spinner gymnasticSpinner;
    private Toolbar toolbar;
    private ImageView imageView;
    private ImageView information;
    private Spinner unitMass;
    int maxLength = 4;
    int maxLength1 = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_weight);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_max_weight);
        setSupportActionBar(toolbar);


        weightTextView = (TextView) findViewById(R.id.textView_maxWeight_weight);
        weightEditText = (EditText) findViewById(R.id.editText_maxWeight_weight);
        weightEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength1)});
        weightEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        repsTextView = (TextView) findViewById(R.id.textView_maxWeight_reps);
        repsEditText = (EditText) findViewById(R.id.editText_maxWeight_reps);
        repsEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        repsEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        result = (Button) findViewById(R.id.button_maxWeight_result);
        resultMaxWeight = (TextView) findViewById(R.id.textView_maxWeight_result);
        imageView = (ImageView) findViewById(R.id.image_view_back_max_weight);
        information = (ImageView) findViewById(R.id.image_view_information);
        colemanPhraze = (EditText) findViewById(R.id.coleman_phraze);

        gymnasticSpinner = (Spinner) findViewById(R.id.spinner_maxWeight_gymnastic);


        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaxWeightDialog maxWeightDialog = new MaxWeightDialog(MaxWeight.this);
                maxWeightDialog.show();
            }
        });

        /*gymnasticSpinner.setPrompt("Title");
        // выделяем элемент
        gymnasticSpinner.setSelection(1);
        // устанавливаем обработчик нажатия
        gymnasticSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    Toast.makeText(getBaseContext(), "Приседания", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(getBaseContext(), "Жим лёжа", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getBaseContext(), "Становая тяга", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg1) {
            }
        });*/


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaxWeight.this, MainActivity.class);
                startActivity(intent);
                MaxWeight.this.finish();
            }
        });

        /*information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MaxWeightDialog dialog = new MaxWeightDialog();
                dialog.show(getSupportFragmentManager(), MaxWeightDialog.TAG);

            }
        });*/


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompetetionsResult competetionsResult = new CompetetionsResult();
                SizeSpec sizeSpec = new SizeSpec();
                try {

                    String weightAsString = weightEditText.getText().toString();
                    float weightAsFloat = Float.parseFloat(weightAsString);

                    String repsAsString = repsEditText.getText().toString();
                    int repsAsInteger = Integer.parseInt(repsAsString);

                    int gymnasticAsInt = gymnasticSpinner.getSelectedItemPosition();
                    competetionsResult.setGymnastic(gymnasticAsInt);

                    competetionsResult.setShellWeight(weightAsFloat);
                    competetionsResult.setReps(repsAsInteger);
                    competetionsResult.setGymnastic(gymnasticAsInt);

                    sizeSpec.oneRepWeight(competetionsResult.getShellWeight(), competetionsResult.getReps(),
                            competetionsResult.getGymnastic());

                } catch (Exception ex) {
                    Toast.makeText(MaxWeight.this, R.string.error_max_weight, Toast.LENGTH_SHORT).show();
                }

                String result = sizeSpec.printOneRepWeight();
                Log.w("RESULT", "RESULT: " + result);

                colemanPhraze.setText(result);
            }
        });
    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(MaxWeight.this, MainActivity.class);
        startActivity(intent);
        MaxWeight.this.finish();
    }
}
