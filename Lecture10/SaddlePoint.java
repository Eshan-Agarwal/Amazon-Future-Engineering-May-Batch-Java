public class SaddlePoint {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{11,12,13,14},
                                  {21,22,23,24},
                                  {31,32,33,34},
                                  {41,42,43,44}};

        solution(arr);

    }

    public static void solution(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // minEleInRow
            int min = arr[i][0];
            int col = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    col = j;
                }
            }

            // VerifyInCol
            boolean isSaddlePoint = true;
            for (int row = 0; row < n; row++) {
                if (min < arr[row][col]) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point: " + min);
                return;
            }

        }

        System.out.println("No Saddle Point exist");

    }
}