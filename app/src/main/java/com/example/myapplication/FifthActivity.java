package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
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
            textView.setText("");
        }else if(NARA.equals("northamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("northamerica") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }
        else if(NARA.equals("northamerica") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("northamerica") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("northamerica") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("northamerica") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("northamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
        }

        //southamerica
        if(NARA.equals("southamerica") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("southamerica") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("southamerica") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("southamerica") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("southamerica") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("southamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
        }

        //africa
        if(NARA.equals("africa") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            textView.setText("");
        }else if(NARA.equals("africa") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("africa") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("africa") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("africa") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("africa") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }else if(NARA.equals("africa") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("africa") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("africa") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("africa") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("africa") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("africa") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("africa") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("africa") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("africa") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("africa") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("africa") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("africa") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("africa") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("africa") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
        }

        //eu
        if(NARA.equals("eu") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            textView.setText("");
        }else if(NARA.equals("eu") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("eu") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("eu") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("eu") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("eu") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }else if(NARA.equals("eu") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("eu") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("eu") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("eu") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("eu") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("eu") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("eu") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("eu") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("eu") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("eu") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("eu") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("eu") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("eu") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("eu") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
        }

        //asia
        if(NARA.equals("asia") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            textView.setText("");
        }else if(NARA.equals("asia") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("asia") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("asia") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("asia") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("asia") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }else if(NARA.equals("asia") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("asia") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("asia") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("asia") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("asia") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("asia") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("asia") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("asia") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("asia") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("asia") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("asia") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("asia") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("asia") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("asia") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
        }

        //os
        if(NARA.equals("os") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            textView.setText("");
        }else if(NARA.equals("os") && Food.equals("디저트")){
            first_button.setText("디저트");
            textView.setText("");
        }else if(NARA.equals("os") && Food.equals("술")){
            first_button.setText("술");
            textView.setText("");
        }

        if(NARA.equals("os") && Natural.equals("자연경관")) {
            second_button.setText("자연경관");
            textView.setText("");
        }else if(NARA.equals("os") && Natural.equals("등산")){
            second_button.setText("등산");
            textView.setText("");
        }else if(NARA.equals("os") && Natural.equals("바다")){
            second_button.setText("바다");
            textView.setText("");
        }else if(NARA.equals("os") && Natural.equals("온천")){
            second_button.setText("온천");
            textView.setText("");
        }else if(NARA.equals("os") && Natural.equals("배낭여행")){
            second_button.setText("배낭여행");
            textView.setText("");
        }

        if(NARA.equals("os") && Game.equals("축제")) {
            third_button.setText("축제");
            textView.setText("");
        }else if(NARA.equals("os") && Game.equals("테마파크")){
            third_button.setText("테마파크");
            textView.setText("");
        }else if(NARA.equals("os") && Game.equals("놀이공원")){
            third_button.setText("놀이공원");
            textView.setText("");
        }else if(NARA.equals("os") && Game.equals("랜드마크")){
            third_button.setText("랜드마크");
            textView.setText("");
        }

        if(NARA.equals("os") && Culture.equals("전통")) {
            fourth_button.setText("전통");
            textView.setText("");
        }else if(NARA.equals("os") && Culture.equals("역사")){
            fourth_button.setText("역사");
            textView.setText("");
        }else if(NARA.equals("os") && Culture.equals("종교")){
            fourth_button.setText("종교");
            textView.setText("");
        }else if(NARA.equals("os") && Culture.equals("예술")){
            fourth_button.setText("예술");
            textView.setText("");
        }

        if(NARA.equals("os") && Gita.equals("시장")) {
            fifth_button.setText("시장");
            textView.setText("");
        }else if(NARA.equals("os") && Gita.equals("호캉스")){
            fifth_button.setText("호캉스");
            textView.setText("");
        }else if(NARA.equals("os") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            textView.setText("");
        }else if(NARA.equals("os") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            textView.setText("");
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