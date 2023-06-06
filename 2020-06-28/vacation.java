import java.util.*;
import java.io.*;

public class vacation {
    static int[] ar;
    static int dp[][];
    static int n;
    static int save;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("vacation.in"));
        n = sc.nextInt();
        dp = new int[3][n];
        ar = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ar[i] = a;
        }
        System.out.println(solve(n - 1));
        System.out.println(Arrays.toString(ar));
    }

    static void print2D() {
        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int solve(int d) {
        dp[0][0] = 1;
        if (ar[0] != 1 && ar[0] != 3)
            dp[1][0] = Integer.MAX_VALUE;
        if (ar[0] != 2 && ar[0] != 3)
            dp[2][0] = Integer.MAX_VALUE;

        for (int i = 1; i <= d; i++) {
            int min = 0;
            if (dp[1][i - 1] < dp[0][i - 1])
                min = 1;
            if (dp[2][i - 1] < dp[1][i - 1])
                min = 2;

            dp[0][i] = dp[min][i - 1] + 1;
            dp[1][i] = dp[min][i - 1];
            if (min == 1)
                dp[1][i]++;
            if (ar[i] != 1 && ar[i] != 3)
                dp[1][i] = Integer.MAX_VALUE;
            dp[2][i] = dp[min][i - 1];
            if (min == 2)
                dp[2][i]++;
            if (ar[i] != 2 && ar[i] != 3)
                dp[2][i] = Integer.MAX_VALUE;
            print2D();
        }

        return Math.min(Math.min(dp[0][d], dp[1][d]), dp[2][d]);
    }
}