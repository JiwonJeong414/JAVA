import java.util.Arrays;

public class strchar {
    public static void main(String[] args) {
        System.out.println("a".equals("a"));
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));

        char c = 'c';
        System.out.println(c);
        System.out.println((int) c);
        System.out.println((char) 99);

        System.out.println(c + 0);
        System.out.println(c + c);

        char[] ar = { 'a', 'b', 'c' };

        System.out.println('a' - 'a');
        System.out.println('b' - 'a');
        System.out.println('c' - 'a');

        for (char ch : ar) {
            System.out.println(ch - 'a');
        }

        System.out.println('b' == 'b');
        System.out.println('b' < 'c');
        System.out.println('b' - 'b');

        String a = "ABCDEFG";
        for (char ch : a.toCharArray()) {
            System.out.println(ch);
        }
    }
}
