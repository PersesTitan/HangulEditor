package editor;

import items.HangulSplitItem;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class HangulEditor {
    private final static String HANGUL_REGEX = "[\u3131-\u314E\u314F-\u3163\uAC00-\uD7A3]";
    private final static int HANGUL_START = 44032;
    private final static int HANGUL_END = 55204;

    // 한글인지 확인하는 메소드
    public static boolean isOnlyHangul(String words) {
        return words.matches(HANGUL_REGEX + "+");
    }

    // 한글이 포함되어 있는지 확인하는 메소드
    public static boolean isInOnlyHangul(String words) {
        return Pattern.compile(HANGUL_REGEX).matcher(words).find();
    }

    // 한글 램던 함수
    public static String randomHangul(int len) {
        StringBuilder total = new StringBuilder();
        for (int i = 0; i < len; i++) {
            total.append((char) new Random().nextInt(HANGUL_START, HANGUL_END));
        }
        return total.toString();
    }

    public static String randomHangul() {
        return randomHangul(16);
    }

    public static HangulSplitItem splitHangul(char word) {
        return new HangulSplitItem(word);
    }

    public static List<HangulSplitItem> splitHangul(String word) {
         return word.chars()
                 .boxed()
                 .map(HangulEditor::getChar)
                 .map(HangulSplitItem::new)
                 .toList();
    }

    private static char getChar(int i) {
        return (char) i;
    }
}
