package com.example.myapplication;

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
    private Integer[] btn_id = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
            R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12,
            R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16, R.id.btn17, R.id.btn18,
            R.id.btn19, R.id.btn20};
    Button next;
    Button pre;
    Button conc;
    TextView textView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("Third 액티비티");

        for(int i=0; i < 20; i++) {
            btn[i] = (Button)findViewById(btn_id[i]);
        }

        next = findViewById(R.id.next_btn);
        pre = findViewById(R.id.pre_btn);
        conc = findViewById(R.id.conc_btn);
        textView2 = findViewById(R.id.textView2);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        for(int i=0; i<20; i++) {
            btn[i].setTypeface(typeface);
        }

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "mongmyfont.ttf");
        textView2.setTypeface(typeface1);
        next.setTypeface(typeface1);
        pre.setTypeface(typeface1);
        conc.setTypeface(typeface1);

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
