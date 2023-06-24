import java.util.Scanner;

public class Arrays2D {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter rows");
        int row = scn.nextInt();
        System.out.println("Enter cols");
        int col = scn.nextInt();

        int[][] arr = inputIn2DArr(row, col);
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        System.out.println("Your 2D Arr");

        // Simple for loop
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // using for-each loop
        for (int[] singleArr: arr) {
            for (int val: singleArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] inputIn2DArr(int row, int col) {

        int[][] arr = new int[row][col];

        // rows
        for (int i = 0; i < arr.length; i++) {
            // cols
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

}