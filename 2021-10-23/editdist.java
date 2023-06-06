import java.util.*;
import java.io.*;

public class editdist {
    static char[] stringOne;
    static char[] stringTwo;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("editdist.in"));

        stringOne = in.next().toCharArray();
        System.out.println(Arrays.toString(stringOne));
        stringTwo = in.next().toCharArray();
        System.out.println(Arrays.toString(stringTwo));

        int r = stringOne.length;
        int c = stringTwo.length;

        dp = new int[r][c];

        System.out.println();

        System.out.println("answer: " + solve(r - 1, c - 1));

        System.out.println();

        for (int i = 0; i < r; i++)
            System.out.println(Arrays.toString(dp[i]));
    }

    static int solve(int r, int c) {
        if (r == 0 && c == 0)
            return dp[r][c] = 1;
        if (r == 0)
            return dp[r][c] = 1 + solve(r, c - 1);
        if (c == 0)
            return dp[r][c] = 1 + solve(r - 1, c);

        if (stringOne[r] == stringTwo[c])
            return dp[r][c] = solve(r - 1, c - 1);

        return dp[r][c] = 1 + Math.min(Math.min(solve(r - 1, c), solve(r, c - 1)), solve(r - 1, c - 1));
    }
}
