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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity {
    private int count = 0;
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
        ProgressBar seekbar2;

        next = findViewById(R.id.next_btn);
        textView2 = findViewById(R.id.textView2);
        seekbar2 = findViewById(R.id.seekBar2);

        seekbar2.setProgress(50);

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

        Intent intent = new Intent(getApplicationContext(), FourthActivity.class);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 3){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"키워드를 선택하고 다시 눌러주세요!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("음식","미슐랭");
                btn2.setClickable(false);
                btn3.setClickable(false);
                count++;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("음식","디저트");
                btn1.setClickable(false);
                btn3.setClickable(false);
                count++;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("음식","술");
                btn1.setClickable(false);
                btn2.setClickable(false);
                count++;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("자연","자연경관");
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                count++;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("자연","등산");
                btn4.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                count++;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("자연","바다");
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                count++;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("자연","온천");
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn8.setClickable(false);
                count++;
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("자연","배낭여행");
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                count++;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("오락","축제");
                btn10.setClickable(false);
                btn11.setClickable(false);
                btn12.setClickable(false);
                count++;
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("오락","테마파크");
                btn9.setClickable(false);
                btn11.setClickable(false);
                btn12.setClickable(false);
                count++;
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("오락","놀이공원");
                btn9.setClickable(false);
                btn10.setClickable(false);
                btn12.setClickable(false);
                count++;
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("오락","랜드마크");
                btn9.setClickable(false);
                btn10.setClickable(false);
                btn11.setClickable(false);
                count++;
            }
        });


        Intent inIntent = getIntent();
        String NARA = (inIntent.getStringExtra("nara"));

        switch (NARA) {
            case "northamerica":
                intent.putExtra("nara", "northamerica");
                break;
            case "southamerica":
                intent.putExtra("nara", "southamerica");
                break;
            case "africa":
                intent.putExtra("nara", "africa");
                break;
            case "eu":
                intent.putExtra("nara", "eu");
                break;
            case "asia":
                intent.putExtra("nara", "asia");
                break;
            case "os":
                intent.putExtra("nara", "os");
                break;
        }
    }
}
