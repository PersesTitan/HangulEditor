package editor;

import hangul_repository.Repository;
import hangul_repository.SoundRepository;

import java.util.*;
import java.util.stream.Collectors;

public class Separation implements Repository {

    public void separation(String text) {

//        System.out.println(getPlus(getFirstPos('ㄱ'), getSecondPos('ㅏ'), getThreadPos('ㄴ')));
//        System.out.println(getPlus(getFirstPos('ㄱ'), getSecondPos('ㅏ'), getThreadPos('ㅁ')));
//        System.out.println(getFirstPos('ㄱ'));
//        System.out.println(getFirstPos('ㄴ'));
//        System.out.println(getPlus('ㄱ', 'ㅏ'));
//        System.out.println(getWords(text));

    }

    private String change(Character character) {
        return String.format("0x%04X%n", (int) character);
    }
}
