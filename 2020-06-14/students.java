import java.util.*;
import java.io.*;

class students {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("students.in"));
        PrintWriter out = new PrintWriter(new FileWriter("students.out"));

        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            int amount = Integer.parseInt(f.readLine());
            String e = f.readLine();
            char[] ar = new char[e.length()];
            ar = e.toCharArray();
            System.out.println(Arrays.toString(ar));
            int counta = counta(ar);
            System.out.println(counta);
        }
    }

    static int counta(char[] ar) {
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i + 1 != ar.length && ar[i] == 'A' && ar[i + 1] == 'P') {
                int cnt1 = 0;
                for (int j = i + 1; j < ar.length; j++) {
                    if (j == ar.length || ar[j] == 'A') {
                        break;
                    } else {
                        cnt1++;
                    }
                }
                if (cnt1 > max) {
                    max = cnt1;
                }
            }
        }
        return max;
    }
}