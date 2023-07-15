import java.util.Scanner;

public class Print2DArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // normal for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("********************************");

        // for each loop
        for (int[] rowArr: arr) {
            for (int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }




    }

    public static void forEachLoop1DArr() {
        int[] a = new int[]{1, 2, 3, 4};

        for (int idx = 0; idx < a.length; idx++) {
            System.out.print(a[idx]);
        }

        System.out.println("***********************************");

        // for each loop
        for (int val: a) {
            System.out.print(val + " ");
        }

        String[] strArr = new String[]{"My", "name", "is", "Eshan"};

        for (String str: strArr) {
            System.out.print(str + " ");
        }

        System.out.println();

    }
}