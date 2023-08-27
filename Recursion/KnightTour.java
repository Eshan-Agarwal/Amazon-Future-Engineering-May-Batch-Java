public class KnightTour {

    public static void main(String[] args) {

        int n = 5;

        int i = 2;
        int j = 0;

        int[][] chessBoard = new int[n][n];
        solution(chessBoard, i, j, 1);

    }

    public static void printChessBoard(int[][] chessBoard) {

        System.out.println("**********************************************");
        for (int[] rowArr: chessBoard) {
            for (int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void solution(int[][] chessBoard, int i, int j, int positionOfKnight) {

        if (i < 0 || j < 0 || i >= chessBoard.length || j >= chessBoard.length || chessBoard[i][j] != 0) {
            return;
        }

        if (positionOfKnight == chessBoard.length * chessBoard.length) {
            chessBoard[i][j] = positionOfKnight;
            printChessBoard(chessBoard);
            chessBoard[i][j] = 0;  // backtracking
            return;
        }

        chessBoard[i][j] = positionOfKnight;
        solution(chessBoard, i - 1, j - 2, positionOfKnight + 1);
        solution(chessBoard, i - 2, j - 1, positionOfKnight + 1);
        solution(chessBoard, i - 2, j + 1, positionOfKnight + 1);
        solution(chessBoard, i - 1, j + 2, positionOfKnight + 1);
        solution(chessBoard, i + 1, j + 2, positionOfKnight + 1);
        solution(chessBoard, i + 2, j + 1, positionOfKnight + 1);
        solution(chessBoard, i + 2, j - 1, positionOfKnight + 1);
        solution(chessBoard, i + 1, j - 2, positionOfKnight + 1);
        chessBoard[i][j] = 0; // backtracking

    }

}