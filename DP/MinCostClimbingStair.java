import java.util.*;
public class MinCostClimbingStair {

    public static void main(String[] args) {

        int[] cost = new int[]{10, 12, 5, 0, 10};
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);

        minCostMemo(cost, dp, 1);
        System.out.println(Math.min(dp[1], dp[2]));

    }

    public static int minCost(int[] cost) {

        int n = cost.length;
        if (n == 1) return 0;

        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 1; i--) {

            dp[i] = cost[i - 1];
//            System.out.println(dp[i]);
            if (i == n - 1) {
                dp[i] += dp[i + 1];
            } else {
                dp[i] += Math.min(dp[i + 1], dp[i + 2]);
            }
        }

        return Math.min(dp[1], dp[2]);

    }

    public static int minCostMemo(int[] cost, int[] dp, int n) {

        if (n == cost.length) {
            return 0;
        }

        if (n == cost.length + 1) {
            return Integer.MAX_VALUE;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = Math.min(minCostMemo(cost, dp, n + 1), minCostMemo(cost, dp, n + 2)) + cost[n - 1];
        dp[n] = ans;
        return ans;

    }

}