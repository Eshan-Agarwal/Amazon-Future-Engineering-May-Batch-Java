import java.util.Scanner;

public class MatrixMul {

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

        int m2 = scn.nextInt();
        int n2 = scn.nextInt();
        int[][] b = new int[m2][n2];

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = scn.nextInt();
            }
        }

        if (n1 != m2) {
            System.out.println("Invalid Matrix input");
        } else {

            int[][] c = new int[m1][n2];

            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    for (int k = 0; k < n1; k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
//                    c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j] .... 100 times;
                }
            }

            // for each
            for (int[] rowArr: c) {
                for (int val: rowArr) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

        }
    }

    public static void sol(int[] arr) {
        // write code here

        return arr;
    }
}