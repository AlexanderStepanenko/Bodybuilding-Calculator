package bodybuildingcalculator.bodybuildingcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class EndomorphWomanBodyTypeScrolling extends AppCompatActivity {
    private ImageView backTrainingEktomorph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endomorph_woman_body_type_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_endowoman_training);
        setSupportActionBar(toolbar);


        backTrainingEktomorph = (ImageView) findViewById(R.id.image_view_back_endo_woman_training);

        backTrainingEktomorph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndomorphWomanBodyTypeScrolling.this, BodyType.class);
                startActivity(intent);
                EndomorphWomanBodyTypeScrolling.this.finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent intent = new Intent(EndomorphWomanBodyTypeScrolling.this, BodyType.class);
        startActivity(intent);
        EndomorphWomanBodyTypeScrolling.this.finish();
    }
}
