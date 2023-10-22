public class MazePath {

    public static void main(String[] args) {

    }

    public static int getMinCost(int[][] maze) {

        int m = maze.length;
        int n = maze[0].length;

        int[][] dp = new int[m][n];

        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 0; col--) {

                if (row == m - 1 && col == n - 1) {
                    dp[row][col] = maze[row][col];

                } else if (row == m - 1) {
                    dp[row][col] = maze[row][col] + dp[row][col + 1];

                } else if (col == n - 1) {
                    dp[row][col] = maze[row][col] + dp[row + 1][col];

                } else {
                    dp[row][col] = maze[row][col] + Math.min(dp[row][col + 1], dp[row + 1][col]);
                }

            }
        }

        return dp[0][0];
    }

}