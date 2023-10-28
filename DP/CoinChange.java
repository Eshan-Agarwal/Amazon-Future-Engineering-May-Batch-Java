public class CoinChange {

    public static void main(String[] args) {

    }

    public static int getMinCoin(int[] coins, int tar) {

        int n = coins.length;
        int[][] dp = new int[n + 1][tar + 1];

        for (int i = 0; i < dp.length; i++ {
            for (int j = 0; j < dp[i].length; j++) {

                if (i == 0) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else if (j == 0) {
                    dp[i][j] = 0;
                } else {

                    if (arr[i - 1] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.min((1 + dp[i][j - arr[i - 1]]), dp[i - 1][j]);
                    }
                }
            }
        }

        return dp[n][tar];
    }

}