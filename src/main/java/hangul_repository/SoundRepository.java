package hangul_repository;

import java.util.HashMap;
import java.util.Map;

public interface SoundRepository {
    Map<String, String> sound = new HashMap<>() {{
        put("gak", "각"); put("ga", "가"); put("gan", "간"); put("gal", "갈"); put("gam", "감");
        put("gat", "갓"); put("gap", "갑"); put("gang", "강"); put("gae", "개"); put("gaek", "객");
        put("geon", "건"); put("geo", "거"); put("geol", "걸"); put("geom", "검"); put("geop", "겁");
        put("gyeo", "겨"); put("ge", "게"); put("gyeok", "격"); put("gyeon", "견"); put("gyeol", "결");
        put("gyeop", "겹"); put("gyeom", "겸"); put("gyeong", "경"); put("gye", "계"); put("go", "고");
        put("gon", "곤"); put("gok", "곡"); put("gol", "골"); put("got", "(곳/곶)"); put("gong", "공");
        put("gwa", "과"); put("gwak", "곽"); put("gwan", "관"); put("gwal", "괄");
        put("gwae", "괘"); put("gwang", "광"); put("goe", "괴"); put("goeng", "굉"); put("gyo", "교");
        put("guk", "국"); put("gu", "구"); put("gun", "군"); put("gul", "굴"); put("gut", "굿");
        put("gwon", "권"); put("gung", "궁"); put("gwol", "궐"); put("gwi", "귀"); put("gyu", "규");
        put("gyul", "귤"); put("gyun", "균"); put("geu", "그"); put("geuk", "극"); put("geun", "근");
        put("geum", "금"); put("geul", "글"); put("geup", "급"); put("geung", "긍"); put("gi", "기");
        put("gil", "길"); put("gin", "긴"); put("gim", "김"); put("kka", "까"); put("kkae", "깨");
        put("kkok", "꼭"); put("kko", "꼬"); put("kkot", "꽃"); put("kkoe", "꾀"); put("kku", "꾸");
        put("kkeut", "끝"); put("kkum", "꿈"); put("kki", "끼"); put("sso", "쏘"); put("ssae", "쌔");
        put("na", "나"); put("nak", "낙"); put("nan", "난"); put("nal", "날"); put("nam", "남");
        put("nae", "내"); put("naeng", "냉"); put("neo", "너"); put("neol", "널"); put("ne", "네");
        put("nyeo", "녀"); put("nyeok", "녁"); put("nyeon", "년"); put("nyeom", "념"); put("nyeong", "녕");
        put("no", "노"); put("nok", "녹"); put("non", "논"); put("nol", "놀"); put("nong", "농");
        put("noe", "뇌"); put("nu", "누"); put("nun", "눈"); put("nul", "눌"); put("neu", "느");
        put("neuk", "늑"); put("neum", "늠"); put("neung", "능"); put("nui", "늬"); put("ni", "니");
        put("nik", "닉"); put("nin", "닌"); put("nil", "닐"); put("nim", "님"); put("nang", "낭");
        put("dan", "단"); put("dal", "달"); put("dam", "담"); put("dap", "답"); put("dang", "당");
        put("dae", "대"); put("daek", "댁"); put("deo", "더"); put("deok", "덕"); put("do", "도");
        put("dok", "독"); put("don", "돈"); put("dol", "돌"); put("dong", "동"); put("dwae", "돼");
        put("doe", "되"); put("doen", "된"); put("du", "두"); put("duk", "둑"); put("dun", "둔");
        put("dwi", "뒤"); put("deu", "드"); put("deuk", "득"); put("deul", "들"); put("deung", "등");
        put("di", "디"); put("tta", "따"); put("ttang", "땅"); put("ttae", "때"); put("tto", "또");
        put("ttu", "뚜"); put("ttuk", "뚝"); put("tteu", "뜨"); put("tti", "띠"); put("da", "다");
        put("rak", "락"); put("ran", "란"); put("ram", "람"); put("rang", "랑"); put("rae", "래");
        put("raeng", "랭"); put("ryang", "량"); put("reong", "렁"); put("re", "레"); put("ryeo", "려");
        put("ryeok", "력"); put("ryeon", "련"); put("ryeol", "렬"); put("ryeom", "렴"); put("ryeop", "렵");
        put("ryeong", "령"); put("rye", "례"); put("ro", "로"); put("rok", "록"); put("ron", "론");
        put("rong", "롱"); put("roe", "뢰"); put("ryo", "료"); put("ryong", "룡"); put("ru", "루");
        put("ryu", "류"); put("ryuk", "륙"); put("ryun", "륜"); put("ryul", "률"); put("ryung", "륭");
        put("reu", "르"); put("reuk", "륵"); put("reun", "른"); put("reum", "름"); put("reung", "릉");
        put("ri", "리"); put("rin", "린"); put("rim", "림"); put("rip", "립"); put("ra", "라");
        put("mak", "막"); put("man", "만"); put("mal", "말"); put("mang", "망"); put("mae", "매");
        put("maek", "맥"); put("maen", "맨"); put("maeng", "맹"); put("meo", "머"); put("meok", "먹");
        put("me", "메"); put("myeo", "며"); put("myeok", "멱"); put("myeon", "면"); put("myeol", "멸");
        put("myeong", "명"); put("mo", "모"); put("mok", "목"); put("mol", "몰"); put("mot", "못");
        put("mong", "몽"); put("moe", "뫼"); put("myo", "묘"); put("mu", "무"); put("muk", "묵");
        put("mun", "문"); put("mul", "물"); put("meu", "므"); put("mi", "미"); put("min", "민");
        put("ba", "바"); put("bak", "박"); put("ban", "반"); put("bal", "발"); put("ppi", "삐");
        put("bap", "밥"); put("bang", "방"); put("bae", "배"); put("baek", "백"); put("baem", "뱀");
        put("beo", "버"); put("beon", "번"); put("beol", "벌"); put("beom", "범"); put("beop", "법");
        put("byeo", "벼"); put("byeok", "벽"); put("byeon", "변"); put("byeol", "별"); put("byeong", "병");
        put("bo", "보"); put("bok", "복"); put("bon", "본"); put("bong", "봉"); put("bu", "부");
        put("buk", "북"); put("bun", "분"); put("bul", "불"); put("bung", "붕"); put("bi", "비");
        put("bin", "빈"); put("bil", "빌"); put("bim", "빔"); put("bing", "빙"); put("ppa", "빠");
        put("ppae", "빼"); put("ppeo", "뻐"); put("ppo", "뽀"); put("ppu", "뿌"); put("ppeu", "쁘");
        put("sa", "사"); put("sak", "삭"); put("san", "산"); put("sal", "살"); put("ssi", "씨");
        put("sam", "삼"); put("sap", "삽"); put("sang", "상"); put("sat", "샅"); put("sae", "새");
        put("saek", "색"); put("saeng", "생"); put("seo", "서"); put("seok", "석"); put("seon", "선");
        put("seol", "설"); put("seom", "섬"); put("seop", "섭"); put("seong", "성"); put("se", "세");
        put("syeo", "셔"); put("so", "소"); put("sok", "속"); put("son", "손"); put("sol", "솔");
        put("sot", "솟"); put("song", "송"); put("swae", "쇄"); put("soe", "쇠"); put("su", "수");
        put("suk", "숙"); put("sun", "순"); put("sul", "술"); put("sum", "숨"); put("sung", "숭");
        put("swi", "쉬"); put("seu", "스"); put("seul", "슬"); put("seum", "슴"); put("seup", "습");
        put("seung", "승"); put("si", "시"); put("sik", "식"); put("sin", "신"); put("sil", "실");
        put("sim", "심"); put("sip", "십"); put("sing", "싱"); put("ssa", "싸"); put("ssang", "쌍");
        put("ak", "악"); put("an", "안"); put("al", "알"); put("am", "암"); put("ap", "(압/앞)");
        put("ang", "앙"); put("ae", "애"); put("aek", "액"); put("aeng", "앵");
        put("ya", "야"); put("yak", "약"); put("yan", "얀"); put("yang", "양"); put("eo", "어");
        put("eok", "억"); put("eon", "언"); put("eol", "얼"); put("eom", "엄"); put("eop", "업");
        put("e", "에"); put("yeo", "여"); put("yeok", "역"); put("yeon", "연"); put("yeol", "열");
        put("yeom", "염"); put("yeop", "엽"); put("yeong", "영"); put("ye", "예"); put("o", "오");
        put("ok", "옥"); put("on", "온"); put("ol", "올"); put("om", "옴"); put("ong", "옹");
        put("wa", "와"); put("wan", "완"); put("wal", "왈"); put("wang", "왕"); put("wae", "왜");
        put("oe", "외"); put("oen", "왼"); put("yo", "요"); put("yok", "욕"); put("yong", "용");
        put("u", "우"); put("uk", "욱"); put("un", "운"); put("ul", "울"); put("um", "움");
        put("ung", "웅"); put("wo", "워"); put("won", "원"); put("wol", "월"); put("wi", "위");
        put("yu", "유"); put("yuk", "육"); put("yun", "윤"); put("yul", "율"); put("yung", "융");
        put("yut", "윷"); put("eu", "으"); put("eun", "은"); put("eul", "을"); put("eum", "음");
        put("eup", "읍"); put("eung", "응"); put("ui", "의"); put("i", "이"); put("ik", "익");
        put("in", "인"); put("il", "일"); put("im", "임"); put("ip", "입"); put("ing", "잉");
        put("ja", "자"); put("jak", "작"); put("jan", "잔"); put("jam", "잠"); put("jap", "잡");
        put("jang", "장"); put("jae", "재"); put("jaeng", "쟁"); put("jeo", "저"); put("jeok", "적");
        put("jeon", "전"); put("jeol", "절"); put("jeom", "점"); put("jeop", "접"); put("jeong", "정");
        put("je", "제"); put("jo", "조"); put("jok", "족"); put("jon", "존"); put("jol", "졸");
        put("jong", "종"); put("jwa", "좌"); put("joe", "죄"); put("ju", "주"); put("juk", "죽");
        put("jun", "준"); put("jul", "줄"); put("jung", "중"); put("jwi", "쥐"); put("jeu", "즈");
        put("jeuk", "즉"); put("jeul", "즐"); put("jeum", "즘"); put("jeup", "즙"); put("jeung", "증");
        put("ji", "지"); put("jik", "직"); put("jin", "진"); put("jil", "질"); put("jim", "짐");
        put("jip", "집"); put("jing", "징"); put("jja", "짜"); put("jjae", "째"); put("jjo", "쪼");
        put("cha", "차"); put("chak", "착"); put("chan", "찬"); put("chal", "찰"); put("jji", "찌");
        put("cham", "참"); put("chang", "창"); put("chae", "채"); put("chaek", "책"); put("cheo", "처");
        put("cheok", "척"); put("cheon", "천"); put("cheol", "철"); put("cheom", "첨"); put("cheop", "첩");
        put("cheong", "청"); put("che", "체"); put("cho", "초"); put("chok", "촉"); put("chon", "촌");
        put("chong", "총"); put("choe", "최"); put("chu", "추"); put("chuk", "축"); put("chun", "춘");
        put("chul", "출"); put("chum", "춤"); put("chung", "충"); put("cheuk", "측"); put("cheung", "층");
        put("chi", "치"); put("chik", "칙"); put("chin", "친"); put("chil", "칠"); put("chim", "침");
        put("chip", "칩"); put("ching", "칭"); put("keun", "큰"); put("ki", "키"); put("keu", "크");
        put("tal", "탈"); put("tam", "탐"); put("tap", "탑"); put("tang", "탕"); put("tae", "태");
        put("taek", "택"); put("taeng", "탱"); put("teo", "터"); put("te", "테"); put("to", "토");
        put("ton", "톤"); put("tol", "톨"); put("tong", "통"); put("toe", "퇴"); put("tu", "투");
        put("tung", "퉁"); put("twi", "튀"); put("teu", "트"); put("teuk", "특"); put("teum", "틈");
        put("ti", "티"); put("huin", "흰"); put("hi", "히"); put("him", "힘"); put("kwae", "쾌");
        put("paeng", "팽"); put("peo", "퍼"); put("pe", "페"); put("pyeo", "펴"); put("pyeon", "편");
        put("pyeom", "폄"); put("pyeong", "평"); put("pye", "폐"); put("po", "포"); put("pok", "폭");
        put("pyo", "표"); put("pu", "푸"); put("pum", "품"); put("pung", "풍"); put("peu", "프");
        put("pi", "피"); put("pik", "픽"); put("pil", "필"); put("pip", "핍"); put("ha", "하");
        put("hak", "학"); put("han", "한"); put("hal", "할"); put("ham", "함"); put("hap", "합");
        put("hang", "항"); put("hae", "해"); put("haek", "핵"); put("haeng", "행"); put("hyang", "향");
        put("heo", "허"); put("heon", "헌"); put("heom", "험"); put("he", "헤"); put("hyeo", "혀");
        put("hyeok", "혁"); put("hyeon", "현"); put("hyeol", "혈"); put("hyeom", "혐"); put("hyeop", "협");
        put("hyeong", "형"); put("hye", "혜"); put("ho", "호"); put("hok", "혹"); put("hon", "혼");
        put("hol", "홀"); put("hop", "홉"); put("hong", "홍"); put("hwa", "화"); put("hwak", "확");
        put("hwan", "환"); put("hwal", "활"); put("hwang", "황"); put("hwae", "홰"); put("hwaet", "횃");
        put("hoe", "회"); put("hoek", "획"); put("hoeng", "횡"); put("hyo", "효"); put("hu", "후");
        put("hun", "훈"); put("hwon", "훤"); put("hwe", "훼"); put("hwi", "휘"); put("hyu", "휴");
        put("hyul", "휼"); put("hyung", "흉"); put("heu", "흐"); put("heuk", "흑"); put("heun", "흔");
        put("heul", "흘"); put("heum", "흠"); put("heup", "흡"); put("heung", "흥"); put("hui", "희");
        put("ta", "타"); put("tak", "탁"); put("tan", "탄"); put("ko", "코"); put("nap", "납");
        put("pa", "파"); put("pan", "판"); put("pal", "팔"); put("pae", "패"); put("ssuk", "쑥");
        put("ma", "마"); put("mil", "밀"); put("a", "아");
    }};
}