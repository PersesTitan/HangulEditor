import editor.BackChange;
import editor.ChangeSound;
import editor.Separation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HangulEditor {
    public static void main(String[] args) {
//        Separation separation = new Separation();
//        separation.separation("annyeonghaseyo");
//        ChangeSound changeSound = new ChangeSound();
//        System.out.println(changeSound.change("jalga"));
//        File file = new File("test");
//        File file = new File("test2");
//        String text;
//        int count = 1;
//
//        StringBuilder builder = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
//            while ((text = reader.readLine()) != null) {
//                String text2 = reader.readLine();
//                make(builder, text2, text);
//                if (count%5 == 0) builder.append("\n");
//                count++;
//            }
//        } catch (IOException ignored) {}
//        System.out.println(builder);

        BackChange backChange = new BackChange();
        System.out.println(backChange.change("뙭됡"));
    }

//    private static void make(StringBuilder builder, String text1, String text2) {
//        builder.append("put('").append(text1).append("', \"").append(text2).append("\");");
//        builder.append(" ");
//    }
}
