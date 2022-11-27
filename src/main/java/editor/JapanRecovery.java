package editor;

import hangul_repository.JapanRepository;

import java.util.HashMap;
import java.util.Map;

public class JapanRecovery implements JapanRepository {
    private final static Map<Character, String> back = new HashMap<>(back1) {{
        putAll(back2);
        putAll(back3);
    }};

    public static String change(String text) {
        StringBuilder builder = new StringBuilder();
        text.chars().
                boxed()
                .map(JapanRecovery::getChar)
                .map(back::get)
                .forEach(builder::append);
        return builder.toString();
    }

    private static char getChar(int i) {
        return (char) i;
    }
}
