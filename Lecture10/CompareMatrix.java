import java.util.Scanner;

public class CompareMatrix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // instance of Scanner

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] arr2 = new int[n2][m2];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if (n1 != n2 || m1 != m2) {

            System.out.println("Not Same");

        } else {

            boolean isSame = true;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        isSame = false;
                        break;
                    }
                }
                if (! isSame) {
                    break;
                }
            }
            if (isSame) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }

        }



    }

}