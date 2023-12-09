package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FifthActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
        setTitle("fifth 액티비티");

        Button first_button = (Button) findViewById(R.id.button4);
        Button second_button = (Button)findViewById(R.id.button5);
        Button third_button = (Button)findViewById(R.id.button6);
        Button fourth_button = (Button)findViewById(R.id.button7);
        Button fifth_button = (Button)findViewById(R.id.button8);
        Button next_button = (Button)findViewById(R.id.button9);
        TextView textView = (TextView) findViewById(R.id.textView5);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "mongsugargothic.ttf");
        first_button.setTypeface(typeface);
        second_button.setTypeface(typeface);
        third_button.setTypeface(typeface);
        fourth_button.setTypeface(typeface);
        fifth_button.setTypeface(typeface);
        next_button.setTypeface(typeface);
        textView.setTypeface(typeface);

        Intent inIntent = getIntent();
        String NARA = (inIntent.getStringExtra("nara"));
        String Food = (inIntent.getStringExtra("음식"));
        String Natural = (inIntent.getStringExtra("자연"));
        String Game = (inIntent.getStringExtra("오락"));
        String Culture = (inIntent.getStringExtra("문화"));
        String Gita = (inIntent.getStringExtra("기타"));

        //northamerica
        if(NARA.equals("northamerica") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("northamerica") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }
        else if(NARA.equals("northamerica") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("northamerica") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("northamerica") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("northamerica") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        //southamerica
        if(NARA.equals("southamerica") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Food.equals("술")) {
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("southamerica") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("southamerica") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("southamerica") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("southamerica") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("southamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        //africa
        if(NARA.equals("africa") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("africa") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("africa") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("africa") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("africa") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("africa") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });        }

        //eu
        if(NARA.equals("eu") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("eu") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("eu") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("eu") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("eu") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("eu") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        //asia
        if(NARA.equals("asia") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("asia") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("asia") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("asia") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  일본 후쿠오카 후쿠오카아시아미술관\n" +
                            "\n" +
                            "현대 아시아 미술 작품들을 광범위하게 전시하고 있는 아시아의 대표적인 미술관으로, 이곳은 서양의 예술 양식을 모방한 것이 아니라 아시아의 전통 예술 양식을 현대적인 방식으로 재해석한 작품들을 소장 중이며, 세계에서 가장 혁신적인 작가들의 명작을 감상할 수 있다.\n" +
                            "\n" +
                            "☞  터키 이스탄불 쉴레이마니예 모스크\n" +
                            "\n" +
                            "오스만 건축의 ‘최고 걸작’이라고 불리는 건축물, 쉴레이마니에 모스크는 오스만의 미켈란젤로 ‘미마르 시난’의 작품이라는 점에서 주목받고 있다. 화려함보단 장엄한 분위기를 풍기며, 큰 돔을 작은 돔이 둘러쌓고 있는 완벽하게 기하학적인 형태를 갖추고 있어 예술적 가치를 더욱 높은 세계문화유산이다.\n" +
                            "\n" +
                            "☞  중국 산시성 시안 병마용갱\n" +
                            "\n" +
                            "중국 고대 무덤 조각의 한 유형이자 세계 문화 유산 중 하나인 ‘세계 8대 불가사의’ 병마용이 있는 병마용갱. 진시황이 자신의 무덤을 보호하기 위해 만든 대형 토용 군대로 병종, 급별, 자세, 복장, 무기 등으로 구성되었으며 매 토용은 마치 살아 숨쉬듯이 독특한 모습과 표정을 볼 수 있다.");
                }
            });
        }

        if(NARA.equals("asia") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        //os
        if(NARA.equals("os") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("os") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Natural.equals("등산")){
            second_button.setText("등산");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Natural.equals("바다")){
            second_button.setText("바다");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Natural.equals("온천")){
            second_button.setText("온천");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            second_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("os") && Game.equals("축제")) {
            third_button.setText("축제");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            third_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("os") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Culture.equals("역사")){
            fourth_button.setText("역사");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Culture.equals("종교")){
            fourth_button.setText("종교");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Culture.equals("예술")){
            fourth_button.setText("예술");
            fourth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        if(NARA.equals("os") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }else if(NARA.equals("os") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("");
                }
            });
        }

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });





    }

}