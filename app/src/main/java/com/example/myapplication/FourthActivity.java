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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends Activity {
    private int count = 0;
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
        Button conc;
        SeekBar seekbar3;

        textView4 = findViewById(R.id.textView4);
        conc = findViewById(R.id.conc_btn);
        seekbar3 = findViewById(R.id.seekBar3);

        seekbar3.setProgress(75);

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

        Intent intent = new Intent(getApplicationContext(), FifthActivity.class);

        conc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 2){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"키워드를 선택하고 다시 눌러주세요!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("문화","전통");
                btn14.setClickable(false);
                btn15.setClickable(false);
                btn16.setClickable(false);
                count++;
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("문화","역사");
                btn13.setClickable(false);
                btn15.setClickable(false);
                btn16.setClickable(false);
                count++;
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("문화","종교");
                btn13.setClickable(false);
                btn14.setClickable(false);
                btn16.setClickable(false);
                count++;
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("문화","예술");
                btn13.setClickable(false);
                btn14.setClickable(false);
                btn15.setClickable(false);
                count++;
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("기타","시장");
                btn18.setClickable(false);
                btn19.setClickable(false);
                btn20.setClickable(false);
                count++;
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("기타","호캉스");
                btn17.setClickable(false);
                btn19.setClickable(false);
                btn20.setClickable(false);
                count++;
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("기타","스포츠");
                btn17.setClickable(false);
                btn18.setClickable(false);
                btn20.setClickable(false);
                count++;
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("기타","쇼핑");
                btn17.setClickable(false);
                btn18.setClickable(false);
                btn19.setClickable(false);
                count++;
            }
        });


        Intent inIntent = getIntent();
        String NARA = (inIntent.getStringExtra("nara"));
        String Food = (inIntent.getStringExtra("음식"));
        String Natrual = (inIntent.getStringExtra("자연"));
        String Game = (inIntent.getStringExtra("오락"));

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

        switch (Food) {
            case "미슐랭":
                intent.putExtra("음식", "미슐랭");
                break;
            case "디저트":
                intent.putExtra("음식", "디저트");
                break;
            case "술":
                intent.putExtra("음식", "술");
                break;
        }

        switch (Natrual) {
            case "자연경관":
                intent.putExtra("자연", "자연경관");
                break;
            case "등산":
                intent.putExtra("자연", "등산");
                break;
            case "바다":
                intent.putExtra("자연", "바다");
                break;
            case "온천":
                intent.putExtra("자연", "온천");
                break;
            case "배낭여행":
                intent.putExtra("자연", "배낭여행");
                break;
        }

        switch (Game) {
            case "축제":
                intent.putExtra("오락", "축제");
                break;
            case "테마파크":
                intent.putExtra("오락", "테마파크");
                break;
            case "놀이공원":
                intent.putExtra("오락", "놀이공원");
                break;
            case "랜드마크":
                intent.putExtra("오락", "랜드마크");
                break;
        }

    }
}
