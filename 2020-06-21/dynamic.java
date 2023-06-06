import java.util.*;
import java.io.*;

class dynamic {
    static int cnt;
    static int[] dp;

    public static void main(String[] args) throws Exception {
        int N = 10;
        dp = new int[N + 1];
        cnt = 0;
        System.out.println(fib(N));
        System.out.println(cnt);
        System.out.println();
        cnt = 0;
        System.out.println(fib2(N));
        System.out.println(cnt);
        System.out.println();
        dp = new int[N + 1];
        cnt = 0;
        System.out.println(fib3(N));
        System.out.println(cnt);
    }

    static int fib(int N) {
        cnt++;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    static int fib2(int N) {
        cnt++;
        System.out.println(Arrays.toString(dp));
        if (dp[N] > 0) {
            return dp[N];
        }
        if (N == 1) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        dp[N] = fib2(N - 1) + fib2(N - 2);
        return dp[N];
    }

    static int fib3(int N) {
        cnt++;
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(Arrays.toString(dp));
        for (int i = 2; i < N + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}