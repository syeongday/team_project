package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends Activity {
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
        setTitle("fourth 액티비티");

        Button btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);

        TextView textView4;
        Button pre, conc;
        textView4 = findViewById(R.id.textView4);
        pre = findViewById(R.id.pre_btn);
        conc = findViewById(R.id.conc_btn);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        btn13.setTypeface(typeface);
        btn14.setTypeface(typeface);
        btn15.setTypeface(typeface);
        btn16.setTypeface(typeface);
        btn17.setTypeface(typeface);
        btn18.setTypeface(typeface);
        btn19.setTypeface(typeface);
        btn20.setTypeface(typeface);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "mongmyfont.ttf");
        textView4.setTypeface(typeface1);
        pre.setTypeface(typeface1);
        conc.setTypeface(typeface1);

        // 버튼 클릭시 색상 변경
        btn13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn13.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn14.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn15.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn16.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn17.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn17.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn18.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn18.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn19.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn19.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn20.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn20.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });

        conc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}
