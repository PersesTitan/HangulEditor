package editor;

import hangul_repository.PhoneticRepository;
import hangul_repository.SoundRepository;

import java.util.*;

public class ChangeKoreanSound implements PhoneticRepository {

    public static void main(String[] args) {
//        System.out.println(change("Kon'nichiwa"));

    }

    private static String change(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<text.length(); i++) {
            String c = Character.toString(text.charAt(i));
            builder.append(phonetic.getOrDefault(c, '?'));
        }
        return builder.toString();
    }
}
