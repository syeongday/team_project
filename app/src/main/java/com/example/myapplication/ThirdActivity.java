package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class ThirdActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("Third 액티비티");
    }
}
