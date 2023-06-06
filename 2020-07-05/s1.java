import java.util.Arrays;

class s1 {
    static int dp[];
    static int n = 10;

    public static void main(String[] args) {
        System.out.println(fib1(n));
        dp = new int[n + 1];
        System.out.println(fib2(n));
        System.out.println(Arrays.toString(dp));
        dp = new int[n + 1];
        System.out.println(fib3(n));
        System.out.println(Arrays.toString(dp));

    }

    // naive
    static int fib1(int n) {
        if (n < 2) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    // recursive dp
    static int fib2(int n) {
        if (dp[n] > 0) {
            return dp[n];
        }
        if (n < 2) {
            return n;
        }
        dp[n] = fib2(n - 1) + fib2(n - 2);
        return dp[n];
    }

    // iterative dp
    static int fib3(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}