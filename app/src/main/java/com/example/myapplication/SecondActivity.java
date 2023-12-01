package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");
    }
}
