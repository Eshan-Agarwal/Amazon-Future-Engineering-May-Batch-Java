public class NQueens {

    public static void main(String[] args) {
        int n = 4;

        int[][] chessBoard = new int[n][n];
        solution(chessBoard, "", 0);
    }

    public static void solution(int[][] chessBoard, String ans, int row) {
        if (row == chessBoard.length) {
            System.out.println(ans);
            return;
        }
        for (int col = 0; col < chessBoard[row].length; col++) {
            if (chessBoard[row][col] == 0 && isQueenSafe(chessBoard, row, col)) {
                chessBoard[row][col] = 1;
                solution(chessBoard, ans + row + "-" + col + ", ", row + 1);
                chessBoard[row][col] = 0; // backTracking
            }
        }
    }

    public static boolean isQueenSafe(int[][] chessBoard, int row, int col) {
        int n = chessBoard.length;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

}