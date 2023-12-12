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
                    textView.setText("☞  The Inn at Little Washington\n" +
                            "\n" +
                            "격조 높은 시설과 서비스를 인정받아 ‘를레 앤 샤토’ 문장을 수여한 레스토랑이다. ‘를레 앤 샤토’는 유럽 각지에 분포된 부티크 호텔과 프리미엄 레스토랑을 묶은 국제 커뮤니티로 최고의 레스토랑 인증서다. 패트릭 오코넬 쉐프의 솜씨를 맛보기 위해 영국 여왕과 스페인 왕실도 발걸음할 정도로 유명한 식당이다.\n" +
                            "\n" +
                            "☞  Atelier Crenn\n" +
                            "\n" +
                            "아틀리에 크렌은 미국 최초의 미쉐린 3스타 여성 셰프인 도미닉 크렌(Dominque Crenn)이 이끄는 모던 프렌치 레스토랑이다. 도미닉 셰프는 시적인 요리(Poetic Culinaria)를 주제로 요리를 시로 형상화 한 코스요리를 선보인다.\n" +
                            "\n" +
                            "☞  SingleThread\n" +
                            "\n" +
                            "미국에 있는 개업 2년 만에 미쉐린 3스타의 영예를 안은 싱글 스레드는 셰프인 남편과 농장 관리 책임자인 아내가 이끄는 전통 일식 레스토랑이다. 농장에서 재배한 신선한 식재료를 사용해 가이세키, 스시 또는 스키야키 등 최고급 일식 요리를 제공한다.");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  브라우니(Brownies), 미국\n" +
                            "\n" +
                            "가장 오래된 레시피는 1906년에 발행된 패니 파머=의 “보스톤 요리학교 요리책”에서 달지 않은 초콜릿으로 쫀득한 질감의 브라우니를 만드는 법이었다. 그 후로 천년이상, 브라우니는 대표적인 디저트로서 많은 아이스크림의 형태이자, 다양한 맛의 상징이 되었다.\n" +
                            "\n" +
                            "☞  초코칩 쿠키(Chocolate Chip Cookies), 미국\n" +
                            "\n" +
                            "대표적인 미국의 간식이다. 기본적인 크림버터 쿠키의 레시피로부터 믿을 수 없도록 여러가지 모습의 다양한 쿠키들이 탄생했다.  바삭한 가장자리를 느끼다보면 어느새 부드럽고 살살 녹은 가운데자리의 질감을 느끼게 된다.\n" +
                            "\n" +
                            "☞  코코넛 케이크(Coconut Cake), 미국 남부\n" +
                            "\n" +
                            "탱글탱글한 버터 바닐라 파운드 케이크에 채썬 코코넛을 높게 올리고 7분 프로스팅 크림을 사용하는 이것은 전통적인 미국 남부 방식 디저트다. 빠지지 않는 모든 미국인의 대표 간식 중 하나라고 할 수 있다. 코코넛 케이크만의 독특한 형태는 미국에서 유래된 것이다.");
                }
            });
        }else if(NARA.equals("northamerica") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  버번 위스키(버번)\n" +
                            "\n" +
                            "미국 켄터키주 동북부의 지명인 ‘버번(Bourbon)’에서 생산되는 위스키를 바로 ‘버번 위스키’라 부른다. 옥수수를 주재료로 활용해 독특한 단맛을 가진 게 특징인 이 증류주는, 타 위스키와는 달리 매년 새 오크통(참나무통) 내부를 불에 그슬려 숙성시키기 때문에 바닐라 풍미마저 선사한다.\n" +
                            "\n" +
                            "☞  데킬라\n" +
                            "\n" +
                            "멕시코에는 테킬라 마을이 있다. 테킬라 마을은 할리스코 주에 위치해 있다. 2가지 투어를 할 수 있는데 하루 반나절 소요되는 익스프레스 투어는 ‘테킬라 공장 , 테킬라 농장, 테킬라 저장소, 마리아치 공연 등이 포함되고 언제든지 테킬라 시음이 가능하다.\n" +
                            "\n" +
                            "☞  맥주\n" +
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
                    textView.setText("☞  그랜드 프리즈매틱 스프링 Grand Prismatic Spring\n" +
                            "\n" +
                            "미국 옐로스톤 국립공원에 위치한 그랜드 프리즈매틱 스프링은 미국에서 가장 큰 규모의 온천이다. 약 60만년 전 대량의 마그마가 분출하면서 지각이 함몰되며 생긴 칼데라호이다. 빨강, 주황, 초록 등 다양한 색을 보여주는 특이하는 곳이며 과학자들이 주목하는 장소이기도 하다. 다양한 색이 나오는 이유는 수심과 빛의 산란 현상, 물속에 서식하는 박테리아 종류 때문이다. \n" +
                            "\n" +
                            "☞  미에테 핫 스프링스\n" +
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
                    textView.setText("☞  미국 하와이 아로하 페스티벌\n" +
                            "\n" +
                            "알로하 페스티벌은 하와이에서 열리는 행사로 9월 5일부터 26일 동안 개최가 된다.  축제는 하와이를 찾아오는 이방인들을 따스하게 맞아주기 위해 시작했다고 한다. 초대형 트레일러 트럭과 하와이 왕족들의 모습 등 여러 볼거리가 많다.\n" +
                            "\n" +
                            "☞  멕시코의 디아 데 로스 무에르토스\n" +
                            "\n" +
                            "망자의 날 혹은 죽은 자의 날로 불리며 망자를 기리는 멕시코의 기념일이다. 죽은 친족과 사랑하는 사람들이 잠시나마 현생으로 돌아오는 것을 기리는 멕시코의 중요한 축일이다. 가족들은 묘지에서 집에 이르는 길에 꽃잎과 촛불 등을 놓아 영혼들이 현생으로 돌아올 수 있도록 도와준다. 대표적인 영화로 <코코>가 있다.\n" +
                            "\n" +
                            "☞  빛의 축제\n" +
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
                    textView.setText("☞  자유의 여신상\n" +
                            "\n" +
                            "뉴욕시의 다운타운에서 맨해튼의 해변에 온 이민자와 방문객 모두를 환영하는 거대한 조각상인 자유의 여신상을 방문하는 것을 추천한다. 이 유명한 동상은 높이가 93m에 달하며 보이는 그대로 숨이 멎을 정도로 아름답다.\n" +
                            "\n" +
                            "☞  나이아가라 폭포\n" +
                            "\n" +
                            "뉴욕시와 캐나다 사이의 경계에 걸쳐 있는 나이아가라 폭포는 북미에서 가장 높은 유량을 자랑한다. 세 개의 폭포로 이루어진 이 경이로운 자연은 순수한 아름다움과 귀중한 수력 발전 자원으로도 유명하다. 나이아가라 시닉 트롤리에서 주변 풍경과 어우러지는 나이아가라 폭포를 감상하는 것을 추천한다.\n" +
                            "\n" +
                            "☞  금문교\n" +
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
                    textView.setText("☞  성 요셉 대성당\n" +
                            "\n" +
                            "캐나다 퀘백에 있는 인도차이나의 수호성인 '성 요셉'의 이름을 따서 명명된 신고딕 양식의 가톨릭 성당이다. 1886년 프랑스 식민지 시절, 프랑스 파리의 '노트르담 대성당'을 모델로 설계되어, 우뚝 선 쌍둥이 종탑과 프랑스에서 공수한 스테인드글라스로 장식된 모습을 볼 수 있다. \n" +
                            "\n" +
                            "☞  승리의 노트르담 대성당\n" +
                            "\n" +
                            "캐나다 퀘벡에 위치해 있는 북미에서 가장 오래된 성당이다. 승리의 노트르담 대성당은 캐나다에서 가장 오래된 석조 교회 중 하나로, 퀘벡의 역사가 시작된 곳에 자리잡고 있다. 퀘벡을 건설한 사뮈엘 드 샹플랭은 1608년 이곳에 최초의 정착지를 세웠다.\n" +
                            "\n" +
                            "☞  그랜드 캐니언\n" +
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
                    textView.setText("☞  미션 인 호텔 앤드 스파\n" +
                            "\n" +
                            "미국에 위치한 미션 인 앤 스파는 고대 온천이 있는 곳에서 소노마 와인 컨트리의 독특한 휴양지를 제공한다. 경작지를 배경으로 한 스페인 식민지 부흥 고급 호텔이다. 호평을 받고 있는 레스토랑은 이 지역의 농장에서 식탁까지의 전통을 완벽하게 구현했다.\n" +
                            "\n" +
                            "☞  벨라지오 호텔 : 분수 쇼 & 보타니컬 가든\n" +
                            "\n" +
                            "벨라지오 호텔은 전 세계 400개의 대표 호텔들이 가입한 ‘더 리딩 호텔스 오브 더 월드’에 소속돼 있다. 벨라지오 호텔에서 가장 유명한 것 중 하나가 벨라지오 분수 쇼다. 호텔 앞에 있는 라스베이거스의 랜드 마크, 벨라지오 분수에서는 정해진 시간마다 음악 분수 쇼를 진행한다.\n" +
                            "\n" +
                            "☞  베네시안 호텔 : 그랜드 카날숍\n" +
                            "\n" +
                            "베네시안 호텔은 세계에서 두 번째로 큰 호텔로, 이곳은 물의 도시, 이탈리아 베네치아를 그대로 본 따 만든 호텔로, 언뜻 보기에는 호텔보다는 테마파크라는 말이 더 잘 어울린다. 이곳에는 인공 운하를 조성했는데, 베네치아를 그대로 옮겨놓은 모습을 볼 수 있다.");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  ‘슈퍼볼(Super Bowl)’\n" +
                            "\n" +
                            "전 세계에서 가장 많이 관람되는 스포츠인 슈퍼볼의 열기는 미국 전체를 마비시킬 정도로 뜨겁다. 경기 기간 동안에는 본 게임 외에도 현장 관람객들만이 누릴 수 있는 다양한 이벤트가 진행된다. \n" +
                            "\n" +
                            "☞  ‘NBA 올스타 게임(NBA All-Star Game)\n" +
                            "\n" +
                            "세계 최고의 프로 농구 리그인 NBA의 올스타 게임은 각 팀에서 최고의 실력을 가진 선수들이 참가하는 만큼 경기 기간 중 놓치지 말아야 할 하이라이트다. 올스타전은 평소 농구를 즐기는 팬이 아니더라도 경기장 안에서만 느낄 수 있는 뜨거운 열기와 흥겨운 분위기를 경험하는 것만으로도 관람할 가치가 충분하다.\n" +
                            "\n" +
                            "☞  ‘US오픈(U.S. Open)’\n" +
                            "\n" +
                            "US오픈 챔피언십은 남자 골프 경기의 4대 메이저 경기 중 하나로 꼽힌다. 본 경기에는 전 세계 TOP 60위 안에 드는 골프 선수들을 비롯해 연 내 진행된 주요 게임의 우승자들이 참여하게 된다.");
                }
            });
        }else if(NARA.equals("northamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  몰 오브 아메리카, 블루밍턴, 미네소타\n" +
                            "\n" +
                            "미국에서 가장 큰 쇼핑몰 인 몰 오브 아메리카는 미니애폴리스 시내와 세인트 폴에서 불과 15 분 거리 인 미네소타 블루밍턴에 있다. 1992 년에 문을 연 몰 오브 아메리카는 연간 4 천만 명의 방문자가있는 세계에서 가장 많이 방문한 명소 중 하나이다. \n" +
                            "\n" +
                            "☞  아벤 투라 몰, 아벤 투라, 플로리다\n" +
                            "\n" +
                            "세련되고 고급스러운 마이애미 지역에 위치한 아벤 투라 몰은 최신 유행의 현지인들이 고급 디자이너 옷을 찾는 곳이다. 1983 년부터 운영 된 플로리다의 쇼핑 기관으로 간주되는 3 층 쇼핑몰이다. 인상적인 300 개의 소매 공간과 6 개의 백화점으로 이루어져 있다.\n" +
                            "\n" +
                            "☞  세인트 로렌스 시장\n" +
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
                    textView.setText("☞  D.O.M.\n" +
                            "\n" +
                            "의심할 여지 없이, 알렉스 아탈라는 세계적으로 가장 잘 알려진 브라질 요리사이다. 그는 자신의 음식을 \"생존 가능한 꿈\"으로 간주한다. 일부는 채식주의자인 브라질 전통 재료인 투쿠피, 잠부, 번데기 팜 하트 등 충분히 활용하고 신대륙 발견 이전의 아마존과 토착 요리를 중심으로 설계되다.\n" +
                            "\n" +
                            "☞  Aramburu\n" +
                            "\n" +
                            "나무에 매달린 이색적인 간식, 풍미와 섬세함이 가득한 바다에서 영감을 받은 가벼운 입질, 화산암 위의 쿠르테 꽃 튀김과 파타고니아 대하와 같은 맛있는 계절 음식은 모두 레콜레타 지역의 중심부에 위치한 이 레스토랑의 메뉴에 포함되어 있다.\n" +
                            "\n" +
                            "☞  Oteque\n" +
                            "\n" +
                            "리우 미식의 사원이라는 인상을 주기 때문에, 이곳의 놀라움은 입구에서 시작된다. 매력적인 식당은 높은 천장과 현대적인 산업 분위기를 자랑한다. 특별한 요리사인 알베르토 랜드그라프는 이 지역 최고의 생선과 해산물을 꾸준히 사용한 것을 바탕으로 손님을 모신다.");
                }
            });
        }else if(NARA.equals("southamerica") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  알파호레스(Alfajores), 남아메리카\n" +
                            "\n" +
                            "아르헨티나에서 페루까지 베이커리샵을 들어가보면 카운터 뒤에 높에 쌓여있던 이 부드럽고 속이 꽉찬 쿠키를 쉽게 찾을 수 있다. 이 비스킷을 한 입 바삭하게 베어물면 은은하게 조리된 연유로 만든 사탕 같은 카라멜로서 우유의 달콤한 맛이 퍼지기 시작하면서 풍성하고 부드러운 느낌이 가득차게 된다.\n" +
                            "\n" +
                            "☞  브라질 여단\n" +
                            "\n" +
                            "너무 많은 남미 음식과 마찬가지로,이 작은 퍼지 트 뤼프 공은 브라질에서 유명한 이야기이다. 유명한  에두아르도 고메스 의 이름을 딴 것으로 유명하다. 캐러멜과 초콜릿 향이 독특하다. 작은 종이 컵으로 그들을 제공하는 것이 전통적이다. \n" +
                            "\n" +
                            "☞  둘세 데 레체\n" +
                            "\n" +
                            "'둘세 데 레체(Dulce De Leche)'는 '달콤한 우유'라는 뜻으로, 우유를 카라멜 상태로 만들어 부드럽고 진한 카라멜 풍미가 특징인 아르헨티나 전통 디저트다. 연유를 천천히 열을 가해서 카라멜처럼 만든것으로 맛도 카라멜 맛 비슷하고 남미에서 인기 많은데 그 중에서도 아르헨티나에서 인기가 엄청나다.");
                }
            });
        }else if(NARA.equals("southamerica") && Food.equals("술")) {
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  까시예로 델 디아블로\n" +
                            "\n" +
                            "생산지가 칠레에 센트럴 밸리이며 스페인어로 Casillero del Diablo는 “악마의 셀러”라는 뜻이다.  샌트럴 밸리에서 재배 되며 충적토,암석질, 돌이 많은 토양과 화강암이 있는 산비탈 토양에서 만들어 지며 기후는 안데스 산맥의 뚜렷한 영향을 받은 지중해성 기후에서 자랐다.\n" +
                            "\n" +
                            "☞  Malbec\n" +
                            "\n" +
                            "아르헨티나 대표 레드 품종이다. 말벡 와인은 블랙체리와 같은 검은 빛깔에 가까운 과일의 풍부한 향이 나는 풀바디의 딥 퍼플 레드와인이다. 13도 - 14도 사이의 알코올 도수를 가지고 있다. 말벡 포도는 떼루아를 잘 표현하는 포도로 흙, 영양소, 기후 및 생산방법에 따라 그 맛이 독특한 방식으로 만들어진다.\n" +
                            "\n" +
                            "☞  피스코 샤워\n" +
                            "\n" +
                            "피스코 사워는 피스코에 과즙을 넣어 먹는 칵테일의 일종이다. 피스코 사워는 남아메리카의 대표적인 술로서 세비체 등의 남미 음식과 잘 어울린다. 페루 버전의 피스코 사워와 칠레 버전의 피스코 사워는 약간의 차이가 있다.");
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
                    textView.setText("☞  엘타티오\n" +
                            "\n" +
                            "칠레 북부 안데스 산맥의 평균 해발 4,320m(14,170피트)에 위치한 간헐천으로 가득 찬 지열 지대이다. 이것은 세계에서 세 번째로 큰 간헐천이며 남반구에서 가장 큰 간헐천이다. 'El Tatio'라는 이름에는 '오븐', '할아버지' 등 다양한 의미가 제시되었다.\n" +
                            "\n" +
                            "☞  푸콘 온천\n" +
                            "\n" +
                            "칠레의 빌라리카 국립 공원의 중심부에 있는 협곡을 따라 생성된 온천은 빨간선을 따라 약 20여 개의 온천이 있다. 아름다운 자연 풍경을 즐기며 온천을 할 수 있어서 세계 각국에서 관광객이 찾지만 이 곳을 가기 위해서는 약 20km의 비포장 도로를 달려야 한다.\n" +
                            "\n" +
                            "☞  폴케스\n" +
                            "\n" +
                            "우유니 사막 하면 광활한 소금 평원이 떠오르기 마련이다. 하지만 푸른 하늘이 바닥에 비칠 만큼 투명한 모습과는 다른 히든 스폿이 우유니에 숨겨져 있다. 그것은 바로 폴케스 온천 단지다. 해발 5000m에 있는 화산 지대인 솔데마냐나의 간헐천을 지나 소규모로 조성된 노천 온천이다.");
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
                    textView.setText("☞  리우 카니발\n" +
                            "\n" +
                            "브라질의 삼바축제로 유명한 리우 카니발은 매년 2월경에 열린다. 리우 카니발은 세계 3대 축제이자 축제의 왕이다. 포르투갈에서 브라질로 건너온 이주민들이 사순절 축제와 아프리카에서 끌려온 노예들의 춤과 타악기 연주가 합쳐져서 탄생한 축제가 리우 카니발이다.\n" +
                            "\n" +
                            "☞  오루로 카니발\n" +
                            "\n" +
                            "볼리비아의 오루로라는 도시의 카니발 축제이다. 2000년의 역사를 지닌 강렬한 색채의 볼리비아 가면과 직물 등을 볼 수 있다. 특히 악마의상과 가면을 쓰고 춤을 추는 ‘디아블라다 춤’은 오루로 카니발의 상징이다.\n" +
                            "\n" +
                            "☞  인티라이미\n" +
                            "\n" +
                            "태양신을 숭배했던 잉카인들에게 1년 중 가장 중요한 제사로 페루 현지에선 인티라이미라 부른다. '인티'는 태양, '라미는 축제'를 뜻한다. 1994년 예술가들이 재현한 것을 계기로, 지금까지 계속되면서 이제는 매년 세계 각지의 수많은 관광객들을 불러들이는 남미 3대 축제 중의 하나로 자리 잡게 됐다.");
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
                    textView.setText("☞  마추픽추\n" +
                            "\n" +
                            "페루에 있는 잉카 문명의 고대 요새 도시이다. 15세기에 남아메리카를 지배했던 잉카 제국에 의해 지어진 것으로 추정된다. 마추 픽추는 잉카 고전 양식으로 지어졌다. 접착제나 모르타르 등을 전혀 사용하지 않은 채 돌과 석재들을 쌓아 올려 만들어졌고, 주요 건물은 해시계, 태양의 신전, 세 창문의 방 등이 있다.\n" +
                            "\n" +
                            "☞  이구아스 폭포\n" +
                            "\n" +
                            "브라질 파라나 주(20%)와 아르헨티나 미시오네스 주(80%)의 국경의 이구아수강에 있는 폭포이다. 브라질 쪽에서는 폭포의 전경을 한눈에 보기 좋다. 그렇게 많은 폭포를 볼 수는 없지만, 폭포 줄기 하나 하나가 큰 것이 특징이다.\n" +
                            "\n" +
                            "☞  살라르데 우유니\n" +
                            "\n" +
                            "볼리비아에 있는 건조 호수로, '세상에서 가장 큰 거울', '우유니 소금사막'으로 불리며, 낮에는 푸른 하늘과 구름이 사막에 투명하게 반사되어 절경을 이루고 밤에는 하늘의 별이 호수 속에 들어 있는 듯한 장관을 연출해 해마다 방문객이 증가하고 있다.");
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
                    textView.setText("☞  메트로포리타나 대성당\n" +
                            "\n" +
                            "브라질리아 대성당은 브라질 브라질리아에 있는 로마 가톨릭교회 성당으로, 현재 브라질리아 대교구의 대성당이다. 오스카르 니에메예르가 설계하였고, 1970년 5월 31일 완공되었다. 대성당은 각 무게가 90톤 가까이 나가는 16개의 콘크리트 기둥이 쌍곡면 구조를 이루는 형태를 하고 있다.\n" +
                            "\n" +
                            "☞  산투아리오 돔 보스코\n" +
                            "\n" +
                            "브라질리아에 위치한 단일 본당 교회이다. 효과적인 조명은 맑은 별이 빛나는 하늘을 상징하는 12가지 색상(파란색에서 보라색까지)의 유리블록을 사용하였다 . 특히 눈길을 끄는 것은 7,400개의 무라노 유리 조각으로 만든 크리스탈 샹들리에로 높이가 약 3미터에 이릅니다.\n" +
                            "\n" +
                            "☞  거대 예수상\n" +
                            "\n" +
                            "거대 예수상은 브라질의 리우데자네이루에 있는 거대한 석상이다. 정식명칭은 구세주 그리스도상으로 높이 30m, 대좌 8m, 양팔의 길이 28m, 무게 635t의 규모다. 이 석상은 높이 710m의 코르코바두 산 정상에 있는데, 이곳에서는 멋진 전망을 즐길 수 있다.");
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
                    textView.setText("☞  소피텔 리우데자이네루\n" +
                            "\n" +
                            "브라질에 위치해 있고 로맨틱 한 분위기와 맛집 및 명소들로부터 가까운 걸로 유명한 소피텔 리우데자이네루이다. 리우데자네이루는 Parque Lage, Forte de Copacabana, Quinta da Boa Vista 을 포함한 멋진 역사적인 장소들로 알려져 있다.\n" +
                            "\n" +
                            "☞  마추 피추 생추어리 로지 바이 오리엔트 익스프레스\n" +
                            "\n" +
                            "와이나픽추와 가깝기 때문에 Machu Picchu Sanctuary Lodge By Orient-express Hotel 숙박 고객들은 마추픽추에서 가장 잘 알려진 관광명소들을 경험할 수 있다. 마추픽추는 마추픽추, Temple of the Sun, Temple of the Three Windows를 포함한 멋진 역사적인 장소들로 알려져 있다.\n" +
                            "\n" +
                            "☞  푸켓 메리어트 리조트 & 스파, 멀린 비치\n" +
                            "\n" +
                            "일광욕을 위한 최적의 장소인 리조트에서 백사장, 해변 레스토랑, 스노클링 등을 즐기며 시간을 보낼 수 있다. 시설 내 레스토랑 4곳 중 세계 요리, 정원 전망 등을 즐길 수 있는 곳에서 식사 시간을 가질 수 있다. 24시간 운영 피트니스 센터에서는 에어로빅 강습과 요가 강습을 받으실 수 있다.");
                }
            });
        }else if(NARA.equals("southamerica") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  코파카파바 비치\n" +
                            "\n" +
                            "브라질에 있는 코파카파바 비치는 리우데 자네이루 인근에 위치한 4km 떨어진 해변이다. 부드러운 백설 모래로 덮여 있으며 맨발로 자유롭게 걸을 수 있다. 해안에서 브라질 산, 끝없는 매끄러운 물과 그림 같은 배를 볼 수 있다. 서핑과 극단적 수영에 이상적인 거대한 파도가 특징이다.\n" +
                            "\n" +
                            "☞  마라카낭 경기장\n" +
                            "\n" +
                            "브라질 리우데자네이루에 위치한 세계 최대의 축구 경기장이다. 1950년 FIFA 월드컵의 개최를 목적으로 건설되었다. 브라질 축구의 성지로 불리며, 1950년 FIFA 월드컵 당시 브라질이 우루과이에게 역전패를 당하고 우승을 놓치고 말았으며, 그 경기는 마라카낭의 비극이란 이름으로 전해지고 있다. 브라질이 자국의 역사상 최초로 올림픽 남자 축구에서 우승하여 금메달을 땄던 곳으로도 유명하다.");
                }
            });
        }else if(NARA.equals("southamerica") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  코스타네라 센터\n" +
                            "\n" +
                            "남미에서 가장 높은 건물로 칠레 산티아고에 위치해 있다. 2,3층에는 향수와 쥬얼리, 시계 등을 구입할 수 있고, 여성 의류 전용 층에는 50개가 넘는 가게들이 있고, 그 밖에 남성의류나 아동 의류 등 각종 용품들도 있다.\n" +
                            "\n" +
                            "☞  El Ateneo Grand Splendid\n" +
                            "\n" +
                            "아르헨티나의 수도 부에노스 아이레스에 팔레르모 지역이 있다. El Ateneo Grand Splendid는 우리나라도 치면 대형 서점 중에 하나이다. 극장의 모습을 적극적으로 활용해 이색적인 인테리어를 갖춘 서점이다. 2019년에는 내셔널 지오그래픽에서 선정한 '세계에서 가장 아름다운 서점'에 뽑혔다.\n" +
                            "\n" +
                            "☞  상파울루 중앙시장\n" +
                            "\n" +
                            "브라질 상파울루에 있는 시립 시장이다. 1933년 식품 도소매로 문을 연 이곳의 역사는 현재 도시를 대표하는 미식 공간으로 자리 잡으며 그 명성을 이어가고 있다. 전통 모차렐라 치즈를 주재료로 한 샌드위치는 이곳에서 필수적으로 맛봐야 할 음식으로 손꼽히고 있다.");
                }
            });
        }

        //africa
        if(NARA.equals("africa") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  Wolfgat\n" +
                            "\n" +
                            "남아프리카 공화국 요하네스버그에 위치한 Wolfgat이다. Wolfgat은 해안가의 작은 마을인 패트너스에 위치하고 있다. 이곳에서는 지역의 식재료를 사용하여 레스토랑 메뉴를 구성하고 있으며, 특히 해산물 요리가 유명하다. 이 식당은 미슐랭 가이드에 의해 “아프리카 지역 최고의 식당”으로 선정되어 큰 주목을 받고 있다. \n" +
                            "\n" +
                            "☞  The Test Kitchen\n" +
                            "\n" +
                            "남아프리카 공화국 케이프타운에 위치하며, 2016년에 미슐랭 가이드에서 3성을 받았다. 루크 셰프는 자연과 조화로운 요리를 만들기 위해 지역의 신선한 재료를 사용한다. 특히, 지역에서 직접 공급받은 해산물과 육류는 더욱 맛을 더해준다. 또한, 루크 셰프는 과감하게 독특한 향과 맛을 섞어낸다는 것으로도 유명하다. The Test Kitchen은 세계적인 미슐랭 가이드에서 최고의 식당 중 하나로 꼽히며, 아프리카 대륙의 대표적인 맛집으로 자리 잡고 있다.");
                }
            });
        }else if(NARA.equals("africa") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  슈베끼야\n" +
                            "\n" +
                            "모로코에서 먹는 디저트로, 라마단에 주로 먹는 음식이지만 메디나 음식거리에서 가면 항상 볼 수 있다. 주재료는 밀가루와 깨, 그리고 꿀이고 밀가루와 곱게 갈은 깨를 섞어 튀겨 꿀에 적셔 먹는다.\n" +
                            "\n" +
                            "☞  밀크 타르트\n" +
                            "\n" +
                            "남아프리카공화국에서 가장 전통적인 디저트 중 하나이다. 우유와 계란, 밀가루와 설탕 등으로 만든 파이로 밑부분과 측면은 다른 파이와 같이 아삭한 편이지만 가운데 토핑은 젤리와 같으며 맛은 우유가 많이 들어간 커스터드와 같다.\n" +
                            "\n" +
                            "☞  꼬른 드 갸젤\n" +
                            "\n" +
                            "모로코의 디저트로 만드는 과정이 복잡하고 손이 많이 가는 디저트라서 기념일이나 특별한 식사 때만 먹는 디저트다. 오렌지꽃물로 향기를 입힌 아몬드를 갈아서 속에 채운 얇은 반죽을 가젤의 뿔모양으로 구부려 만든다. 모로코의 항구 도시인 테투안에서 가장 시각적으로 정교한 모양을 볼 수 있다.");
                }
            });
        }else if(NARA.equals("africa") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  아마룰라\n" +
                            "\n" +
                            "아마룰라는 남아프리카 공화국의 사바나에서만 자라는 '마룰라 나무'에서 수확한 열매로 만드는 크림 리큐어 제품이다. 흡사 우리나라에서 유명한 '베일리스'제품과 비슷하다고 생각하시면 된다. 제조 방법에서 마룰라 열매를 발효 시킨 후, 2번 증류하는 과정을 거쳐 알코올 추출과 신선한 크림을 첨가하여 만들어지기 때문에 부드러운 크림을 신선하게 맛볼 수 있다는 점이 큰 특징이다.\n" +
                            "\n" +
                            "☞  아라케\n" +
                            "\n" +
                            "아라케는 텔라(Tella), 테즈(Tej), 보르데(Borde)와 더불어 에티오피아의 대표적 전통주이자 지역주 중 하나이다. 이들 중 아라케는 에티오피아 남부의 타운이나 농촌 지역의 가정에서 주로 생산된다. 이 술은 일종의 ‘밀주’인 셈이다. 아라케의 도수는 35~45도에 달한다. 아라케의 주요 소비자는 농민과 타운 사람이다. 아라케는 옥수수를 주원료로 해서 만든 증류주이다.");
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
                    textView.setText("☞  케냐온천\n" +
                            "\n" +
                            "헬 게이트 국립공원은 화산에 강하게 영향을 받는 지역으로 여전히 거품이 솟아오르는 온천이 있으며, 뜨거운 모래가 있는 곳도 있다. 이 국립공원 밑의 화산 골짜기에서 뽑아낸 뜨거운 증기는 뱀처럼 뻗어있는 파이프를 통해 공원내의 거대한 지열발전소로 운반된다.\n" +
                            "\n" +
                            "☞  쳄카온천\n" +
                            "\n" +
                            "‘챔챔온천’으로도 불리며, 탄자니아에 위치해 있다. 쳄카는 스와힐리어로 “끓다”라는 뜻으로 온천을 의미한다. 황량한 사막 한 가운데 위치한 오아시스 같은 곳으로 외국인 관광객에게 현지인 가이드가 추천해주는 숨은 명소 중 한 곳으로 맑은 물에서 수영을 즐길 수 있는 것이 특징이다.");
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
                    textView.setText("☞  모로코 페즈의 신성한 음악 축제\n" +
                            "\n" +
                            "이 축제는 모로코의 페즈 시에서 한여름에 열리는 10일 간의 축하 행사이다. 신성한, 영적, 세계 음악의 주요 음악 전통을 선보이기 위해 만들어졌기 때문에 매년 축제에서 이슬람교, 유대교, 기독교, 힌두교 및 기타 종교의 예술가들이 상호 존중의 정신으로 함께 공연하는 것을 축하한다.\n" +
                            "\n" +
                            "☞  남아프리카 공화국 국제 재즈 페스티벌\n" +
                            "\n" +
                            "이 휴일은 남아프리카 케이프 타운에서 매년 기념된다. 매년 봄, 이 도시는 색소폰, 피아노, 베이스, 트럼펫을 중심으로 이틀 동안 모인 40,000명 이상의 재즈 애호가를 환영한다. 2000년 첫 개최 이후 3월 5개 스테이지로 진행되어 40명의 아티스트가 참여한다.\n" +
                            "\n" +
                            "☞  잔지바르 국제 영화제, 탄자니아\n" +
                            "\n" +
                            "도우 컨트리 페스티벌이라고도 하는 이 영화제는 탄자니아 잔지바르에서 매년 열리는 영화제로, 국제적 진흥과 영화 및 기타 문화 산업을 지역 사회 및 경제 성장의 도구로 발전시키는 것을 목표로 한다.");
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
                    textView.setText("☞  기자의 피라미드\n" +
                            "\n" +
                            "기자의 피라미드군은 이집트 기자 평원에 자리한 피라미드군이다. 기자의 대피라미드, 카프레의 피라미드, 멘카우레의 피라미드의 3대 피라미드를 비롯하여 그에 딸린 소규모 피라미드와 기자의 대스핑크스를 아우르는 명칭이다.\n" +
                            "\n" +
                            "☞  카르나크 신전\n" +
                            "\n" +
                            "이집트 남부 룩소르의 시가지 북부에 위치한 고대 유적이다. 고대 이집트를 넘어 현재까지도 세계에서 가장 넓은 종교 시설 중 하나이다. 카르나크는 옛 테베의 북쪽 절반을 지칭하는 지명으로, 그곳에 아몬 대신전을 중심으로 몬트, 무트 신전의 세 신전으로 구성된 신전군을 통틀어 카르나크 신전이라 한다.\n" +
                            "\n" +
                            "☞  바히아 궁전\n" +
                            "\n" +
                            "근대 모로코의 건축미와 정원의 아름다움을 대표하는 궁전으로, 각각 다른 분위기의 안뜰이 존재한다. 타일을 입힌 벽에 쌓인 넓은 공간의 안뜰, 자스민이나 부겐빌레아 등 푸른 초목이 무성한 안뜰이 아름답게 조성되어 있다.");
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
                    textView.setText("☞  The Heavenly Cathedral\n" +
                            "\n" +
                            "아프리카 이집트에 있는 천상의 대성당은 샴의 가장 새롭고 큰 교회이다. 2010년에 세계 10대 아름다운 교회 중 하나로 선정된 성당은 완공 당시 인상적인 프레스코 벽화와 창조와 종교적 벽화가 특징이다. 단 2년 만에 지어진 이 성당은 엘 무스타파 모스크의 쌍둥이 미나렛에서 멀지 않은 헤이 엘 누르 지역에 위치해 있다.\n" +
                            "\n" +
                            "☞  랄리 벨라 교회\n" +
                            "\n" +
                            "13세기 ‘새로운 예루살렘’이라 불린 이곳은 에티오피아 중앙의 산악지역에 자리 잡고 있다. 이곳에는 중세 암굴 교회 11채가 있고, 근방에는 원형 구조의 가옥으로 이루어진 전통 마을이 있다. 랄리벨라는 에티오피아 기독교의 성지로, 오늘날에도 여전히 순례자와 신자들이 찾는 곳이다.\n" +
                            "\n" +
                            "☞  야무수크로의 평화의 노트르담 대성당\n" +
                            "\n" +
                            "코트디부아르 수도 야무수크로에 위치한 초대형 가톨릭 대성당이다. 세계에서 가장 큰 성당 중 하나다. 초대 대통령이자 독재자인 펠릭스 우푸에부아니가 프랑스 식민통치에서 코트디부아르가 독립한 것을 기념해 건설했다.");
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
                    textView.setText("☞  라 마무니아, 마라케시, 모로코\n" +
                            "\n" +
                            "바, 테니스장이 있는 라 마무니아 호텔 마라케시은 마조렐 정원에서 차로 5분 거리에 있다. 라 마무니아는 So Lounge Marrakech 근처의 5성급의 디자인 호텔이다. 이 호텔은 마사지, 요가 강습을 무료로 이용할 수 있다.\n" +
                            "\n" +
                            "☞  싱기타 롯지, 크루거 국립공원, 남아프리카공화국\n" +
                            "\n" +
                            "신기타 · 스웨니 로지는 남아프리카의 크루거 국립공원, 스웨니 강변에 입지.  현대적이고 우아한 고급스러운 객실에 체류하면서 자연과 동물과의 친밀감과 숨결을 바로 옆에서 느낄 수 있다. 버락 오바마, 데이비드 베컴 부부가 아프리카에서 지낸 숙소로 유명한 아프리카의 대표 호텔이다.\n" +
                            "\n" +
                            "☞  로얄 만수르, 마라케시, 모로코\n" +
                            "\n" +
                            "쿠투비아 첨탑 및 마조렐 정원 근처에 있는 로얄 만수르 마라케시에서는 무료 유럽식 아침 식사, 무료 왕복 공항 셔틀, 18 개 골프 홀도 이용할 수 있다. 시설 내 스파인Le Spa du Royal Mansour에서 전신 트리트먼트, 타이 마사지, 디톡스 랩 등을 즐기며 느긋하게 휴식을 취할 수 있다.");
                }
            });
        }else if(NARA.equals("africa") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  Cheval Essaouira\n" +
                            "\n" +
                            "모로코에 위치한 에사우이라에서 피크닉과 함께 1시간에서 하루까지 지속될 수 있는 다양한 승마 옵션을 제공한다. 모든 산책은 해변, 모래 언덕, 숲 사이에서 공유된다. 에사우이라(Essaouira)의 내륙 지역을 발견하고 완전한 자유로움 속에서 해변을 질주할 수 있습다. 다양한 풍경을 발견할 수 있는 여러 경로가 가능하다. 승마는 초보자와 숙련된 라이더 모두가 이용할 수 있다. 모든 레벨에 적합한 말을 보유하고 있다. 편안함을 위해 긴바지와 운동화 착용을 권장한다.");
                }
            });
        }else if(NARA.equals("africa") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  SOHO Square\n" +
                            "\n" +
                            "이집트에 있는 소호스퀘어는 창의적으로 선도하는 통합 마케팅 서비스 기관이다. WPP 그룹은 2003년 WPP 그룹 회사의 리소스를 활용할 수 있는 여러 분야의 팀을 통해 고객에게 글로벌 솔루션을 제공하기 위해 설립되었다. \n" +
                            "\n" +
                            "☞  제마 엘 프나\n" +
                            "\n" +
                            "제마 엘 프나 광장은 모로코 마라케시의 주요 명소 중 하나이다. 백종원이 하는 프로그램인 ‘장사천재 백사장’ 촬영 장소이며, 유네스코에 의해 인류의 구전 및 무형 유산으로 지정되었던 장소이다. \n" +
                            "\n" +
                            "☞  칸 엘-칼릴리 시장\n" +
                            "\n" +
                            "이집트에 위치한 칸 엘-칼릴리 시장은 전통적인 분위기로 바쁜 바자회이다.  실제 입트의 카이로를 경험하고 싶다면 추천한다. 관광객과 이집트인 모두에게 큰 인기를 끌고있는 이 시장은 기념품, 보석류,  향수 및 향료와 같은 수많은 것을 판매한다.  또한 커피를 제공하는 여러 개의 작은 커피 숍이 있다.");
                }
            });        }

        //eu
        if(NARA.equals("eu") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  Enoteca Pinchiorri\n" +
                            "\n" +
                            "핀치오리의 요리는 화려하고 웅장한 스타일로 인기가 많은데, 이는 지나치게 까다롭거나 지나치지 않고 인상을 남기므로 모든 요리의 주요 초점은 재료의 맛이다. 훌륭한 코스의 향연은 불꽃놀이를 닮았으며, 각 코스는 점점 더 커지는 즐거움의 크레센도에서 마지막 코스보다 더 인상적이다.\n" +
                            "\n" +
                            "☞  오부이용\n" +
                            "\n" +
                            "분위기와 절묘하게 어우러지는 클래식 프렌치 요리들이 미감에 즐거움을 선사한다. 기본에 충실한 클래식 프렌치 요리를 합리적인 가격으로 제공한다는 셰프의 원칙이 잘 반영된 이곳에서는 요리와 공간의 절묘한 조화와 설득력이 느껴진다.\n" +
                            "\n" +
                            "☞  Sketch\n" +
                            "\n" +
                            "모우라 마조즈와 피에르 가그나테의 18C 즐거운 하우스만큼 즐겁고 화려하게 장식된 레스토랑은 거의 없다.  메인 '접시'는 여러 가지 보완적인 요리로 둘러싸여 있고, 곧 여러분의 테이블은 구조, 구성, 우아함, 무엇보다도 맛 면에서 뛰어난 각 요소와 함께 다양한 그릇으로 덮여 있다.");
                }
            });
        }else if(NARA.equals("eu") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  아펠슈트루델(Apfelstrudel), 오스트리아\n" +
                            "\n" +
                            "글루텐이 어떻게까지 변화할 수 있는지 배우고 싶다면 전통적인 슈트루델 도우를 만들어보세요. 농담이 아니라 굴리는 것이 아닌 단지 반죽을 늘리는 것만으로도 믿을 수 없이 얇게 펼쳐집니다. 전해내려오는 이야기로는 신문을 읽을 수 있을 정도로의 투명한 수준까지 늘려야 한다고 합니다.\n" +
                            "\n" +
                            "☞  바클라바(Baklava), 터키\n" +
                            "\n" +
                            "섬세한 여러겹의 층이 한입에 베어먹기 좋은, 시럽이 가득한 이 과자는 과거 오스만 제국의 유산에서 가장 달콤한 것 중 하나일 것입니다. 콘스탄티노플의 지배를 받은 적이 있는 레반트 지역이나 발칸 반도, 카프카스 산맥, 그리고 북아프리카에 이르기까지 인기있는 디저트입니다.\n" +
                            "\n" +
                            "☞  슈바르츠밸더 키르시토르테(Schwarzwälder Kirschtorte, Black Forest Cake), 독일\n" +
                            "\n" +
                            "동화와 산꼭대기의 성들과 함께 슈바르츠펠트 지역은 독일의 가장 감미로운 케이크와 이름이 같은 것으로 유명합니다. 초콜릿 케이크의 검은 층은 시큼한 체리 브랜디인 키르시바서(Kirschwasser)를 섞은 체리 시럽에 적시고 나서 얇은 초콜릿을 그 위에 올리고 휘핑크림과 신선한 체리를 넣었습니다.");
                }
            });
        }else if(NARA.equals("eu") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  와인\n" +
                            "\n" +
                            "프랑스는 지형과 토양, 기후 등 와인 생산에 필요한 조건이 완벽하게 갖추어져 있고 거기다가 역사도 오래되어 와인 문화도 상당히 발달되어 있다. 프랑스에서 재배되고 있는 품종은 130종이며 대표적인 품종으로는 피노 누아, 카베르네 소비뇽, 메를로, 카베르네 프랑, 샤르도네, 소비뇽 블랑 등이 있다.\n" +
                            "\n" +
                            "☞  상그리아\n" +
                            "\n" +
                            "와인 베이스 칵테일로, 스페인과 포르투갈의 전통 음료이다. 스페인어의 'sangre(피)' 라는 단어에서 유래되었으며, 붉은 색이 특징이다. 주 재료는 이름에 어울리는 적포도주이며, 여기에 다양한 과일들과 탄산수, 설탕 등을 넣어서 하루 정도 숙성시킨 후 얼음과 같이 넣어 마신다.\n" +
                            "\n" +
                            "☞  호가든\n" +
                            "\n" +
                            "벨기에의 맥주로 양조장이 위치한 플람스브라반트 지역의 마을 이름에서 따온 것이다. 잘 알려져 있는 기본형 호가든은 밀맥주 스타일이지만, 벨기에 맥주 답게 오렌지 껍질과 고수 씨앗을 넣어 만들기 때문에 향긋한 산미가 더해져 있다.");
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
                    textView.setText("☞  아델보덴\n" +
                            "\n" +
                            "스위스 최대 관광지인 인터라켄과 체르마트 사이에 자리 잡은 곳으로 스위스 전통가옥인 샬레들이 작은 마을을 채우고 있는 전형적인 스위스 산악 지역 중 하나이다. 그림 같은 풍경을 배경으로 노천온천을 즐길 수 있는 온천시설이 있따.\n" +
                            "\n" +
                            "☞  미슈콜츠\n" +
                            "\n" +
                            "헝가리 제2의 공업도시인 미슈콜츠는 동굴온천이 유명하다. 유럽에서 유일하게 천연 동굴 온천이 존재하는 온천탕으로 온도는 약 30도 정도로 미지근한 편이지만 관절염 치유에 효과가 있다고 알려져서 매우 인기가 많은 곳이다. \n" +
                            "\n" +
                            "☞  블루라군\n" +
                            "\n" +
                            "아이슬란드에 있는 가장 큰 해수 온천으로 신비롭기까지 한 온천스파를 경험할 수 있는 곳이다. 블루라군은 화산이 선물한 지열로 늘 40도가 넘는 스파시설이 있다.  블루라군의 물색깔은 아름다운  푸른색을 띠고 있는데 수질을 이루고 있는 미네랄과 규소, 그리고 각종 해조류 때문이라고 한다.");
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
                    textView.setText("☞  벨기에 뱅슈 카니발\n" +
                            "\n" +
                            "뱅슈는 벨기에 남서쪽 에노주의 작은 도시다. 카니발은 유네스코 세계문화유산으로 지정돼 있다. 남성 배우들을 ‘질’이라 부르는데, 화려한 드레스를 입고 밀랍 마스크와 독특한 전통 나막신을 신는다. 질들은 뱅슈 중심에 나타나 드럼 소리에 맞춰 춤을 추기도 하고, 손에 들고 있는 막대로 악귀를 쫓아주기도 한다.\n" +
                            "\n" +
                            "☞  스위스 프리스타일 취리히\n" +
                            "\n" +
                            "스포츠와 록음악의 열정이 만난다. 젊은이에게 인기 있는 겨울스포츠를 도심 속 축제의 소재로 재구성했다. 스노보더, 스케이트보더 등이 공중에서 몸을 뒤집고 점프하고 날아다닌다. 여기에 분위기를 돋우는 록·전자음악·펑크 등 각 장르 세계적 수준의 뮤지션이 함께한다.\n" +
                            "\n" +
                            "☞  스페인 발렌시아 불꽃 축제\n" +
                            "\n" +
                            "발렌시아에서는 매년 겨울의 끝과 봄의 시작을 기념하는 불꽃 축제가 열린다. 도시 곳곳에 전시되던 초대형 인형은 낮에는 감상하다가 자정이 되면 모두 불태워 버린다. 발렌시아 사람들은 절정의 순간을 맛보면서 지금까지의 자신을 반성하는 시간을 가진다고 한다.");
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
                    textView.setText("☞  에펠탑\n" +
                            "\n" +
                            "프랑스 파리의 상징적 건축물로, 1889년에 프랑스 혁명 100주년을 맞이하여 파리 만국 박람회를 개최하였는데 이 박람회를 상징할만한 기념물로 에펠 탑을 건축하였다. 박람회가 열린 마르스 광장에 출입 관문에 위치해있다. 프랑스의 대표 건축물인 이 탑은 격자 구조로 이루어져 파리에서 가장 높은 건축물이다.\n" +
                            "\n" +
                            "☞  콜로세움\n" +
                            "\n" +
                            "콜로세움은 고대 로마 시대의 건축물 가운데 하나로 로마 제국 시대에 만들어진 원형 경기장이다. 5만 명 이상의 관중을 수용할 수 있었다. 로마의 중심지에 위치하여 있고, 현재는 로마를 대표하는 유명한 관광지로 탈바꿈하였다.\n" +
                            "\n" +
                            "☞  루브르 박물관\n" +
                            "\n" +
                            "루브르 박물관은 프랑스 파리의 중심가인 리볼리가에 있는 국립 박물관이다. 소장품의 수와 질 면에서 메트로폴리탄 미술관, 대영박물관과 함께 세계적으로 손꼽히는 박물관이다. 현재의 건물은 루브르 궁전을 개조한 것으로, 파리의 센강 주변을 포함하여 세계유산으로 지정되어 있다.");
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
                    textView.setText("☞  사크레쾨르 대성당\n" +
                            "\n" +
                            "프랑스 파리 북부에 위치해 있는 성당으로 몽마르뜨 언덕에 위치하여 많은 관광객들이 있다. 성당 앞에는 잔다르크 동상이 있고, 비잔틴 양식으로 건축되었다. 성당 앞에 있는 계단은 멀리서 보면 천국으로 가는 듯한 느낌을 준다.\n" +
                            "\n" +
                            "☞  밀라노 대성당\n" +
                            "\n" +
                            "인상적인 소 첨탑으로 화려하면서 웅장한 느낌이 있는 대성당이다. 로마 가톨릭교회 종파로 입구는 청동문으로 만들어졌고 17세기에 지어졌다. 내부는 화려한 스테인드글라스 작품들을 볼 수 있고, 옥상으로 올라가면 밀라노 전경을 볼 수 있다.\n" +
                            "\n" +
                            "☞  사그라다 파밀리아\n" +
                            "\n" +
                            "스페인 바르셀로나에 위치한 전 세계적으로 가장 유명한 대성당이다. '사그라다'는 스페인어로 성스러운이라는 뜻을 가졌으며, 파밀리아는 가족을 뜻하기 때문에 성가족성당이라고도 불린다. 이 건물을 포함한 가우디의 작품들은 현재 유네스코 세계 문화 유산에 등재되었다.");
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
                    textView.setText("☞  벨베데레 스위스 퀄리티 호텔\n" +
                            "\n" +
                            "가장 스위스 스러운 전망이 물씬 풍기는 그린델발트는 사방이 산으로 둘러쌓인 아기자기한 마을이 매력적이다. 마을 자체로도 너무 아름다운 곳이라 스위스 간다면 꼭 들러야 하는 곳으로 추천한다. 스위스의 4계절 풍경을 호텔에서 즐길 수 있는 호텔이다.\n" +
                            "\n" +
                            "☞  안드로니스 럭셔리 스위트\n" +
                            "\n" +
                            "눈부신 푸른 바다와 하얀 마을의 풍경이 아름다운 산토리니는 풍경만 멋진게 아니라 호텔에서 특별한 시간을 보낼 수 있기 때문에 인기가 많은 허니문 대표 호텔이다. 산토리니에서 가장 인기 있는 호텔이면서 최고의 럭셔리 호텔이다.\n" +
                            "\n" +
                            "☞  마린칸토 호텔\n" +
                            "\n" +
                            "이탈리아 남부 절벽위에 지어진 알록달록 한 집, 파란 아말피 해안선의 풍경을 해안선을 따라 드라이브 하면서 즐겼던 아름다운 풍경이 매력적인 호텔이다. 편리한 위치와 멋진 뷰, 그리고 인피니티 풀과 전용 프라이빗 해변까지 완벽한 호캉스를 보낼 수 있는 곳이다.");
                }
            });
        }else if(NARA.equals("eu") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  파르크 데 프랑스\n" +
                            "\n" +
                            "파르크 데 프랭스는 프랑스 수도 파리에 위치해 있으며 1897년 7월 18일에 개장하였다. 개장 전 이 곳은 프랑스 혁명 전 프랑스 왕실이 사용하던 유원지였다. 파리를 연고로 하고 있는 클럽인 파리 생제르맹 FC의 홈구장이다. \n" +
                            "\n" +
                            "☞  무라토글로 테니스 아카데미\n" +
                            "\n" +
                            "프랑스 니스에 있는 아카데미는 제레미 샤디, 로라 롭슨, 세레나 월리엄스와 같은 세계 최고의 선수들을 지도한 패트릭 무라토글로는 자신의 이름을 딴 테니스 아카데미를 설립했다.\n" +
                            "\n" +
                            "☞  올드 트래포트\n" +
                            "\n" +
                            "“꿈의 경기장”이라는 별명을 갖고 있는 올드 트래포트는 가장 방문하고 싶은 축구 경기장으로 꼽힌다. 영국 최고의 명문 구단 맨체스터 유나이티드의 홈 구장으로, 현재 영국에서 웸블리 스타디움 다음으로 가장 큰 규모이다. 초록색 잔디와 팀 컬러인 붉은 좌석의 대비가 인상적이다.");
                }
            });
        }else if(NARA.equals("eu") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  Galeries Lafayette\n" +
                            "\n" +
                            "갤러리 라파예트는 파리의 9번가에 있는 오스만에 위치한 고급 백화점이다. 파리의 고풍스러움과 고급스러움을 집약한 곳이라 해도 과언이 아닐 이 백화점은 구경만으로도 가치 있는 곳이다.\n" +
                            "\n" +
                            "☞  Galleria Vittorio Emanuele ll\n" +
                            "\n" +
                            "바쁜 대도시 밀라노의 교통 중심지에 자리 잡은 갤러리아는 매혹적이고 호기심 많은 관광객들을 위한 곳이라 지칭한다면 딱 어울리는 장소이다. 밀라노의 고급 쇼핑 지역 중 한곳으로 간주되는 이 곳은 이탈리아에서 가장 큰 메가 스토어 중 하나 인 Feltrinelli Records뿐만 아니라 유명한 브랜드 및 레스토랑을 보유하고 있다.\n" +
                            "\n" +
                            "☞  Harrods\n" +
                            "\n" +
                            "1849년에 문을 연 헤롯 백화점은 무려 168년이나 된 런던의 오래된 백화점이다. 조명이 들어오는 밤에 보면 아주 아름답다. 실제로 헤롯 백화점은 유럽 최대 백화점으로 하루 동안 백화점을 다 보기엔 불가능이다.");
                }
            });
        }

        //asia
        if(NARA.equals("asia") && Food.equals("미슐랭")) {
            first_button.setText("미슐랭");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  르 플랜터 in 미얀마(Le Planteur)\n" +
                            "\n" +
                            "강변의 고풍스러운 대저택이 식당으로 되었다. 아시아에서 가장 아름다운 식당 중 한 곳으로 꼽히는 르 플랜터는 식민지풍의 외관은 물론 로맨틱한 실내 분위기까지 한 폭의 그림 같은 공간이다. 스웨덴의 미슐랭 스타 셰프인 에릭 에피세르가 선보이는 메뉴는 프렌치 요리를 기본으로 코스 메뉴와 단품 메뉴 모두 주문 가능하다.\n" +
                            "\n" +
                            "☞  라 메종 1888 in 다낭 (La Maison 1888)\n" +
                            "\n" +
                            "미슐랭 스타 셰프인 피에르 가니에르가 다낭에 문을 연 프렌치 레스토랑 라 메종 1888.은 CNN이 선정한 세계 10대 최고의 레스토랑으로 선정되었다. 이곳은 옛 프랑스 식민지 시대를 재현한 고전적인 분위기가 돋보이는 곳이다. \n" +
                            "\n" +
                            "☞  8 ½  오토 에 메조 봄바나 in 홍콩( 8 ½ Otto e Mezzo Bombana)\n" +
                            "\n" +
                            "‘화이트 트러플의 왕’이라는 별명을 가진 이탈리안 셰프 움베르토 봄바나가 오픈한 개인 레스토랑이다. 페데리코 펠리니 감독의 영화 제목을 따서 만든 이 식당은 유럽 외의 지역에서 가장 높은 미슐랭 스타를 받은 이탈리안 레스토랑이다.");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  첸돌(Cendol), 싱가폴\n" +
                            "\n" +
                            "싱가폴의 인기 있는 지역 특산물로 시원하고 부드러운 간식거리로 살짝 훈제향을 입히고 카라멜로 졸인 야자 설탕 시럽이 들어간 아이스 코코넛 밀크이다. 액체는 열대 판다누스(screw pine)의 잎에서 추출한 판단 쥬스로 화려한 빛깔을 낸, 녹색 쌀가루 젤리의 부드러운 국수가닥이 풍부하게 놓여있다. \n" +
                            "\n" +
                            "☞  단 타츠(Dan Tats), 홍콩\n" +
                            "\n" +
                            "홍콩 베이커리에 들어가면 에그 커스타드의 향기가 퍼진다. 한 손에 들고 먹기에 완벽한 크기인 단 타츠는 따뜻한 커스타드와 황홀하게 바삭거리는 껍질이 조화를 이루는 오븐에서 막 나왔을 때 가장 맛있다.\n" +
                            "\n" +
                            "☞  굴랍 자문(Gulab Jamun), 인도\n" +
                            "\n" +
                            "우유향이 가득한 졸여진 시럽 같은 이 인도의 튀김 간식은 단순한 도넛과는 다르다. 녹는 듯한 식감으로 만들기 위해 소의 우유나 물소의 우유를 약한 불에서 오랜 시간을 끓여서 농축한 코야 한 스쿱이 전통적인 굴랍 자문 도우의 기본이다.");
                }
            });
        }else if(NARA.equals("asia") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  사케(도호쿠)\n" +
                            "\n" +
                            "벼농사에 최적화된 기후 조건과 맑은 산천수가 흐르는 도호쿠는 일본 사케의 메카로 여겨진다. 사케는 일본에서 가장 유명한 술이다. 일본 사케는 2000년에 걸친 역사 속에서 생겨난 전통 제조법으로 생산한다. 쌀의 수확으로부터 사케 생산까지의 시간과 수고는 엄청나다.\n" +
                            "\n" +
                            "☞  보드카 박물관(상트페테르부르크)\n" +
                            "\n" +
                            "러시아에서 상트페테르부르크라는 지역에 유명한 보드카 박물관이 있다.  이곳에서는 여러 보드카 시음이 가능하다. 보드카는 호밀을 원료로 한다. 보드카의 특징은 소위 3무라고 하는데 무색, 무미, 무향으로 색깔이 없고, 맛이 없고, 냄새가 없다. 세계에서 가장 많이 생산되는 증류주다.\n" +
                            "\n" +
                            "☞  막걸리(포천시)\n" +
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
                    textView.setText("☞  대만, 베이터우\n" +
                            "\n" +
                            "타이베이시 베이터우구에 위치한 유황온천은 1894년에 발견되어서 대만 최고의 온천지로 자리 잡고 있다. 이곳에 베이터우석이라고 불리는 독특한 광물이 있는데, 이것은 라듐을 미량 함유하고 있어서 암과 관절염 치료에 유익하다는 이야기가 있다.\n" +
                            "\n" +
                            "☞  베트남, 나트랑\n" +
                            "\n" +
                            "베트남 지역인 나트랑에 위치한 '머드 온천'은 섬세한 입자의 흙을 사용해서 온천욕을 즐기는 명소로 알려져 있다. 피부 건강에 좋은 머드를 사용하기 때문에 여성 관광객들에게 특히 인기가 높은 여행지다. \n" +
                            "\n" +
                            "☞  일본, 교토\n" +
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
                    textView.setText("☞  대만 핑시 천등축제\n" +
                            "\n" +
                            "핑시 천등 축제는 매년 정월대보름을 기념하고자 거행되는 축제로, 역사로는 백년을 자랑한다. 소원과 축복을 하늘에 전하기 위해 천등을 띄우는 축제인데, 수천 개의 천등이 밤하늘 위로 높이 떠오르면서 아름다운 빨간 천등의 물결을 볼 수 있다.\n" +
                            "\n" +
                            "☞  인도 홀리 축제\n" +
                            "\n" +
                            "힌두력에서 한해의 마지막을 알리는 날로 홀리는 힌두교의 신화를 바탕으로 하고 있는 봄이 시작됐음을 축하하는 봄맞이 축제이다. 신화에 의하면, 힌두교의 영웅신 크리슈나와 그의 연인 라다가 얼굴과 몸에 물감을 칠하고 놀았는데, 이러한 이야기에서 축제가 유래되었다. 몸에 뿌리는 물감을 통해 갈등과 감정을 씻어내는 정화의 의미를 가진 축제이다.\n" +
                            "\n" +
                            "☞  보령머드축제\n" +
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
                    textView.setText("☞  타지마할\n" +
                            "\n" +
                            "인도 아그라에 위치한 무굴 제국의 대표적 건축물이다. 무굴 제국의 황제 샤 자한이 자신의 총애하였던 부인 아르주망 바누 베굼을 기리기 위하여 1632년에 건설하였다. 일반적으로 흰색 대리석 돔의 영묘가 가장 널리 알려져 있으나, 타지마할의 규모는 더 크다.\n" +
                            "\n" +
                            "☞  경복궁\n" +
                            "\n" +
                            "대한민국 서울에 위치한 경복궁은 조선 왕조 제일의 법궁이다.1395년 태조 이성계가 창건하였고, 1592년 임진 왜란으로 불타 없어졌다가, 고종 때인 1867년 중건 되었다. 흥선대원군이 주도한 중건된 경복궁은 500여 동의 건물들이 미로같이 빼곡히 들어선 웅장한 모습이었다.\n" +
                            "\n" +
                            "☞  만리장성\n" +
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
                    textView.setText("☞  빅 부다\n" +
                            "\n" +
                            "빅 부다는 태국 푸켓에 있는 높이 45m에 달하는 거대한 불상으로 산 정상에서 볼 수 있는 불상이다. 빅부다는 가오나키도산 해발 400m에 있는 높이 45m, 25m, 총 중량 1,000톤에 달하는 세계 최대의 불상이다. 불상 뿐만 아니라 해발 400m에서 내려다 보는 푸켓의 푸른 바다와 현지인들이 모여 사는 푸켓 타운을 볼 수 있다.\n" +
                            "\n" +
                            "☞  바투 동굴\n" +
                            "\n" +
                            "바투 동굴은 말레이시아의 수도 쿠알라룸푸르 북쪽으로 13km 떨어진 곳에 있는 석회암 동굴로 힌두교 성지이다.  바투 동굴은 길이 400m, 높이 100m의 웅장하고 신비로운 석회암 동굴이다. 가장 큰 동굴은 길이 400m, 높이 100m인데 이곳에 힌두교 신전이 세워져 있다.\n" +
                            "\n" +
                            "☞  쉐다곤 파고다\n" +
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
                    textView.setText("☞  파드마 리조트 우붓\n" +
                            "\n" +
                            "발리에 있는 파드마 우붓 리조트 수영장은 총 3개로 열대 우림과 마주하고 있는 인피니티 수영장은 무려 89미터의 길이로 유명하다. 수영장 옆 따뜻한 자쿠지, 밤에는 모닥불을 피워 놓는다. 산스트리트 어로 연꽃을 뜻하는 파드마 라는 이름처럼 건물 기둥 등에서 연꽃 모양을 많이 발견할 수 있다.\n" +
                            "\n" +
                            "☞  에메랄드 몰디브 리조트 앤 스파\n" +
                            "\n" +
                            "몰디브에 있는 에메랄드 몰디브 리조트 앤 스파는 5성급 럭셔리 리조트로 몰디브 섬 중에 Raa 환초의 북쪽에 위치해 있다. 리조트의 구조는 주변 자연과 영토를 보호하는데 지속적으로 초점을 두고 있어서 주변 환경과의 연결을 유지하기 위해 천연 재료로 지어졌다. \n" +
                            "\n" +
                            "☞  인터컨티넨탈 다낭 선 페닌슐라 리조트\n" +
                            "\n" +
                            "베트남에 있는 인터컨티넨탈 다낭 선 페닌슐라 리조트는 높은 명성을 자랑하는 La Maison 1888을 포함해 여러 고급 레스토랑을 운영 중이다. 전용 해변, 2개의 대형 야외 수영장, 스파를 보유한 고급 휴양지이다. 모든 객실은 고급스럽게 꾸며져 있으며, 전용 발코니를 갖추고 있다.");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  보라카이\n" +
                            "\n" +
                            "세일링 보트 투어는 필리핀의 보라카이 섬에서 즐길 수 있습니다. 무동력으로 운행되는 돛단배를 타고 시원한 바람을 느낄 수 있습니다. 보라카이 섬의 해변은 세계적으로 유명하고 많은 여행객들이 찾는 곳 중에 하나입니다.\n" +
                            "\n" +
                            "☞  우즈다오\n" +
                            "\n" +
                            "중국 싼야에 위치한 우즈다오 섬은 하이난 최고의 열대 휴양지입니다. 투명한 바닷물과 다양한 해양생물들이 있어서 스쿠버다이빙으로 유명한 곳입니다. 스쿠버다이빙 뿐만 아니라 모터보트, 바나나 보트, 패러세일링 등 여러 해양 스포츠를 즐길 수 있습니다.\n" +
                            "\n" +
                            "☞  발리\n" +
                            "\n" +
                            "발리는 인도네시아에 있는 지역입니다. 발리에는 해양스포츠로 서핑이 유명한데 서핑에 적절한 파도가 많이 들어오는 곳이라서 유명합니다. 발리에는 또 다른 스포츠인 요가를 즐길 수도 있습니다. 세계 곳곳에서 정글뷰에서 수련하는 요가를 하기 위해 찾아온다고 합니다.");
                }
            });
        }else if(NARA.equals("asia") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  Chatuchak Weekend Market\n" +
                            "\n" +
                            "짜뚜짝 구에 있는 방콕의 명소 ‘짜뚜(Chatuchak) 시장’은 태국에서 가장 큰 규모의 시장으로, 대부분 주말에만 가게를 오픈하여 ‘짜뚜짝 주말 시장’이라고 말한다. 약 15,000개가 넘는 크고 작은 가게와 노점이  있다. 특이한 음식과 독특한 아이템 등을 구경할 수 있다. 짜뚜짝 시장의  합리적인 가격이 가장 큰 장점이다.\n" +
                            "\n" +
                            "☞  The Dubai Mall(두바이 몰)\n" +
                            "\n" +
                            "아랍에미리트의 도시인 두바이에 있는 두바이 몰은 세계에서 가장 큰 쇼핑물 중에 하나로, 510만 면적의 규모를 가지고 있다. 세계에서 가장 큰 ‘두바이 분수’가 있으며 올림픽 경기장 규모의 두바이 아이스 링크와 아쿠아리움 등 여러 시설이 자리하고 있다. 두바이 몰에는 1300개의 소매점과 2개의 백화점이 있다. \n" +
                            "\n" +
                            "☞  파빌리온 KL\n" +
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
                    textView.setText("☞  아티카(미슐랭은 아니다)\n" +
                            "\n" +
                            "주 시드니 오페라 하우스에서 열렸던 호주 미식 여행 레스토랑 시상에서 멜번 식당 '아티카(Attica)'가 올해 최고의 레스토랑으로 선정됐다. 미식 여행 잡지 수석 비평가인 패트 놀스씨는 \"레스토랑 '아티카'는 리폰리 교외지역에 위치해 있지만, 호주를 대표하는 식당\"이라며 극찬했다. 아티카의 벤 슈리 등 호주 대표 요리사 셋은 이제껏 맛보지 못한 요리를 만드는 데 아무런 제약도 선입견도 없었다고 한다. 레드 캥거루 고기에 호주 원주민들이 6만년 전부터 먹어온 토종 견과류를 곁들였다. 잘게 다진 다시마를 섞어 감칠맛이 터져 나올 듯 진한 버터를 바른 바닷가재 장작구이는 다시마를 기본 육수로 사용하는 일본 요리의 영향이 보였다.");
                }
            });
        }else if(NARA.equals("os") && Food.equals("디저트")){
            first_button.setText("디저트");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  요정빵\n" +
                            "\n" +
                            "페어리 브레드는 흰 빵을 얇게 썰어 버터나 마가린을 바르고 덮어 호주와 뉴질랜드의 어린이 파티에서 자주 내놓는다. 일반적으로 삼각형으로 잘린다. 요정빵은 버터나 마가린을 바른 얇게 썬 흰 빵에 스프링클이 덮여 있다. 호주나 뉴질랜드에서 아이들이 생일파티에 먹을 간식으로 대표적인 빵이다. \n" +
                            "\n" +
                            "☞  롤리 케이크\n" +
                            "\n" +
                            "롤리 케이크 또는 롤리 로그는 \"롤리\"를 주재료로 하는 뉴질랜드 케이크 또는 과자이다. 롤리 케이크는 1940년대에 먹은 것으로 알려져 있지만 일반적으로 슈퍼마켓에서는 1960년대까지 구할 수 없었다. 이 케이크는 \"초콜릿 살라미\"나 \"피프틴즈\"와 비슷하다.\n" +
                            "\n" +
                            "☞  미트 파이\n" +
                            "\n" +
                            "미트 파이는 오스트레일리아와 뉴질랜드의 파이이다. 다진 고기와 그레이비를 넣어 만든 손바닥 크기의 고기 파이로, 가벼운 식사나 간식 등으로 먹는다. 오스트레일리아와 뉴질랜드의 국민 음식 가운데 하나로 여겨진다.");
                }
            });
        }else if(NARA.equals("os") && Food.equals("술")){
            first_button.setText("술");
            first_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  크라운라거\n" +
                            "\n" +
                            "호주 맥주 중에 가장 인기있는 맥주이다. 제작 당시의 독창적인 페인팅 기술과 오직 한 붓을 사용해 디자인 해서 제작하였다. 청량감을 가지는 맥주는 라거라고 한다. 호주 프리미엄 고급 라거이며 풍부한 거품이 특징이라서 잔에 따라 마시는 것을 추천한다.\n" +
                            "\n" +
                            "☞  소비뇽 블랑\n" +
                            "\n" +
                            "빌 & 로스 스펜스 형제가 1969년 뉴질랜드 북서부의 오클랜드 포도원의 새로운 포도 품종을 심었을 때 그 나라의 대표적인 품종 중 하나가 되었다. 신선도, 산미, 과실미가 느껴지는 소비뇽 블랑은 전 세계의 수백만 명의 사람들이 찾고 있는 와인이다.\n" +
                            "\n" +
                            "☞  쉬라즈\n" +
                            "\n" +
                            "와인애호가에게 호주 와인중에서 가장 좋아하는 포도품종은 무엇인가요 라고 물었을 때 자주 듣게 되는 품종명이 쉬라즈이다. 호주의 레드 와인이 유명해진 까닭은 쉬라즈의 공헌이 크다고 할 수 있다. 가장 대표적인 것으로는 펜폴즈가 생산하는 그랜지이다.");
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
                    textView.setText("☞  핫워터비치\n" +
                            "\n" +
                            "바다 풍경 벗삼아 온천수에 몸을 품 담그고 싶다면 뉴질랜드 북섬 코로만델 반도에서 가장 유명한 ‘핫워터비치’가 딱이다. 이 곳은 화산 활동으로 인해 모래사장에서 온천수가 보글거리며 솟아오르는 이색 풍경을 만날 수 있는 곳이다.  \n" +
                            "\n" +
                            "☞  테카포 스프링스,\n" +
                            "\n" +
                            "별빛 쏟아지는 별밤 온천을 즐기는 낭만에 젖어보고 싶다면 ‘테카포 스프링스’을 추천한다. 테카포 스프링스는 세계 최대 규모의 별빛 보호구가 있는 남섬의 ‘아오라키 매켄지 국제 밤하늘 보호구’의 중심에 자리하고 있다. 아름다운 별무리 아래 야간 온천을 즐기며 힐링을 느낄 수 있다.\n" +
                            "\n" +
                            "☞  로토루아의 폴리네시안 스파\n" +
                            "\n" +
                            "뉴질랜드 최고의 세계적인 온천 스파로 로토루아 호수가 굽어보이는 폴리네시안 스파는 멋진 온천욕장이 조화를 이루며 한 자리에 모여 있는 종합 온천장이다. 로토루아의 유명한 유황 지열 온천수에서 목욕을 하고, 미용과 치료를 겸한 특별한 온천 스파에서 휴식을 취할 수 있다.");
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
                    textView.setText("☞  뭄바 페스티벌\n" +
                            "\n" +
                            "뭄바는 원주민 언어로 ‘함께 모여 놀자’라는 뜻으로 매년 노동자의 날 주말동안 호주의 다문화를 경험하는 장이다. 행사 기간에는 다양한 공연과 먹거리뿐만 아니라 발명한 기구를 장착하고 강에 뛰어드는 버드맨 대회도 열려 볼거리를 선사한다. 마지막 날 신나는 퍼레이드와 야라 강 불꽃놀이로 마무리되는 시민 축제다.\n" +
                            "\n" +
                            "☞  퓨처 뮤직 페스티벌\n" +
                            "\n" +
                            "2006년도부터 매년 2월말에서 3월 초에 개최되는 호주 최대의 댄스 뮤직 페스티벌이다.  2007년부터 시드니를 포함, 브리즈번, 멜버른, 애들레이드, 퍼스에서 열리고 있다. 주로 일렉트로닉, 댄스, 인디 록 장르의 세계적인 아티스트들을 초청한다.\n" +
                            "\n" +
                            "☞  Vivid Sydney\n" +
                            "\n" +
                            "빛과 음악, 아이디어의 세 가지 요소를 주제로 시드니의 겨울을 화려하게 수놓는 세계 최대 빛 축제이다. 2009년 시드니의 겨울 상권을 부흥시키기 위해 시작된 이래 최고의 디자이너와 아티스트들이 참여하여 매년 150만 명 이상이 관람하는 호주 대표 축제로 자리 잡았다.");
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
                    textView.setText("☞  시드니 오페라 하우스\n" +
                            "\n" +
                            "오스트레일리아 뉴사우스웨일스주 시드니에 있는 공연장이다. 1547석의 오페라 극장과 2679석의 음악당을 비롯해 여러 개의 극장, 전시관, 도서관 등이 있다. 이곳은 가장 유명하고 인상적인 20세기의 건축물 가운데 하나로, 세계에서 가장 유명한 공연장 중 하나 이다.\n" +
                            "\n" +
                            "☞  시드니 하버 브리지\n" +
                            "\n" +
                            "오스트레일리아 시드니에 있는 다리이다. 시드니 도심에 위치한 철제 아치교로, 세계에서 8번째로 긴 아치교이다. 아치교 특유의 디자인으로 인해 시드니 지역 사람들에게는 \"옷걸이(The Coat Hanger)\"라는 애칭으로 불리기도 한다.\n" +
                            "\n" +
                            "☞  달링 하버\n" +
                            "\n" +
                            "화려한 강변을 끼고 있는 시드니 중심부 달링 하버는 수족관과 멋진 레스토랑 같은 관광 명소가 있는 많은 볼거리로 채워진 구역이다. 가장 인기 있는 관광 명소 두 곳은 시라이프 시드니 수족관과 와일드 라이프 시드니 동물원이다. 야생 동물을 아주 가까이에서 볼 수 있고 상어와 듀공도 관찰할 수 있다.");
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
                    textView.setText("☞  시드니 세인트 메리 대성당\n" +
                            "\n" +
                            "세인트 메리 대성당은 오스트레일리아 시드니에 위치한 고딕 양식의 로마 가톨릭 대성당으로, 시드니 대교구 대성당이다. 시드니 하이드 파크 동쪽에 자리잡고 있는데, 하이드 파크와의 사이에 칼리지 스트리트라 불리는 큰길이 나 있다.\n" +
                            "\n" +
                            "☞  세이트 패트릭 대성당\n" +
                            "\n" +
                            "고딕 양식을 훌륭하게 재현한 건축물 중 하나로 널리 인정받는 곳이다. 19세기에 멜버른의 아일랜드 가톨릭 신자들을 위해 건축되었다.세인트패트릭 성당에 다가서면 눈에 띄게 어두운 건물 외관에 주목하게 된다. 이 같은 빛깔을 띠는 이유는 건축 당시 사용된 현지 청회색 사암 때문이다.\n" +
                            "\n" +
                            "☞  Nan Tien Temple\n" +
                            "\n" +
                            "Nan Tien Temple은 호주 울런공 남쪽 외곽에 있는 버클리 에 위치한 불교 사원 단지다. 난티엔은 대만 불광산 불교 종단의 분교 중 하나이며 , 전 세계적으로 120개 이상의 분교를 보유하고 있다. 이 사원은 남반구에서 가장 큰 불교 사원 중 하나이다.");
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
                    textView.setText("☞  더 칼릴, 브리즈번, 호주\n" +
                            "\n" +
                            "더 칼릴 호텔에서 차로 5분 거리에는 로마 스트리트 파크랜드 및 선콥 스타디움도 있다. 이곳 스파에서는 마사지, 바디 랩, 매니큐어 및 페디큐어 등을 받을 수 있고, 4 개의 레스토랑 중 하나인 The Lobby Bar에서는 아침, 점심 및 저녁 식사가 가능하다. \n" +
                            "\n" +
                            "☞  힐튼 시드니\n" +
                            "\n" +
                            "이 고급 호텔은 하이드 파크에서 도보 5분, 달링 하버에서 도보 10분, 시드니 오페라 하우스에서 2km 거리에 있다. 루프탑 테라스와 난로가 있는 세련된 칵테일 바에서는 라이브 공연을 즐길 수 있다. 기타 편의시설로는 실내 수영장, 헬스장, 회의 및 컨퍼런스 시설이 있다.\n" +
                            "\n" +
                            "☞  InterContinental Hayman Island Resort\n" +
                            "\n" +
                            "변에서 몇 걸음 떨어져있는이 바다 전망의 고급 리조트는 그레이트 배리어 리프의 외딴 섬에 있다. 쾌적한 객실, 스위트 룸, 빌라에는 통 유리창과 정원 또는 바다 전망의 발코니가 있다. 다른 고급 레스토랑 4 곳과 우아한 바, 야자수가 늘어선 넓은 야외 수영장, 스파, 피트니스 센터, 유료 수상 스포츠도 이용할 수 있다.");
                }
            });
        }else if(NARA.equals("os") && Gita.equals("스포츠")){
            fifth_button.setText("스포츠");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  솔로몬제도\n" +
                            "\n" +
                            "태평양의 수많은 다른 섬에서처럼, 솔로몬 제도를 여행하는 여행자에게 가장 큰 매력은 다이빙이다. 웅장한 산호초와 2차세계대전 때에 파괴된 수백척의 난파선이 스쿠버 다이빙, 스킨 다이빙, 스노쿨링에 좋은 장소이다. \n" +
                            "\n" +
                            "☞  남섬\n" +
                            "\n" +
                            "퀸스타운에서 번지점프를 하고, 와나카에서 스카이다이빙을 하고, 남섬의 이곳저곳에서 패러글라이딩과 집라인에 도전해 볼 수 있다. 독특한 체험을 원한다면 세계에서 가장 높은 폭포에서 케이블을 이용해 암벽등반을 즐길 수 있는 와일드와이어 와나카를 추천한다.\n" +
                            "\n" +
                            "☞  피지\n" +
                            "\n" +
                            "피지를 이루는 333개 섬은 각 섬마다 독특한 지형과 해변, 산호초의 형태, 리조트 시설을 갖추고 있어 섬과 섬을 돌아다니는 아일랜드 호핑이나 크루즈를 타고 다양한 섬들을 보며 체험하는 해양스포츠 등을 즐기기 좋다.");
                }
            });
        }else if(NARA.equals("os") && Gita.equals("쇼핑")){
            fifth_button.setText("쇼핑");
            fifth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText("☞  퀸 빅토리아 마켓\n" +
                            "\n" +
                            "퀸 빅토리아 마켓은 호주 멜버른의 놀라운 음식 문화의 중심지이며, 미식가를 위한 필수 코스이다. 시장 노점상이 늘어선 마을을 둘러보며 수상 경력에 빛나는 신선한 농산물과 맛있는 별미를 맛볼 수 있다. 기념품, 과일, 옷가지 등을 저렴하게 판매한다. 일주일에 두 번 정도 쉰다. \n" +
                            "\n" +
                            "☞  퀸 빅토리아 빌딩 (QVB)\n" +
                            "\n" +
                            "퀸 빅토리아 빌딩은 오스트레일리아 시드니 중심 업무 지구에 있는 건물로 각종 브랜드 상점이 입점한 쇼핑센터로 활용된다. 시드니 마켓을 대체하기 위해 만들어진 건물로 로마네스크 양식과 비잔틴 양식을 혼합하여 1898년 조지 맥래이에 의해 디자인 되었다.\n" +
                            "\n" +
                            "☞  살라망카 마켓\n" +
                            "\n" +
                            "살라망카 마켓은 태즈매니아에서 가장 많이 방문하는 관광 명소 중 하나이며 우수성으로 많은 상을 받았다. 시장에는 300개가 넘는 노점상이 있으며 매주 토요일 오전 8시 30분부터 오후 3시까지 운영된다. 다양한 현지 생산 제품을 둘러볼 수 있다.");
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