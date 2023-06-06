import java.util.*;

class Main {
    static int minCnt;
    static int[] coins;
    static ArrayList<Integer> arr;
    static int cnt;
    static int[] dp;

    public static void coin(String[] args) {
        coins = new int[] { 1, 4, 3 };
        Arrays.sort(coins);
        int targetSum = 10;
        dp = new int[targetSum + 1];
        arr = new ArrayList<>();
        minCnt = Integer.MAX_VALUE;
        cnt = 0;
        System.out.println(solve2(targetSum));
        System.out.println(cnt);
    }

    static void solve(int targetSum) {
        cnt++;
        if (targetSum == 0) {
            if (arr.size() < minCnt) {
                System.out.println(arr);
                minCnt = arr.size();
            }
            return;
        }
        if (targetSum < 0) {
            return;
        }

        for (int i = coins.length - 1; i > -1; i--) {
            arr.add(coins[i]);
            solve(targetSum - coins[i]);
            arr.remove(arr.size() - 1);
        }
    }

    static int solve2(int targetSum) {
        cnt++;
        System.out.println(Arrays.toString(dp));
        if (targetSum == 0) {
            return 0;
        }
        if (targetSum < 0) {
            return 10000;
        }
        if (dp[targetSum] > 0) {
            return dp[targetSum];
        }

        int min = Integer.MAX_VALUE;

        for (int i = coins.length - 1; i > -1; i--) {
            min = Math.min(min, solve2(targetSum - coins[i]) + 1);
        }

        dp[targetSum] = min;
        return dp[targetSum];
    }
}