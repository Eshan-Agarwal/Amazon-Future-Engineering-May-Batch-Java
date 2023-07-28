public class NQueensCheck {

    public static void main(String[] args) {
        Input2DArray inputArr = new Input2DArray();
        int[][] chessBoard = inputArr.input();

        boolean isQueenSafe = nQueenCheck(chessBoard);
        if (isQueenSafe) {
            System.out.println("N Queens");
        } else {
            System.out.println("Danger");
        }
    }


    // Time = (n*n(4n)) --> n^3
    // Space = O(1)
    public static boolean nQueenCheck(int[][] chessBoard) {

        int n = chessBoard.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (isQueen(chessBoard[row][col])) {

                    // if curr queen is not safe
                    if (! isQueenSafe(chessBoard, row, col)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isQueen(int val) {
        return val == 1;
    }

    // Time == O(4n)
    public static boolean isQueenSafe(int[][] chessBoard, int row, int col) {

        int n = chessBoard.length;

        // 1st call
        for (int j = col - 1; j >= 0; j--) {
            if (isQueen(chessBoard[row][j])) {
                return false;
            }
        }

        // 2nd call
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (isQueen(chessBoard[i][j])) {
                return false;
            }
        }

        // 3rd call
        for (int i = row - 1; i >= 0; i--) {
            if (isQueen(chessBoard[i][col])) {
                return false;
            }
        }

        // 4th call
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (isQueen(chessBoard[i][j])) {
                return false;
            }
        }

        // 5th call
        for (int j = col + 1; j < n; j++) {
            if (isQueen(chessBoard[row][j])) {
                return false;
            }
        }

        // 6th call call
        for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
            if (isQueen(chessBoard[i][j])) {
                return false;
            }
        }

        // 7th call
        for (int i = row + 1; i < n; i++) {
            if (isQueen(chessBoard[i][col])) {
                return false;
            }
        }

        // 8th call
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (isQueen(chessBoard[i][j])) {
                return false;
            }
        }

        return true;

    }

}