import editor.HangulEditor;
import editor.JapanRecovery;
import items.HangulSplitItem;

import java.util.List;

public class ExampleTest {
    public static void main(String[] args) {
        String test = "안녕하세요";
        System.out.println("word : " + test);
        System.out.println("result : " + HangulEditor.isOnlyHangul(test));

        System.out.println("================================================");
        test = "Hello";
        System.out.println("word : " + test);
        System.out.println("result : " + HangulEditor.isOnlyHangul(test));

        System.out.println("================================================");
        System.out.println(HangulEditor.randomHangul(1));
        System.out.println(HangulEditor.randomHangul(5));
        System.out.println(HangulEditor.randomHangul());

        System.out.println("================================================");
        HangulSplitItem split1 = new HangulSplitItem('안');
        HangulSplitItem split2 = new HangulSplitItem('아');

        List<HangulSplitItem> items = HangulEditor.splitHangul("안녕하세요.");
        items.forEach(v -> {
            System.out.print(v.getFirst() + "\t");
            System.out.print(v.getSecond() + "\t");
            System.out.println(v.getThread());
        });

        System.out.println(JapanRecovery.change("귦궫궢"));
        System.out.println(JapanRecovery.change("궇궶궫"));
        System.out.println(JapanRecovery.change("돺"));
    }
}
