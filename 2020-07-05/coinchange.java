import java.util.*;
import java.io.*;

class coinchange {
    static int[] coins;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("coinchange.in"));
        PrintWriter out = new PrintWriter(new FileWriter("coinchange.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int dp[] = new int[n + 1];
        coins = new int[m];
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < m; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coins);
        System.out.println(Arrays.toString(coins));
        dp[0] = 1;
        int c = 0;
        int cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            c = coins[i];
            for (int j = coins[i]; j <= n; j++) {
                cnt = j - c;
                dp[j] = dp[j] + dp[cnt];
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[n]);
        out.println(dp[n]);
        out.close();
    }
}