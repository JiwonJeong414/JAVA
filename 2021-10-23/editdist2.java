import java.util.*;
import java.io.*;

public class editdist2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("editdist2.in"));

        char[] stringOne = in.next().toCharArray();
        System.out.println(Arrays.toString(stringOne));
        char[] stringTwo = in.next().toCharArray();
        System.out.println(Arrays.toString(stringTwo));

        int r = stringOne.length;
        int c = stringTwo.length;

        int[][] dp = new int[r + 1][c + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = 0;
                else if (i == 0)
                    dp[i][j] = 1 + dp[i][j - 1];
                else if (j == 0)
                    dp[i][j] = 1 + dp[i - 1][j];
                else if (stringOne[i - 1] == stringTwo[j - 1])
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }

        System.out.println();

        for (int i = 0; i < dp.length; i++)
            System.out.println(Arrays.toString(dp[i]));

        System.out.println();
        System.out.println("answer: " + dp[r][c]);
    }
}
