package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class EndomorphTrainingScrolling extends AppCompatActivity {
    private ImageView backTrainingEndomorph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endomorph_training_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_endoman_training);
        setSupportActionBar(toolbar);

        backTrainingEndomorph = (ImageView) findViewById(R.id.image_view_back_endo_man_training);

        backTrainingEndomorph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndomorphTrainingScrolling.this, BodyType.class);
                startActivity(intent);
                EndomorphTrainingScrolling.this.finish();

            }
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(EndomorphTrainingScrolling.this, BodyType.class);
        startActivity(intent);
        EndomorphTrainingScrolling.this.finish();
    }
}
