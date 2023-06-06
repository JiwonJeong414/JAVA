
/*
ID: jiwonje2
LANG: JAVA
TASK: palsquare
*/
import java.util.*;
import java.io.*;

class palsquare {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
        PrintWriter out = new PrintWriter(new FileWriter("palsquare.out"));

        int N = Integer.parseInt(f.readLine());

        for (int i = 1; i <= 300; i++) {
            int num = (int) Math.pow(i, 2);
            String convert = Integer.toString(num, N);
            if (isPalindrome(convert))
                out.println(Integer.toString(i, N).toUpperCase() + " " + convert.toUpperCase());
        }

        out.close();
    }

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;

        return true;
    }
}