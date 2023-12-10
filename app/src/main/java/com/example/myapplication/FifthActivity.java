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
                    textView.setText("☞ The Inn at Little Washington\n" +
                            "\n" +
                            "격조 높은 시설과 서비스를 인정받아 ‘를레 앤 샤토’ 문장을 수여한 레스토랑이다. ‘를레 앤 샤토’는 유럽 각지에 분포된 부티크 호텔과 프리미엄 레스토랑을 묶은 국제 커뮤니티로 최고의 레스토랑 인증서다. 패트릭 오코넬 쉐프의 솜씨를 맛보기 위해 영국 여왕과 스페인 왕실도 발걸음할 정도로 유명한 식당이다.\n" +
                            "\n" +
                            "☞ Atelier Crenn\n" +
                            "\n" +
                            "아틀리에 크렌은 미국 최초의 미쉐린 3스타 여성 셰프인 도미닉 크렌(Dominque Crenn)이 이끄는 모던 프렌치 레스토랑이다. 도미닉 셰프는 시적인 요리(Poetic Culinaria)를 주제로 요리를 시로 형상화 한 코스요리를 선보인다.\n" +
                            "\n" +
                            "☞ SingleThread\n" +
                            "\n" +
                            "미국에 있는 개업 2년 만에 미쉐린 3스타의 영예를 안은 싱글 스레드는 셰프인 남편과 농장 관리 책임자인 아내가 이끄는 전통 일식 레스토랑이다. 농장에서 재배한 신선한 식재료를 사용해 가이세키, 스시 또는 스키야키 등 최고급 일식 요리를 제공한다.");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 브라우니(Brownies), 미국\n" +
                            "\n" +
                            "가장 오래된 레시피는 1906년에 발행된 패니 파머=의 “보스톤 요리학교 요리책”에서 달지 않은 초콜릿으로 쫀득한 질감의 브라우니를 만드는 법이었다. 그 후로 천년이상, 브라우니는 대표적인 디저트로서 많은 아이스크림의 형태이자, 다양한 맛의 상징이 되었다.\n" +
                            "\n" +
                            "☞ 초코칩 쿠키(Chocolate Chip Cookies), 미국\n" +
                            "\n" +
                            "대표적인 미국의 간식이다. 기본적인 크림버터 쿠키의 레시피로부터 믿을 수 없도록 여러가지 모습의 다양한 쿠키들이 탄생했다.  바삭한 가장자리를 느끼다보면 어느새 부드럽고 살살 녹은 가운데자리의 질감을 느끼게 된다.\n" +
                            "\n" +
                            "☞ 코코넛 케이크(Coconut Cake), 미국 남부\n" +
                            "\n" +
                            "탱글탱글한 버터 바닐라 파운드 케이크에 채썬 코코넛을 높게 올리고 7분 프로스팅 크림을 사용하는 이것은 전통적인 미국 남부 방식 디저트다. 빠지지 않는 모든 미국인의 대표 간식 중 하나라고 할 수 있다. 코코넛 케이크만의 독특한 형태는 미국에서 유래된 것이다.");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 버번 위스키(버번)\n" +
                            "\n" +
                            "미국 켄터키주 동북부의 지명인 ‘버번(Bourbon)’에서 생산되는 위스키를 바로 ‘버번 위스키’라 부른다. 옥수수를 주재료로 활용해 독특한 단맛을 가진 게 특징인 이 증류주는, 타 위스키와는 달리 매년 새 오크통(참나무통) 내부를 불에 그슬려 숙성시키기 때문에 바닐라 풍미마저 선사한다.\n" +
                            "\n" +
                            "☞ 데킬라\n" +
                            "\n" +
                            "멕시코에는 테킬라 마을이 있다. 테킬라 마을은 할리스코 주에 위치해 있다. 2가지 투어를 할 수 있는데 하루 반나절 소요되는 익스프레스 투어는 ‘테킬라 공장 , 테킬라 농장, 테킬라 저장소, 마리아치 공연 등이 포함되고 언제든지 테킬라 시음이 가능하다.\n" +
                            "\n" +
                            "☞ 맥주\n" +
                            "\n" +
                            "미국 맥주 도시로 유명한 그랜드래피즈는 30분 이내 차량 거리에 40개 이상의 아티잔 브루어리가 있어 모두를 만족시킬 수 있는 다양한 종류의 수제 맥주를 자랑한다. 여러 대회에서 수상한 경력을 통해 ‘맥주 애호가들의 천국’이라는 명성을 쌓아왔다.");
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
                    textView.setText("☞ 그랜드 프리즈매틱 스프링 Grand Prismatic Spring\n" +
                            "\n" +
                            "미국 옐로스톤 국립공원에 위치한 그랜드 프리즈매틱 스프링은 미국에서 가장 큰 규모의 온천이다. 약 60만년 전 대량의 마그마가 분출하면서 지각이 함몰되며 생긴 칼데라호이다. 빨강, 주황, 초록 등 다양한 색을 보여주는 특이하는 곳이며 과학자들이 주목하는 장소이기도 하다. 다양한 색이 나오는 이유는 수심과 빛의 산란 현상, 물속에 서식하는 박테리아 종류 때문이다. \n" +
                            "\n" +
                            "☞ 미에테 핫 스프링스\n" +
                            "\n" +
                            "장엄한 로키산맥으로 둘러싸인 온천 수영장을 만날 수 있는 알버타 재스퍼 국립공원(Jasper National Park)의 ‘미에테 핫 스프링스(Miette Hot Springs)’는 캐나다를 대표하는 온천이다. 원수의 온도는 54도지만, 수영장 온수는 항상 40도에 맞추고 있다. 수세기동안 황산염, 칼슘, 마그네슘이 풍부한 물의 효과를 증명한 온천으로, 온천으로 가는 동안 드라이브 즐기며 야생 동물을 마주하며 멋진 풍광을 즐길 수 있다.");
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
                    textView.setText("☞ 미국 하와이 아로하 페스티벌\n" +
                            "\n" +
                            "알로하 페스티벌은 하와이에서 열리는 행사로 9월 5일부터 26일 동안 개최가 된다.  축제는 하와이를 찾아오는 이방인들을 따스하게 맞아주기 위해 시작했다고 한다. 초대형 트레일러 트럭과 하와이 왕족들의 모습 등 여러 볼거리가 많다.\n" +
                            "\n" +
                            "☞ 멕시코의 디아 데 로스 무에르토스\n" +
                            "\n" +
                            "망자의 날 혹은 죽은 자의 날로 불리며 망자를 기리는 멕시코의 기념일이다. 죽은 친족과 사랑하는 사람들이 잠시나마 현생으로 돌아오는 것을 기리는 멕시코의 중요한 축일이다. 가족들은 묘지에서 집에 이르는 길에 꽃잎과 촛불 등을 놓아 영혼들이 현생으로 돌아올 수 있도록 도와준다. 대표적인 영화로 <코코>가 있다.\n" +
                            "\n" +
                            "☞ 빛의 축제\n" +
                            "\n" +
                            "매년 밴쿠버에서 개최되는 빛의 축제는 가장 크고 가장 유명한 축제로 세계에서 가장 오래 지속되는 해상 불꽃놀이 대회이다. 일반적으로 불꽃놀이 팀이 모여서 서로 경쟁하기 때문에 일주일 내내 개최된다. 빛의 축제는 일반적으로 매년 선택되는 특정 주제를 중심으로 진행된다.");
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
                    textView.setText("☞ 자유의 여신상\n" +
                            "\n" +
                            "뉴욕시의 다운타운에서 맨해튼의 해변에 온 이민자와 방문객 모두를 환영하는 거대한 조각상인 자유의 여신상을 방문하는 것을 추천한다. 이 유명한 동상은 높이가 93m에 달하며 보이는 그대로 숨이 멎을 정도로 아름답다.\n" +
                            "\n" +
                            "☞ 나이아가라 폭포\n" +
                            "\n" +
                            "뉴욕시와 캐나다 사이의 경계에 걸쳐 있는 나이아가라 폭포는 북미에서 가장 높은 유량을 자랑한다. 세 개의 폭포로 이루어진 이 경이로운 자연은 순수한 아름다움과 귀중한 수력 발전 자원으로도 유명하다. 나이아가라 시닉 트롤리에서 주변 풍경과 어우러지는 나이아가라 폭포를 감상하는 것을 추천한다.\n" +
                            "\n" +
                            "☞ 금문교\n" +
                            "\n" +
                            "샌프란시스코에서 해안을 따라 조금만 위로 이동하면 금문교가 나온다. 놀랍도록 아름다운 붉은색의 거대한 다리는 샌프란시스코와 태평양 사이를 잇는다. 소위 ‘현대 세계의 경이로움’이라 불리는 이곳은 사진이 매우 많이 촬영된 장소이다.");
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
                    textView.setText("☞ 성 요셉 대성당\n" +
                            "\n" +
                            "캐나다 퀘백에 있는 인도차이나의 수호성인 '성 요셉'의 이름을 따서 명명된 신고딕 양식의 가톨릭 성당이다. 1886년 프랑스 식민지 시절, 프랑스 파리의 '노트르담 대성당'을 모델로 설계되어, 우뚝 선 쌍둥이 종탑과 프랑스에서 공수한 스테인드글라스로 장식된 모습을 볼 수 있다. \n" +
                            "\n" +
                            "☞ 승리의 노트르담 대성당\n" +
                            "\n" +
                            "캐나다 퀘벡에 위치해 있는 북미에서 가장 오래된 성당이다. 승리의 노트르담 대성당은 캐나다에서 가장 오래된 석조 교회 중 하나로, 퀘벡의 역사가 시작된 곳에 자리잡고 있다. 퀘벡을 건설한 사뮈엘 드 샹플랭은 1608년 이곳에 최초의 정착지를 세웠다.\n" +
                            "\n" +
                            "☞ 그랜드 캐니언\n" +
                            "\n" +
                            "미국 창조과학 체험에서 빠지지 않고 등장하는 지역이 바로 그랜드 캐니언이다. 창조과학자들은 지질학자들이 150년 동안 그랜드 캐니언에 관해 연구했음에도 구체적 형성 원인과 주변 지각 변동 등에 대해 확실한 답을 내지 못한다고 말한다. 이 거대한 협곡의 생성은 노아의 방주와 대홍수와 관련 있다고 말한다.");
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
                    textView.setText("☞ 미션 인 호텔 앤드 스파\n" +
                            "\n" +
                            "미국에 위치한 미션 인 앤 스파는 고대 온천이 있는 곳에서 소노마 와인 컨트리의 독특한 휴양지를 제공한다. 경작지를 배경으로 한 스페인 식민지 부흥 고급 호텔이다. 호평을 받고 있는 레스토랑은 이 지역의 농장에서 식탁까지의 전통을 완벽하게 구현했다.\n" +
                            "\n" +
                            "☞ 벨라지오 호텔 : 분수 쇼 & 보타니컬 가든\n" +
                            "\n" +
                            "벨라지오 호텔은 전 세계 400개의 대표 호텔들이 가입한 ‘더 리딩 호텔스 오브 더 월드’에 소속돼 있다. 벨라지오 호텔에서 가장 유명한 것 중 하나가 벨라지오 분수 쇼다. 호텔 앞에 있는 라스베이거스의 랜드 마크, 벨라지오 분수에서는 정해진 시간마다 음악 분수 쇼를 진행한다.\n" +
                            "\n" +
                            "☞ 베네시안 호텔 : 그랜드 카날숍\n" +
                            "\n" +
                            "베네시안 호텔은 세계에서 두 번째로 큰 호텔로, 이곳은 물의 도시, 이탈리아 베네치아를 그대로 본 따 만든 호텔로, 언뜻 보기에는 호텔보다는 테마파크라는 말이 더 잘 어울린다. 이곳에는 인공 운하를 조성했는데, 베네치아를 그대로 옮겨놓은 모습을 볼 수 있다.");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ ‘슈퍼볼(Super Bowl)’\n" +
                            "\n" +
                            "전 세계에서 가장 많이 관람되는 스포츠인 슈퍼볼의 열기는 미국 전체를 마비시킬 정도로 뜨겁다. 경기 기간 동안에는 본 게임 외에도 현장 관람객들만이 누릴 수 있는 다양한 이벤트가 진행된다. \n" +
                            "\n" +
                            "☞ ‘NBA 올스타 게임(NBA All-Star Game)\n" +
                            "\n" +
                            "세계 최고의 프로 농구 리그인 NBA의 올스타 게임은 각 팀에서 최고의 실력을 가진 선수들이 참가하는 만큼 경기 기간 중 놓치지 말아야 할 하이라이트다. 올스타전은 평소 농구를 즐기는 팬이 아니더라도 경기장 안에서만 느낄 수 있는 뜨거운 열기와 흥겨운 분위기를 경험하는 것만으로도 관람할 가치가 충분하다.\n" +
                            "\n" +
                            "☞ ‘US오픈(U.S. Open)’\n" +
                            "\n" +
                            "US오픈 챔피언십은 남자 골프 경기의 4대 메이저 경기 중 하나로 꼽힌다. 본 경기에는 전 세계 TOP 60위 안에 드는 골프 선수들을 비롯해 연 내 진행된 주요 게임의 우승자들이 참여하게 된다.");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞ 몰 오브 아메리카, 블루밍턴, 미네소타\n" +
                            "\n" +
                            "미국에서 가장 큰 쇼핑몰 인 몰 오브 아메리카는 미니애폴리스 시내와 세인트 폴에서 불과 15 분 거리 인 미네소타 블루밍턴에 있다. 1992 년에 문을 연 몰 오브 아메리카는 연간 4 천만 명의 방문자가있는 세계에서 가장 많이 방문한 명소 중 하나이다. \n" +
                            "\n" +
                            "☞ 아벤 투라 몰, 아벤 투라, 플로리다\n" +
                            "\n" +
                            "세련되고 고급스러운 마이애미 지역에 위치한 아벤 투라 몰은 최신 유행의 현지인들이 고급 디자이너 옷을 찾는 곳이다. 1983 년부터 운영 된 플로리다의 쇼핑 기관으로 간주되는 3 층 쇼핑몰이다. 인상적인 300 개의 소매 공간과 6 개의 백화점으로 이루어져 있다.\n" +
                            "\n" +
                            "☞ 세인트 로렌스 시장\n" +
                            "\n" +
                            "캐나다에 있는 1803년 문을 열어 200년 이상의 전통을 가진 토론토 최초의 시장이다. 온타리오 각지와 더불어 캐나다 곳곳에서 재배된 식재료가 이곳으로 모여 '토론토의 부엌'이라고도 불린다. '노스 마켓'에서 매주 토요일에는 파머스 마켓이, 일요일에는 앤티크 마켓이 열려, 평소와는 색다른 구경거리를 즐길 수 있다.");
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