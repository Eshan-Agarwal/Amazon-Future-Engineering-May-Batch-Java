import java.util.Scanner;

public class Input2DArray {

    public int[][] input() {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = n;

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public void print(int[][] arr) {
        for (int[] rowArr: arr) {
            for(int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}