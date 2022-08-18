package hangul_repository;

import java.util.ArrayList;
import java.util.List;

public interface Repository {
    String[] first = {"ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ",
            "ㅃ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
    String[] second = {"ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ",
            "ㅗ","ㅘ","ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ",
            "ㅡ","ㅢ","ㅣ"};
    String[] thread = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ",
            "ㄹ","ㄺ","ㄻ","ㄼ","ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ",
            "ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};

    default String getFirst(char text) {
        int position = (text-0xAC00)/28/21;
        if (0 > position || position >= first.length)
            return Character.toString(text);
        else return first[position];
    }

    default String getSecond(char text) {
        int position = (text-0xAC00)/28%21;
        if (0 > position)
            return Character.toString(text);
        else return second[position];
    }

    default String getThread(char text) {
        int position = (text-0xAC00)%28;
        if (0 > position || position >= second.length)
            return Character.toString(text);
        else return thread[position];
    }

    default List<String> getWords(char text) {
        List<String> list = new ArrayList<>();
        int firstPosition = (text-0xAC00)/28/21;
        int secondPosition = (text-0xAC00)/28%21;
        int threadPosition = (text-0xAC00)%28;
        if (0 > firstPosition || firstPosition >= this.first.length) {
            list.add(Character.toString(text));
            return list;
        } else list.add(first[firstPosition]);
        list.add(second[secondPosition]);
        if (threadPosition == 0) return list;
        else list.add(thread[threadPosition]);
        return list;
    }

    default List<String> getWords(String texts) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i<texts.length(); i++) {
            char text = texts.charAt(i);
            int firstPosition = (text-0xAC00)/28/21;
            int secondPosition = (text-0xAC00)/28%21;
            int threadPosition = (text-0xAC00)%28;
            if (0 > firstPosition || firstPosition >= first.length) {
                list.add(Character.toString(text));
                continue;
            } else list.add(first[firstPosition]);
            list.add(second[secondPosition]);
            if (threadPosition != 0) list.add(thread[threadPosition]);
        }
        return list;
    }

    default int getFirstPos(char text) {
        for (int i = 0; i<first.length; i++) {
            if (first[i].charAt(0) == text) return i;
        }
        return -1;
    }

    default int getSecondPos(char text) {
        for (int i = 0; i<second.length; i++) {
            if (second[i].charAt(0) == text) return i;
        }
        return -1;
    }

    default int getThreadPos(char text) {
        for (int i = 1; i<thread.length; i++) {
            if (thread[i].charAt(0) == text) return i;
        }
        return -1;
    }

    default char getPlus(int first, int second, int thread) {
        return (char) ((first * 21 + second) * 28 + thread + 0xAC00);
    }

    default char getPlus(int first, int second) {
        return (char) ((first * 21 + second) * 28 + 0xAC00);
    }

    default char getPlus(char first, char second, char thread) {
        int firstPos = getFirstPos(first);
        int secondPos = getSecondPos(second);
        int threadPos = getThreadPos(thread);
        return (char) ((firstPos * 21 + secondPos) * 28 + threadPos + 0xAC00);
    }

    default char getPlus(char first, char second) {
        int firstPos = getFirstPos(first);
        int secondPos = getSecondPos(second);
        return (char) ((firstPos * 21 + secondPos) * 28 + 0xAC00);
    }
}