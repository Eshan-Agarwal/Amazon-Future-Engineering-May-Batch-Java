import java.util.Scanner;

public class InterChangeTheRow {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // T(n) = O(m) --> m = no. of columns
        for (int col = 0; col < arr[0].length; col++) {
            swap(arr, col, 0, n - 1);
        }

        System.out.println("******************************");
        for (int[] rowArr: arr) {
            for (int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr, int col, int firstRow, int lastRow) {
        int temp = arr[firstRow][col];
        arr[firstRow][col] = arr[lastRow][col];
        arr[lastRow][col] = temp;
    }
}