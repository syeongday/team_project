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

public class ThirdActivity extends Activity {
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("Third 액티비티");

        // 키워드 버튼 변수 선언 및 정의
        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);

        Button next;
        TextView textView2;

        next = findViewById(R.id.next_btn);
        textView2 = findViewById(R.id.textView2);

        // 폰트 적용
        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        btn1.setTypeface(typeface);
        btn2.setTypeface(typeface);
        btn3.setTypeface(typeface);
        btn4.setTypeface(typeface);
        btn5.setTypeface(typeface);
        btn6.setTypeface(typeface);
        btn7.setTypeface(typeface);
        btn8.setTypeface(typeface);
        btn9.setTypeface(typeface);
        btn10.setTypeface(typeface);
        btn11.setTypeface(typeface);
        btn12.setTypeface(typeface);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "mongmyfont.ttf");
        textView2.setTypeface(typeface1);
        next.setTypeface(typeface1);

        // 버튼 클릭시 색상 변경
        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn1.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn2.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn3.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn4.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn5.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn6.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn7.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn8.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn9.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn10.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn11.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn12.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
