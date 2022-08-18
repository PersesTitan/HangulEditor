package editor;

import hangul_repository.SoundRepository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ChangeSound implements SoundRepository {
    private final StringBuilder builder = new StringBuilder();
    private final Set<String> arrayList = new LinkedHashSet<>();
    private final StringBuilder texts;

    public ChangeSound() {
        texts = new StringBuilder();
        reOrder();
    }

    public void add(String eng, char kor) {
        this.sound.put(eng, kor);
        arrayList.add(eng);
        reOrder();
    }

    public String change(String text) {
        texts.setLength(0);
        texts.append(text);
        builder.setLength(0);

        while (texts.length() != 0) {
            boolean check = true;
            for (String str : arrayList) {
                if (texts.toString().startsWith(str)) {
                    delete(str, String.valueOf(this.sound.get(str)));
                    check = false;
                    break;
                }
            }
            if (check) delete(String.valueOf(texts.charAt(0)));
        }

        return builder.toString();
    }

    private void reOrder() {
        int max = this.sound.keySet()
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        for (int i = max; i>0; i--) {
            int finalI = i;
            List<String> list = this.sound
                    .keySet()
                    .stream()
                    .filter(value -> value.length() == finalI)
                    .toList();
            arrayList.addAll(list);
        }
    }

    private void delete(String deleteWord, String change) {
        builder.append(change);
        texts.delete(0, deleteWord.length());
    }

    private void delete(String change) {
        builder.append(change);
        texts.delete(0, change.length());
    }
}
