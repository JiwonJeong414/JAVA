import java.util.*;
import java.io.*;

class password {
    static String[] passwords;
    static String attempt;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("password.in"));
        PrintWriter out = new PrintWriter(new FileWriter("password.out"));
        int t = Integer.parseInt(f.readLine());
        for (int k = 0; k < t; k++) {
            String answer = "";
            String answer1 = "";
            int n = Integer.parseInt(f.readLine());
            passwords = new String[n];
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int i = 0; i < n; i++) {
                passwords[i] = st.nextToken();
            }
            System.out.println(Arrays.toString(passwords));
            attempt = f.readLine();
            int a = 0;
            String letter;
            for (int i = 1; i < attempt.length() + 1; i++) {
                letter = attempt.substring(a, i);
                for (int j = 0; j < passwords.length; j++) {
                    if (letter.equals(passwords[j])) {
                        if (i != attempt.length()) {
                            answer += letter + " ";
                            answer1 += letter;
                        } else {
                            answer += letter;
                            answer1 += letter;
                        }
                        a = i;
                    }
                }
            }
            if (answer1.equals(attempt)) {
                out.println(answer);
            } else {
                out.println("WRONG PASSWORD");
            }
        }
        out.close();
    }
}