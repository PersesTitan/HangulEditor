package hangul_repository;

import java.util.HashMap;
import java.util.Map;

public interface PhoneticRepository {
    Map<String, Character> phonetic = new HashMap<>() {{
        put("a", 'ㅏ'); put("e", 'ㅔ');
        put("i", 'ㅣ'); put("o", 'ㅗ');
        put("u", 'ㅜ'); put("ə", 'ㅓ');
        put("∧", 'ㅓ'); put("ɔ", 'ㅗ');
        put("ε", 'ㅔ'); put("æ", 'ㅐ');
        put("b", 'ㅂ'); put("d", 'ㄷ');
        put("j", '이'); put("l", 'ㄹ');
        put("m", 'ㅁ'); put("n", 'ㄴ');
        put("r", 'ㄹ'); put("v", 'ㅂ');
        put("z", '즈'); put("dʒ", '쥐');
        put("ʒ", '지'); put("tz", 'ㅉ');
        put("ð", 'ㄸ'); put("h", 'ㅎ');
        put("g", 'ㄱ'); put("ŋ", '응');
        put("f", 'ㅍ'); put("k", 'ㅋ');
        put("p", 'ㅍ'); put("s", 'ㅅ');
        put("t", 'ㅌ'); put("θ", 'ㅆ');
        put("ʃ", '쉬'); put("tʃ", '취');
    }};

}
