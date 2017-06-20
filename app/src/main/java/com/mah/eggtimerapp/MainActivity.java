package com.mah.eggtimerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    //Splash screen
    private static int SPLASH_TIME_OUT = 4000;
    //




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Tolgo tutti i menù ed imposto il fullscreen anche nel manifest scelgo theme analogo
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        //Splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, SplashScreen.class);
                startActivity(homeIntent);
                finish();

            }
        }, SPLASH_TIME_OUT);
        //


    }
}
