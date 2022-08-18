package editor;

import hangul_repository.BackRepository;

import java.util.HashMap;
import java.util.Map;

public class BackChange implements BackRepository {
    Map<Character, String> back = new HashMap<>();

    public BackChange() {
        back.putAll(back1);
        back.putAll(back2);
        back.putAll(back3);
    }

    public String change(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<text.length(); i++) {
            char c = text.charAt(i);
            if (back1.containsKey(c)) builder.append(back1.get(c));
            else if (back2.containsKey(c)) builder.append(back2.get(c));
            else if (back3.containsKey(c)) builder.append(back3.get(c));
            else builder.append(c);
        }
        return builder.toString();
    }
}
