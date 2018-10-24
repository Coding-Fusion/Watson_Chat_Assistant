package com.example.debrathdev.springas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void go_home_child(View v)
    {
        Intent buttonclick = new Intent(this,home_child.class);
        this.startActivity(buttonclick);
    }
}

/*public void go_home_child(View v)
    {
            Intent buttonclick = new Intent(this,signin.class);
        this.startActivity(buttonclick);
        }*/ // Uncomment and replace above function if you want to add Google Sign in feature