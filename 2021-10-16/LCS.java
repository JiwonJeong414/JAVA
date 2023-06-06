import java.util.*;
import java.io.*;

public class LCS {
    static char a[];
    static char b[];
    static int dp[][];

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("LCS.in"));

        a = in.next().toCharArray();
        b = in.next().toCharArray();

        dp = new int[a.length][b.length];

        System.out.println("answer: " + solve(a.length - 1, b.length - 1));

        System.out.println();

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    static int solve(int ai, int bi) {

        if (ai < 0 || bi < 0)
            return 0;
        if (a[ai] == b[bi])
            return dp[ai][bi] = 1 + solve(ai - 1, bi - 1);

        return dp[ai][bi] = Math.max(solve(ai - 1, bi), solve(ai, bi - 1));
    }
}
