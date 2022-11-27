package items;

import java.util.Arrays;
import java.util.List;

import static items.HangulSplitItem.*;

public interface HangulSplitTool {
    List<Character> firstWords = Arrays.asList(
            'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ',
            'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ');
    List<Character> secondWords = Arrays.asList(
            'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ' ,'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ',
            'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ' ,'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ');
    List<Character> threadWords = Arrays.asList(
            ' ', 'ㄱ', 'ㄲ', ㄱㅅ, 'ㄴ', ㄴㅈ, ㄴㅎ, 'ㄷ', 'ㄹ', ㄹㄱ, ㄹㅁ, ㄹㅂ, ㄹㅅ, ㄹㅌ,
            ㄹㅍ, ㄹㅎ, 'ㅁ', 'ㅂ', ㅂㅅ, 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ');

    default int getFirstPos(char text) {
        return firstWords.indexOf(text);
    }

    default int getSecondPos(char text) {
        return secondWords.indexOf(text);
    }

    default int getThreadPos(char text) {
        return threadWords.indexOf(text);
    }
}
