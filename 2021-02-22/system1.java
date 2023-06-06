import java.util.*;
import java.io.*;

class system1 {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(System.in);
        int N, K;
        StringTokenizer st = new StringTokenizer(f.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        String[] S = new String[N];
        for (int i = 0; i < S.length; i++) {
            S[i] = f.readLine();
        }
        int answer = 0; // Answer variable for output
        for (int i = 0; i < S.length; i++) {
            int vowels = 0;
            for (int j = 0; j < S[i].length(); j++) {
                char a = S[i].charAt(j);
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I'
                        || a == 'O' || a == 'U') {
                    vowels++;
                }
            }
            if (vowels >= K) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
