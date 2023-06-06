import java.util.*;
import java.io.*;

class dynamic2 {
    public static void main(String[] args) throws Exception {
        int N = 30; // the maximum value possible in ar
        int[] ar = { 9, 2, 7, 6, 3, 12, 15, 2, 3, 20 };
        int[] dp = new int[N];
        f1: for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i != j && ar[i] == ar[j]) {
                    System.out.println(ar[j]);
                    break f1;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (dp[ar[i]] > 0) {
                System.out.println(ar[i]);
                break;
            }
            dp[ar[i]] = 1;
        }

        // Find the first duplicate
        // - First do the naive approach
        // - Then do DP approach
    }

}