package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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


public class CalculationCalories extends AppCompatActivity {

    private Button caloricDayRezultButton;
    private EditText heightEditText;
    private EditText weightEditText;
    private EditText wristEditText;
    private EditText yearEditText;
    private Spinner lifestyleEditText;
    private Spinner sexEditText;
    private Spinner targetEditText;
    private TextView rezultEditText;
    private ImageView imageView;
    private ImageView info;
    int maxLength = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_calories);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_calculation_calories);
        setSupportActionBar(toolbar);

        caloricDayRezultButton = (Button) findViewById(R.id.button_rezult_caloriescalculation);
        heightEditText = (EditText) findViewById(R.id.height_edit_text_calcalories);
        heightEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        heightEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        weightEditText = (EditText) findViewById(R.id.wight_edit_text_calcalories);
        weightEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        weightEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        wristEditText = (EditText) findViewById(R.id.wriscircumference_edit_text);
        wristEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        wristEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        yearEditText = (EditText) findViewById(R.id.age_edit_text_calcalories);
        yearEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        yearEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        lifestyleEditText = (Spinner) findViewById(R.id.spinner_lifestyle);
        sexEditText = (Spinner) findViewById(R.id.spinner_sex);
        targetEditText = (Spinner) findViewById(R.id.spinner_target);
        rezultEditText = (TextView) findViewById(R.id.button_rezult_caloriescalculation_edit_text);
        imageView = (ImageView) findViewById(R.id.image_view_back_calculation_calories);
        info = (ImageView) findViewById(R.id.image_view_info_calculation_calories);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationCaloriesDialog cdd = new CalculationCaloriesDialog(CalculationCalories.this);
                cdd.show();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculationCalories.this, MainActivity.class);
                startActivity(intent);
                CalculationCalories.this.finish();
            }
        });

        caloricDayRezultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompetetionsResult competetionsResult = new CompetetionsResult();
                SizeSpec sizeSpec = new SizeSpec();
                try {
                    String heightAsString = heightEditText.getText().toString();
                    int heightAsFloat = Integer.parseInt(heightAsString);

                    String weightAsString = weightEditText.getText().toString();
                    float weightAsFloat = Float.parseFloat(weightAsString);

                    String circumferenceAsString = wristEditText.getText().toString();
                    float circumferenceAsFloat = Float.parseFloat(circumferenceAsString);

                    String yearsAsString = yearEditText.getText().toString();
                    int yearsAsInt = Integer.parseInt(yearsAsString);

                    int lifestyleAsInt = lifestyleEditText.getSelectedItemPosition();
                    competetionsResult.setLifestyle(lifestyleAsInt);

                    int sexAsInt = sexEditText.getSelectedItemPosition();
                    competetionsResult.setSex(sexAsInt);

                    int targetAsInt = targetEditText.getSelectedItemPosition();
                    competetionsResult.setTarget(targetAsInt);

                    competetionsResult.setWristCircumference(circumferenceAsFloat);
                    competetionsResult.setHeight(heightAsFloat);
                    competetionsResult.setWeight(weightAsFloat);
                    competetionsResult.setAge(yearsAsInt);
                    competetionsResult.setSex(sexAsInt);
                    competetionsResult.setTarget(targetAsInt);
                    competetionsResult.setLifestyle(lifestyleAsInt);

                    sizeSpec.caloricCalculation1(competetionsResult.getWeight(),
                            competetionsResult.getHeight(),
                            competetionsResult.getAge(),
                            competetionsResult.getLifestyle(),
                            competetionsResult.getTarget(),
                            competetionsResult.getSex());
                } catch (Exception ex) {
                    Toast.makeText(CalculationCalories.this, R.string.CalculationCaloriesException, Toast.LENGTH_SHORT).show();
                }



                String result = getString(R.string.ссс) + sizeSpec.printCaloricCalculation() +
                        getString(R.string.Carbohydrates) + sizeSpec.printCarbohydrates() +
                        getString(R.string.Proteins) + sizeSpec.printProteins() + getString(R.string.Fats)
                        + sizeSpec.printFats();
                Log.w("RESULT", "RESULT: " + result);

                rezultEditText.setText(result);

            }


        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(CalculationCalories.this, MainActivity.class);
        startActivity(intent);
        CalculationCalories.this.finish();
    }
}
