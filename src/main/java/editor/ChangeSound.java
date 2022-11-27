package editor;

import hangul_repository.English1Repository;
import hangul_repository.English2Repository;

import java.util.*;

public class ChangeSound implements English2Repository, English1Repository {
    private static final List<Map.Entry<String, String>> list = new ArrayList<>(englishType2.entrySet()) {{
        sort(Comparator.comparingInt(o -> o.getKey().length()));
        Collections.reverse(this);
    }};

    private static final List<Map.Entry<String, String>> map = new ArrayList<>(englishType1.entrySet()) {{
        sort(Comparator.comparingInt(o -> o.getKey().length()));
        Collections.reverse(this);
    }};

    public static String changeType1(String total) {
        for (Map.Entry<String, String> entry : list) {
            if (total.contains(entry.getKey()))
                total = total.replace(entry.getKey(), entry.getValue());
        }
        return total;
    }

    // 국제 음성 기호
    public static String changeType2(String total) {
        for (Map.Entry<String, String> entry : map) {
            if (total.contains(entry.getKey()))
                total = total.replace(entry.getKey(), entry.getValue());
        }
        return total;
    }

    private static char changeType(int i) {
        return (char) i;
    }
}
