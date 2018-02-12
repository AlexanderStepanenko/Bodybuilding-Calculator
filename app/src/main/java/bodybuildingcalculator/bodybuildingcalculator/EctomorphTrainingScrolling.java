package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class EctomorphTrainingScrolling extends AppCompatActivity {
    private ImageView backTrainingEktomorph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ectomorph_training_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_ectoman_training);
        setSupportActionBar(toolbar);

        backTrainingEktomorph = (ImageView) findViewById(R.id.image_view_back_ectomorph_training);

        backTrainingEktomorph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EctomorphTrainingScrolling.this, BodyType.class);
                startActivity(intent);
                EctomorphTrainingScrolling.this.finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(EctomorphTrainingScrolling.this, BodyType.class);
        startActivity(intent);
        EctomorphTrainingScrolling.this.finish();
    }
}
