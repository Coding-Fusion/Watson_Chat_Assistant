package com.example.debrathdev.springas;

import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.os.Bundle;
import android.content.Intent;
import android.util.*;
import timber.log.Timber;

/**
 * Created by DEBRATH(DEV) on 3/12/2018.
 */

public class splash_activity extends AppCompatActivity {

    private ProgressBar mProgress;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show the splash screen
        setContentView(R.layout.splash);
        mProgress = (ProgressBar) findViewById(R.id.splash_screen_progress_bar);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                progress_bar();
                startApp();
                finish();
            }
        }).start();
    }

    private void progress_bar() {
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(500);
                mProgress.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
                Timber.e(e.getMessage());

            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(splash_activity.this, HomePageActivity.class);
        startActivity(intent);
    }

}
