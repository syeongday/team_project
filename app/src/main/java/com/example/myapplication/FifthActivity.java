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
                    textView.setText("☞ 르 플랜터 in 미얀마(Le Planteur)\n" +
                            "\n" +
                            "강변의 고풍스러운 대저택이 식당으로 되었다. 아시아에서 가장 아름다운 식당 중 한 곳으로 꼽히는 르 플랜터는 식민지풍의 외관은 물론 로맨틱한 실내 분위기까지 한 폭의 그림 같은 공간이다. 스웨덴의 미슐랭 스타 셰프인 에릭 에피세르가 선보이는 메뉴는 프렌치 요리를 기본으로 코스 메뉴와 단품 메뉴 모두 주문 가능하다.\n" +
                            "\n" +
                            "☞ 라 메종 1888 in 다낭 (La Maison 1888)\n" +
                            "\n" +
                            "미슐랭 스타 셰프인 피에르 가니에르가 다낭에 문을 연 프렌치 레스토랑 라 메종 1888.은 CNN이 선정한 세계 10대 최고의 레스토랑으로 선정되었다. 이곳은 옛 프랑스 식민지 시대를 재현한 고전적인 분위기가 돋보이는 곳이다. \n" +
                            "\n" +
                            "☞ 8 ½  오토 에 메조 봄바나 in 홍콩( 8 ½ Otto e Mezzo Bombana)\n" +
                            "\n" +
                            "‘화이트 트러플의 왕’이라는 별명을 가진 이탈리안 셰프 움베르토 봄바나가 오픈한 개인 레스토랑이다. 페데리코 펠리니 감독의 영화 제목을 따서 만든 이 식당은 유럽 외의 지역에서 가장 높은 미슐랭 스타를 받은 이탈리안 레스토랑이다.");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 첸돌(Cendol), 싱가폴\n" +
                            "\n" +
                            "싱가폴의 인기 있는 지역 특산물로 시원하고 부드러운 간식거리로 살짝 훈제향을 입히고 카라멜로 졸인 야자 설탕 시럽이 들어간 아이스 코코넛 밀크이다. 액체는 열대 판다누스(screw pine)의 잎에서 추출한 판단 쥬스로 화려한 빛깔을 낸, 녹색 쌀가루 젤리의 부드러운 국수가닥이 풍부하게 놓여있다. \n" +
                            "\n" +
                            "☞ 단 타츠(Dan Tats), 홍콩\n" +
                            "\n" +
                            "홍콩 베이커리에 들어가면 에그 커스타드의 향기가 퍼진다. 한 손에 들고 먹기에 완벽한 크기인 단 타츠는 따뜻한 커스타드와 황홀하게 바삭거리는 껍질이 조화를 이루는 오븐에서 막 나왔을 때 가장 맛있다.\n" +
                            "\n" +
                            "☞ 굴랍 자문(Gulab Jamun), 인도\n" +
                            "\n" +
                            "우유향이 가득한 졸여진 시럽 같은 이 인도의 튀김 간식은 단순한 도넛과는 다르다. 녹는 듯한 식감으로 만들기 위해 소의 우유나 물소의 우유를 약한 불에서 오랜 시간을 끓여서 농축한 코야 한 스쿱이 전통적인 굴랍 자문 도우의 기본이다.");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 사케(도호쿠)\n" +
                            "\n" +
                            "벼농사에 최적화된 기후 조건과 맑은 산천수가 흐르는 도호쿠는 일본 사케의 메카로 여겨진다. 사케는 일본에서 가장 유명한 술이다. 일본 사케는 2000년에 걸친 역사 속에서 생겨난 전통 제조법으로 생산한다. 쌀의 수확으로부터 사케 생산까지의 시간과 수고는 엄청나다.\n" +
                            "\n" +
                            "☞ 보드카 박물관(상트페테르부르크)\n" +
                            "\n" +
                            "러시아에서 상트페테르부르크라는 지역에 유명한 보드카 박물관이 있다.  이곳에서는 여러 보드카 시음이 가능하다. 보드카는 호밀을 원료로 한다. 보드카의 특징은 소위 3무라고 하는데 무색, 무미, 무향으로 색깔이 없고, 맛이 없고, 냄새가 없다. 세계에서 가장 많이 생산되는 증류주다.\n" +
                            "\n" +
                            "☞ 막걸리(포천시)\n" +
                            "\n" +
                            "포천시에서 막걸리가 유명한 이유는 지역이 전통적으로 물이 맑은데다 좋은 쌀이 잘 자라서 막걸리를 빚기에는 가장 좋은 환경이라 막걸리를 빚는 양조장이 많았다. 막걸리는 알코올 함량이 낮고, 다양한 영양소와 유익한 미생물이 들어있어서 건강에 도움이 되는 음료수로 평가된다.");
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
                    textView.setText("☞ 대만, 베이터우\n" +
                            "\n" +
                            "타이베이시 베이터우구에 위치한 유황온천은 1894년에 발견되어서 대만 최고의 온천지로 자리 잡고 있다. 이곳에 베이터우석이라고 불리는 독특한 광물이 있는데, 이것은 라듐을 미량 함유하고 있어서 암과 관절염 치료에 유익하다는 이야기가 있다.\n" +
                            "\n" +
                            "☞ 베트남, 나트랑\n" +
                            "\n" +
                            "베트남 지역인 나트랑에 위치한 '머드 온천'은 섬세한 입자의 흙을 사용해서 온천욕을 즐기는 명소로 알려져 있다. 피부 건강에 좋은 머드를 사용하기 때문에 여성 관광객들에게 특히 인기가 높은 여행지다. \n" +
                            "\n" +
                            "☞ 일본, 교토\n" +
                            "\n" +
                            "일본 교토는 일본 역사가 시작될 때부터 수도였고 고대부터 중세시대까지 일본의 수도였다. 때문에 수많은 사람들이 예로부터 교토에 살았고 교토는 일본의 중심지로서 일본 문화를 꽃피웠다. 그리고 일본 문화의 핵심지역답게 일본 온천 문화도 교토에서 발달했다. 교토도 온천수가 존재했고 예로부터 온천을 개발했다.");
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
                    textView.setText("☞ 대만 핑시 천등축제\n" +
                            "\n" +
                            "핑시 천등 축제는 매년 정월대보름을 기념하고자 거행되는 축제로, 역사로는 백년을 자랑한다. 소원과 축복을 하늘에 전하기 위해 천등을 띄우는 축제인데, 수천 개의 천등이 밤하늘 위로 높이 떠오르면서 아름다운 빨간 천등의 물결을 볼 수 있다.\n" +
                            "\n" +
                            "☞ 인도 홀리 축제\n" +
                            "\n" +
                            "힌두력에서 한해의 마지막을 알리는 날로 홀리는 힌두교의 신화를 바탕으로 하고 있는 봄이 시작됐음을 축하하는 봄맞이 축제이다. 신화에 의하면, 힌두교의 영웅신 크리슈나와 그의 연인 라다가 얼굴과 몸에 물감을 칠하고 놀았는데, 이러한 이야기에서 축제가 유래되었다. 몸에 뿌리는 물감을 통해 갈등과 감정을 씻어내는 정화의 의미를 가진 축제이다.\n" +
                            "\n" +
                            "☞ 보령머드축제\n" +
                            "\n" +
                            "보령머드축제의 큰 특징은 국내축제 중 외국인이 제일 많이 참여하는 축제라서 국내외 관광객들이 함께 어울려 피부 미용에 좋은 다양한 머드체험을 즐길 수 있다는 것이다. 대한민국의 대표축제로 여러번 선정되었으며 머드분말을 활용한 체험형 축제이다. 해수욕과 축제를 동시에 참여 가능하며 이색적인 행사가 진행된다.");
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
                    textView.setText("☞ 타지마할\n" +
                            "\n" +
                            "인도 아그라에 위치한 무굴 제국의 대표적 건축물이다. 무굴 제국의 황제 샤 자한이 자신의 총애하였던 부인 아르주망 바누 베굼을 기리기 위하여 1632년에 건설하였다. 일반적으로 흰색 대리석 돔의 영묘가 가장 널리 알려져 있으나, 타지마할의 규모는 더 크다.\n" +
                            "\n" +
                            "☞ 경복궁\n" +
                            "\n" +
                            "대한민국 서울에 위치한 경복궁은 조선 왕조 제일의 법궁이다.1395년 태조 이성계가 창건하였고, 1592년 임진 왜란으로 불타 없어졌다가, 고종 때인 1867년 중건 되었다. 흥선대원군이 주도한 중건된 경복궁은 500여 동의 건물들이 미로같이 빼곡히 들어선 웅장한 모습이었다.\n" +
                            "\n" +
                            "☞ 만리장성\n" +
                            "\n" +
                            "만리장성(萬里長城)은 중국의 대표적인 성벽으로, 흉노족이나 몽골족과 같은 북방 유목민족의 침략을 막기 위해 전국시대 건설이 시작되어 후대 왕조에 의해 확장, 보수되어 온 인류 최대의 성곽 구조물이다.");
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
                    textView.setText("☞ 빅 부다\n" +
                            "\n" +
                            "빅 부다는 태국 푸켓에 있는 높이 45m에 달하는 거대한 불상으로 산 정상에서 볼 수 있는 불상이다. 빅부다는 가오나키도산 해발 400m에 있는 높이 45m, 25m, 총 중량 1,000톤에 달하는 세계 최대의 불상이다. 불상 뿐만 아니라 해발 400m에서 내려다 보는 푸켓의 푸른 바다와 현지인들이 모여 사는 푸켓 타운을 볼 수 있다.\n" +
                            "\n" +
                            "☞ 바투 동굴\n" +
                            "\n" +
                            "바투 동굴은 말레이시아의 수도 쿠알라룸푸르 북쪽으로 13km 떨어진 곳에 있는 석회암 동굴로 힌두교 성지이다.  바투 동굴은 길이 400m, 높이 100m의 웅장하고 신비로운 석회암 동굴이다. 가장 큰 동굴은 길이 400m, 높이 100m인데 이곳에 힌두교 신전이 세워져 있다.\n" +
                            "\n" +
                            "☞ 쉐다곤 파고다\n" +
                            "\n" +
                            "미얀마에 있는 첨탑까지 포함한 높이 112.17 m인 황금탑이다. 미얀마 불교도들의 정신적 지주인 곳이다. 쉐다곤의 이름은 쉐를 뜻하는 황금과 다곤을 뜻하는 언덕을 합친 이름이다. 황금탑 꼭대기 부분을 ‘티’라고 부르는데, 이것은 위치에 따라 밤에는 박힌 보석의 색깔이 달리 보이기도 한다.");
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
                    textView.setText("☞ 파드마 리조트 우붓\n" +
                            "\n" +
                            "발리에 있는 파드마 우붓 리조트 수영장은 총 3개로 열대 우림과 마주하고 있는 인피니티 수영장은 무려 89미터의 길이로 유명하다. 수영장 옆 따뜻한 자쿠지, 밤에는 모닥불을 피워 놓는다. 산스트리트 어로 연꽃을 뜻하는 파드마 라는 이름처럼 건물 기둥 등에서 연꽃 모양을 많이 발견할 수 있다.\n" +
                            "\n" +
                            "☞ 에메랄드 몰디브 리조트 앤 스파\n" +
                            "\n" +
                            "몰디브에 있는 에메랄드 몰디브 리조트 앤 스파는 5성급 럭셔리 리조트로 몰디브 섬 중에 Raa 환초의 북쪽에 위치해 있다. 리조트의 구조는 주변 자연과 영토를 보호하는데 지속적으로 초점을 두고 있어서 주변 환경과의 연결을 유지하기 위해 천연 재료로 지어졌다. \n" +
                            "\n" +
                            "☞ 인터컨티넨탈 다낭 선 페닌슐라 리조트\n" +
                            "\n" +
                            "베트남에 있는 인터컨티넨탈 다낭 선 페닌슐라 리조트는 높은 명성을 자랑하는 La Maison 1888을 포함해 여러 고급 레스토랑을 운영 중이다. 전용 해변, 2개의 대형 야외 수영장, 스파를 보유한 고급 휴양지이다. 모든 객실은 고급스럽게 꾸며져 있으며, 전용 발코니를 갖추고 있다.");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 보라카이\n" +
                            "\n" +
                            "세일링 보트 투어는 필리핀의 보라카이 섬에서 즐길 수 있습니다. 무동력으로 운행되는 돛단배를 타고 시원한 바람을 느낄 수 있습니다. 보라카이 섬의 해변은 세계적으로 유명하고 많은 여행객들이 찾는 곳 중에 하나입니다.\n" +
                            "\n" +
                            "☞ 우즈다오\n" +
                            "\n" +
                            "중국 싼야에 위치한 우즈다오 섬은 하이난 최고의 열대 휴양지입니다. 투명한 바닷물과 다양한 해양생물들이 있어서 스쿠버다이빙으로 유명한 곳입니다. 스쿠버다이빙 뿐만 아니라 모터보트, 바나나 보트, 패러세일링 등 여러 해양 스포츠를 즐길 수 있습니다.\n" +
                            "\n" +
                            "☞ 발리\n" +
                            "\n" +
                            "발리는 인도네시아에 있는 지역입니다. 발리에는 해양스포츠로 서핑이 유명한데 서핑에 적절한 파도가 많이 들어오는 곳이라서 유명합니다. 발리에는 또 다른 스포츠인 요가를 즐길 수도 있습니다. 세계 곳곳에서 정글뷰에서 수련하는 요가를 하기 위해 찾아온다고 합니다.");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ Chatuchak Weekend Market\n" +
                            "\n" +
                            "짜뚜짝 구에 있는 방콕의 명소 ‘짜뚜(Chatuchak) 시장’은 태국에서 가장 큰 규모의 시장으로, 대부분 주말에만 가게를 오픈하여 ‘짜뚜짝 주말 시장’이라고 말한다. 약 15,000개가 넘는 크고 작은 가게와 노점이  있다. 특이한 음식과 독특한 아이템 등을 구경할 수 있다. 짜뚜짝 시장의  합리적인 가격이 가장 큰 장점이다.\n" +
                            "\n" +
                            "☞ The Dubai Mall(두바이 몰)\n" +
                            "\n" +
                            "아랍에미리트의 도시인 두바이에 있는 두바이 몰은 세계에서 가장 큰 쇼핑물 중에 하나로, 510만 면적의 규모를 가지고 있다. 세계에서 가장 큰 ‘두바이 분수’가 있으며 올림픽 경기장 규모의 두바이 아이스 링크와 아쿠아리움 등 여러 시설이 자리하고 있다. 두바이 몰에는 1300개의 소매점과 2개의 백화점이 있다. \n" +
                            "\n" +
                            "☞ 파빌리온 KL\n" +
                            "\n" +
                            "말레이시아의 수도인 쿠알라룸푸르에 있는 쇼핑몰로 2007년에 오픈했고 매장 수는 약 298개이다. 쇼핑몰 안에는 팍슨(Parkson) 백화점과 명품 브랜드 매장들을 볼 수 있다. 쇼핑몰의 장점으로 여성들을 위한 뷰티관련 스파나 헤어 살롱 전문 구역인 뷰티 홀이 따로 있다는게 특징이다.");
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