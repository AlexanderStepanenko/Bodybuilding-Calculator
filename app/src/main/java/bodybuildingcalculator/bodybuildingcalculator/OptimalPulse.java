package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class OptimalPulse extends AppCompatActivity {


    private TextView optimalPulseTextViewAge;
    private EditText optimalPulseEditTextAge;
    private Button resultOptimalPulseButton;
    private TextView resultOptimalPulse;
    private Toolbar toolbar;
    private ImageView imageView;
    private ImageView information;
    private TextView maxPulse;
    private TextView hardPulseResult;
    private TextView averagePulseResult;
    private TextView lightPulseResult;
    private TextView veryLightPulseResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimal_pulse);


        optimalPulseTextViewAge = (TextView) findViewById(R.id.optimalPulse_textView_age);
        optimalPulseEditTextAge = (EditText) findViewById(R.id.optimalPulse_editText_age);
        resultOptimalPulseButton = (Button) findViewById(R.id.optimalPulse_button_rezult);
        //resultOptimalPulse = findViewById(R.id.optimalPulse_textView_result);
        maxPulse = (TextView) findViewById(R.id.resultMaxPulse);
        hardPulseResult = (TextView) findViewById(R.id.resultHardPulse);
        averagePulseResult = (TextView) findViewById(R.id.resultAveragePulse);
        lightPulseResult = (TextView) findViewById(R.id.resultLightPulse);
        veryLightPulseResult = (TextView) findViewById(R.id.resultVeryLightPulse);
        imageView = (ImageView) findViewById(R.id.image_view_back_optimal_pulse);
        information = (ImageView) findViewById(R.id.image_view_info_optimal_pulse);




        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptimalPulse.this, MainActivity.class);
                startActivity(intent);
                OptimalPulse.this.finish();
            }
        });

       /* information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OptimalPulseDialog dialog = new OptimalPulseDialog();
                dialog.show(getSupportFragmentManager(), OptimalPulseDialog.TAG);

            }
        });*/


        resultOptimalPulseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CompetetionsResult competetionsResult = new CompetetionsResult();
                SizeSpec sizeSpec = new SizeSpec();
                try {

                    String ageAsString = optimalPulseEditTextAge.getText().toString();
                    int ageAsInt = Integer.parseInt(ageAsString);

                    competetionsResult.setAge(ageAsInt);

                    sizeSpec.optimalPulse(competetionsResult.getAge());
                } catch (Exception ex) {
                    Toast.makeText(OptimalPulse.this, "Ошибка! Введите свой возраст.", Toast.LENGTH_SHORT).show();
                }


                String result = sizeSpec.printOptimalPulse();
                Log.w("RESULT", "RESULT: " + result);

                String result1 = sizeSpec.printHardPulse();
                Log.w("RESULT", "RESULT: " + result1);
                hardPulseResult.setText(result1);

                String result2 = sizeSpec.printAveragePulse();
                Log.w("RESULT", "RESULT: " + result2);
                averagePulseResult.setText(result2);

                String result3 = sizeSpec.printLightPulse();
                Log.w("RESULT", "RESULT: " + result3);
                lightPulseResult.setText(result3);

                String result4 = sizeSpec.printVeryLightPulse();
                Log.w("RESULT", "RESULT: " + result4);
                veryLightPulseResult.setText(result4);

                String result5 = sizeSpec.printMaxPulse();
                Log.w("RESULT", "RESULT: " + result5);
                maxPulse.setText(result5);


                //resultOptimalPulse.setText(result);
            }
        });
    }
}
