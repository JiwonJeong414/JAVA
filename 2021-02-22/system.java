import java.util.Scanner;

public class stationNames {
    public static void main(String[] args) {
        // Reading input
        Scanner input = new Scanner(System.in);
        int N, K;
        N = input.nextInt();
        K = input.nextInt();
        String[] S = new String[N]; // This is an array of N strings S
        for (int i = 0; i < N; i++)
            S[i] = input.nextLine();
        input.close();
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
            if (vowels <= K) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}