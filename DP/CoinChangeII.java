public class CoinChangeII {

    public static void main(String[] args) {

    }

    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length + 1][amount + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    // exclude call
                    dp[i][j] = dp[i - 1][j];

                    // include call
                    if (j >= coins[i - 1]) {
                        dp[i][j] += dp[i][j - coins[i - 1]];
                    }
                }
            }
        }
        return dp[coins.length][amount];
    }
}