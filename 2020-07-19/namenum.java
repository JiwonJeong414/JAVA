
/*
ID: jiwonje2
LANG: JAVA
TASK: namenum
*/
import java.util.*;
import java.io.*;

class namenum {
    static char[] ar2;

    public static void main(String[] args) throws Exception {
        BufferedReader f1 = new BufferedReader(new FileReader("namenum.in"));
        BufferedReader f2 = new BufferedReader(new FileReader("dict.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("namenum.out"));
        String name = f1.readLine();
        String answer = "";
        String dict;
        int cnt = 0;

        for (int i = 0; i < 4617; i++) {
            dict = f2.readLine();
            answer = "";
            ar2 = new char[dict.length()];
            ar2 = dict.toCharArray();
            for (int j = 0; j < dict.length(); j++) {
                if (ar2[j] == 'A' || ar2[j] == 'B' || ar2[j] == 'C') {
                    answer += "2";
                }
                if (ar2[j] == 'D' || ar2[j] == 'E' || ar2[j] == 'F') {
                    answer += "3";
                }
                if (ar2[j] == 'G' || ar2[j] == 'H' || ar2[j] == 'I') {
                    answer += "4";
                }
                if (ar2[j] == 'J' || ar2[j] == 'K' || ar2[j] == 'L') {
                    answer += "5";
                }
                if (ar2[j] == 'M' || ar2[j] == 'N' || ar2[j] == 'O') {
                    answer += "6";
                }
                if (ar2[j] == 'P' || ar2[j] == 'R' || ar2[j] == 'S') {
                    answer += "7";
                }
                if (ar2[j] == 'T' || ar2[j] == 'U' || ar2[j] == 'V') {
                    answer += "8";
                }
                if (ar2[j] == 'W' || ar2[j] == 'X' || ar2[j] == 'Y') {
                    answer += "9";
                }
                if (answer.equals(name) && dict.length() == name.length()) {
                    out.println(dict);
                    cnt++;
                }
            }
        }
        if (cnt == 0) {
            out.println("NONE");
        }
        out.close();
    }

}