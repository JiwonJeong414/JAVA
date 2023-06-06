import java.util.*;
import java.io.*;

class test {
    public static void main(String[] args) {
        String str = "CCAAAATTTTT";
        int max = 0;
        int cnt = 1;
        String maxLetter = "";
        for (int i = 0; i < str.length() - 1; i++) {
            String current = str.substring(i, i + 1);
            String next = str.substring(i + 1, i + 2);
            if (current.equals(next) && i == str.length() - 2) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                    maxLetter = current;
                }
            } else if (current.equals(next)) {
                cnt++;
            } else if (!current.equals(next)) {
                if (cnt > max) {
                    max = cnt;
                    maxLetter = current;
                }
                cnt = 1;
            }
        }
        System.out.println(maxLetter + " " + max);
    }
}