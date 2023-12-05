package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends Activity {
    private Button[] btn = new Button[20];
    private Integer[] btn_id = {R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7
            , R.id.bt8, R.id.bt9, R.id.bt10, R.id.bt11, R.id.bt12, R.id.bt13, R.id.bt14,
            R.id.bt15, R.id.bt16, R.id.bt17, R.id.bt18, R.id.bt19, R.id.bt20};
    Button bt24;
    TextView textView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("Third 액티비티");

        for(int i=0; i < 20; i++) {
            btn[i] = (Button)findViewById(btn_id[i]);
        }

        bt24 = findViewById(R.id.button24);
        textView2 = findViewById(R.id.textView2);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        for(int i=0; i<20; i++) {
            btn[i].setTypeface(typeface);
        }

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "mongmyfont.ttf");
        textView2.setTypeface(typeface1);
        bt24.setTypeface(typeface1);

        // 버튼마다 색상 변경하는 거 배열로 간단하게 나타낼 순 없을까 .....
        btn[0].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btn[0].setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });
        /*bt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt1.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt2.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt3.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt4.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt5.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt6.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt7.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt8.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt9.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt10.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });

        bt11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt11.setBackgroundColor(Color.rgb(204, 255, 255));
                }
                return false;
            }
        });
        reset.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bt1.setBackgroundColor(Color.rgb(255, 250, 205));
                }
                return false;
            }
        });*/
    }
}
