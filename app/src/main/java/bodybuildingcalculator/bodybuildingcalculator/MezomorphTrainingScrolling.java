package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class MezomorphTrainingScrolling extends AppCompatActivity {
    private ImageView backTrainingMezomorph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezomorph_training_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_mezomorph_training);
        setSupportActionBar(toolbar);

        backTrainingMezomorph = (ImageView) findViewById(R.id.image_view_back_mezomorph_training);

        backTrainingMezomorph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MezomorphTrainingScrolling.this, BodyType.class);
                startActivity(intent);
                MezomorphTrainingScrolling.this.finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(MezomorphTrainingScrolling.this, BodyType.class);
        startActivity(intent);
        MezomorphTrainingScrolling.this.finish();
    }

}
