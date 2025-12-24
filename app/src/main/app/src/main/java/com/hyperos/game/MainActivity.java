package com.hyperos.game;
import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Settings.Global.putFloat(getContentResolver(), "peak_refresh_rate", 120f);
            Settings.Global.putFloat(getContentResolver(), "user_refresh_rate", 120f);
        } catch (Exception e) {}
        finish(); 
    }
}
