package bodybuildingcalculator.bodybuildingcalculator;

import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;


/**
 * Created by Пользователь on 10.11.2017.
 */

public class MyPreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);


        if (Build.VERSION.SDK_INT >= 16)
            this.getListView().setBackground(getResources().getDrawable(R.color.New));

    }

}
