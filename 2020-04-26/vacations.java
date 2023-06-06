import java.util.*;
import java.io.*;

public class vacations {
    static int[] ar;
    static int dp[][];
    static int n = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("vacations.in"));
        n = sc.nextInt();
        dp = new int[3][n];
        ar = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ar[i] = a;
        }
        print2D();
    }

    static void print2D() {
        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int solve(int d) {
        if (dp[day][last] >= 0) {
            return dp[day][last];
        }

        if (day >= n) {
            return 0;
        }

        int ret = Integer.MAX_VALUE;

        // action 0
        ret = Math.min(ret, solve(day + 1, 0) + 1);

        // action 1
        if (ar[day] == 1 || ar[day] == 3)
            if (last != 1)
                ret = Math.min(ret, solve(day + 1, 1));

        // action 2
        if (ar[day] == 2 || ar[day] == 3)
            if (last != 2)
                ret = Math.min(ret, solve(day + 1, 2));

        return dp[day][last] = ret;
    }
}