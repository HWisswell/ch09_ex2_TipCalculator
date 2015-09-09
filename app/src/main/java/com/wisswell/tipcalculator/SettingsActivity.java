package com.wisswell.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import com.wisswell.tipcalculator.R;

public class SettingsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Set the view for the activity using XML
        setContentView(R.layout.activity_settings);
    }
}