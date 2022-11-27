import editor.JapanRecovery;

public class JapanRecoveryTest {
    public static void main(String[] args) {
        String text1 = JapanRecovery.change("귦궫궢");
        String text2 = JapanRecovery.change("궇궶궫");
        String text3 = JapanRecovery.change("궺궞");
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}
