public class Triangle {

    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();

        int[][] dp = new int[m + 1][m  + 1];

        for (int row = m - 1; row >= 0; row--) {
            for (int col = row; col >= 0; col--) {
                dp[row][col] = triangle.get(row).get(col)
                                + Math.min(dp[row + 1][col], dp[row + 1][col + 1]);
            }
        }
        return dp[0][0];
    }

}