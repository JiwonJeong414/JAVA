import java.util.*;
import java.io.*;

class s1 {
    static int dp[];

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib1(n));
        dp = new int[n + 1];
        System.out.println(fib2(n));

        System.out.println(fib3(n));
    }

    static int fib1(int n) {
        if (n < 2) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

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
}