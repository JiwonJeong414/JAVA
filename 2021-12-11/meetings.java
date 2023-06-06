import java.util.*;
import java.io.*;

class meetings {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("meetings.in"));
        PrintWriter out = new PrintWriter(new FileWriter("meetings.out"));

        int N = in.nextInt();
        int L = in.nextInt();

        ArrayList<Integer> negative = new ArrayList<>();
        Stack<Integer> positive = new Stack<>();

        for (int i = 0; i < N; i++) {
            int w = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            if (d == 1)
                positive.add(x);
            if (d == -1)
                negative.add(x);
        }
        int answer = 0;
        while (!positive.isEmpty()) {
            int current = positive.pop();
            for (int s : negative) {
                if (current < s) {
                    answer++;
                }
            }
        }
        out.print(answer);
        out.close();
    }
}
