public class UniquePathII {

    public static void main(String[] args) {


    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }

        for (int i = obstacleGrid.length - 1; i >= 0; i--) {
            for (int j = obstacleGrid[i].length - 1; j >= 0; j--) {

                if (i == obstacleGrid.length - 1 && j == obstacleGrid[i].length - 1) {
                    if (obstacleGrid[i][j] != -1) {
                        obstacleGrid[i][j] = 1;
                    }
                } else if (i == obstacleGrid.length - 1) {

                    if (obstacleGrid[i][j] != -1) {
                        obstacleGrid[i][j] = obstacleGrid[i][j + 1];
                    }

                } else if (j == obstacleGrid[i].length - 1) {
                    if (obstacleGrid[i][j] != -1) {
                        obstacleGrid[i][j] = obstacleGrid[i + 1][j];
                    }
                } else {

                    if (obstacleGrid[i][j] != -1) {
                        if (obstacleGrid[i][j + 1] != -1) {
                            obstacleGrid[i][j] = obstacleGrid[i][j + 1];
                        }

                        if (obstacleGrid[i + 1][j] != -1) {
                            obstacleGrid[i][j] += obstacleGrid[i + 1][j];
                        }

                        if (obstacleGrid[i][j] == 0) {
                            obstacleGrid[i][j] = -1;
                        }
                    }

                }

            }
        }

        return obstacleGrid[0][0] == -1 ? 0 : obstacleGrid[0][0];
    }
}