import java.util.Scanner;

public class Transpose {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int m1 = scn.nextInt();
        int n1 = scn.nextInt();
        int[][] a = new int[m1][n1];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        sol(a);
        print(a);
    }

    public static void sol(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void print(int [][] arr) {

        for (int[] rowArr: arr) {
            for (int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

}