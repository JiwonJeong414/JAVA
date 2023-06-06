import java.util.*;
import java.io.*;

public class paint {
    static int cnt = 1;
    static HashMap<Long, Integer> m;
    static String fence;

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("paint.in"));

        int N = in.nextInt();
        int Q = in.nextInt();

        m = new HashMap<>(N * 3);

        fence = in.next();

        for (int i = 0; i < Q; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            if (start != 1)
                solve(0, start - 1);
            if (end != fence.length())
                solve(end, N);
            // System.out.println(cnt);
            cnt = 1;
        }
    }

    static void solve(int sindex, int eindex) {
        Long p = sindex * 100000L + eindex;
        Integer found = m.get(p);
        if (found != null) {
            cnt += found;
            return;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(fence.charAt(sindex));
        found = 0;
        for (int i = sindex + 1; i < eindex; i++) {
            while (!stack.isEmpty() && stack.peek() > fence.charAt(i))
                stack.pop();
            if (stack.empty() || stack.peek() < fence.charAt(i)) {
                stack.push(fence.charAt(i));
                found++;
            }
        }
        m.put(p, found);
        cnt += found;
    }
}
