public class MinCostClimbingStair {

    public static void main(String[] args) {



    }

    public static int minCost(int[] cost) {

        int n = cost.length;
        if (n == 1) return 0;

        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 1; i--) {

            dp[i] = cost[i];
            if (i == n - 1) {
                dp[i] += dp[i + 1];
            } else {
                dp[i] += Math.min(dp[i + 1], dp[i + 2]);
            }
        }

        return Math.min(dp[1], dp[2]);


    }

}