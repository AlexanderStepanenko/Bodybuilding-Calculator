package bodybuildingcalculator.bodybuildingcalculator;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class BodyTypeDialog extends Dialog implements android.view.View.OnClickListener {


public Activity c;
public Dialog d;
public Button yes;

public BodyTypeDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        }

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_body_type_dialog);
        yes = (Button) findViewById(R.id.button_dialog);
        yes.setOnClickListener(this);

        }

@Override
public void onClick(View v) {

        switch (v.getId()) {
        case R.id.button_dialog:
        c.closeContextMenu();
        break;
        }
        dismiss();
        }
}
