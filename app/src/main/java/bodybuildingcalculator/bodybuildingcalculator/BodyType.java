package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class BodyType extends AppCompatActivity {
    private Spinner sexEditText;
    private EditText wristEditText;
    private Button rezultBodyType1;
    private ImageView imageView;
    private ImageView imageViewInfo;
    private TextView zamer;
    int maxLength = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_type);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_body_type);
        setSupportActionBar(toolbar);

        wristEditText = (EditText) findViewById(R.id.editText5);
        wristEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        wristEditText.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
        sexEditText = (Spinner) findViewById(R.id.spinner2);
        imageView = (ImageView) findViewById(R.id.image_view_back_body_type);
        imageViewInfo = (ImageView) findViewById(R.id.image_view_info_body_type);

        imageViewInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BodyTypeDialog bodyTypeDialog = new BodyTypeDialog(BodyType.this);
                bodyTypeDialog.show();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyType.this, MainActivity.class);
                startActivity(intent);
                BodyType.this.finish();

            }
        });


        rezultBodyType1 = (Button) findViewById(R.id.button_rezult_body_type1);

        rezultBodyType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                CompetetionsResult competetionResult = new CompetetionsResult();


                int sexAsInt = sexEditText.getSelectedItemPosition();
                competetionResult.setSex(sexAsInt);


                String wristAsString = wristEditText.getText().toString();
                float wristAsFloat = Float.parseFloat(wristAsString);



                    if (competetionResult.getSex() == Sex.MALE) {
                        if (wristAsFloat < 18) {
                            Intent intent = new Intent(BodyType.this, EctomorphTrainingScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();
                        } else if (wristAsFloat >= 18 && wristAsFloat <= 20) {
                            Intent intent = new Intent(BodyType.this, MezomorphTrainingScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();

                        } else if (wristAsFloat >= 20 && wristAsFloat < 30) {
                            Intent intent = new Intent(BodyType.this, EndomorphTrainingScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();

                        }
                        competetionResult.setSex(sexAsInt);
                    } else {
                        if (wristAsFloat < 15) {
                            Intent intent = new Intent(BodyType.this, EctomorphWomanBodyTypeScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();

                        } else if (wristAsFloat >= 15 && wristAsFloat < 17) {
                            Intent intent = new Intent(BodyType.this, MezomorphWomanBodyTypeScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();

                        } else if (wristAsFloat >= 17 && wristAsFloat < 30) {
                            Intent intent = new Intent(BodyType.this, EndomorphWomanBodyTypeScrolling.class);
                            startActivity(intent);
                            BodyType.this.finish();

                        }
                        competetionResult.setSex(sexAsInt);
                    }
                } catch (Exception e) {
                    Toast.makeText(BodyType.this, R.string.error_body_type, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(BodyType.this, MainActivity.class);
        startActivity(intent);
        BodyType.this.finish();
    }
    }
