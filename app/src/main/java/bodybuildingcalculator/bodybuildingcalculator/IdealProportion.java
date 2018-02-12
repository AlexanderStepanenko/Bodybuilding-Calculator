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
import android.widget.TextView;
import android.widget.Toast;


public class IdealProportion extends AppCompatActivity {

    private Button resultIdealProportion;
    private ImageView imageView;
    private TextView neck;
    private TextView chest;
    private TextView biceps;
    private TextView talia;
    private TextView wrist;
    private TextView bedro;
    private TextView ikri;
    private EditText wristcircumference;
    private ImageView info;
    int maxLength = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideal_proportion);





        resultIdealProportion = (Button) findViewById(R.id.button_rezult_body_type);
        imageView = (ImageView)  findViewById(R.id.image_view_back_ideal_proportion);
        neck = (TextView) findViewById(R.id.neck_result);
        chest = (TextView) findViewById(R.id.chest_result);
        biceps = (TextView) findViewById(R.id.biceps_result);
        talia = (TextView) findViewById(R.id.talia_result);
        wrist = (TextView) findViewById(R.id.wrist_result);
        bedro = (TextView) findViewById(R.id.bedro_result);
        ikri = (TextView) findViewById(R.id.ikri_result);
        wristcircumference = (EditText) findViewById(R.id.editText_ideal_proportion);
        wristcircumference.setInputType(InputType.TYPE_CLASS_NUMBER);
        wristcircumference.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        info = (ImageView) findViewById(R.id.image_view_info_ideal_proportion);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IdealProportionDialog idealProportionDialog = new IdealProportionDialog(IdealProportion.this);
                idealProportionDialog.show();
            }
        });






        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IdealProportion.this, MainActivity.class);
                startActivity(intent);
                IdealProportion.this.finish();
            }
        });

        resultIdealProportion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompetetionsResult competetionsResult = new CompetetionsResult();
                SizeSpec sizeSpec = new SizeSpec();


                try {
                    String wristCircumference = wristcircumference.getText().toString();
                    float wristAsFloat = Float.parseFloat(wristCircumference);
                    competetionsResult.setWristCircumference(wristAsFloat);
                    sizeSpec.perfectPhysique(competetionsResult.getWristCircumference());
                } catch (Exception ex) {
                    Toast.makeText(IdealProportion.this, R.string.IdealProportionException, Toast.LENGTH_SHORT).show();
                }

                String result1 = sizeSpec.printChest();
                Log.w("RESULT", "RESULT: " + result1);
                chest.setText(result1);

                String result2 = sizeSpec.printNeck();
                Log.w("RESULT", "RESULT: " + result1);
                neck.setText(result2);

                String result3 = sizeSpec.printBiceps();
                Log.w("RESULT", "RESULT: " + result1);
                biceps.setText(result3);

                String result4 = sizeSpec.printTalia();
                Log.w("RESULT", "RESULT: " + result1);
                talia.setText(result4);

                String result5 = sizeSpec.printWrist();
                Log.w("RESULT", "RESULT: " + result1);
                wrist.setText(result5);

                String result6 = sizeSpec.printHip();
                Log.w("RESULT", "RESULT: " + result1);
                bedro.setText(result6);

                String result7 = sizeSpec.printShin();
                Log.w("RESULT", "RESULT: " + result1);
                ikri.setText(result7);

            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(IdealProportion.this, MainActivity.class);
        startActivity(intent);
        IdealProportion.this.finish();
    }


}

