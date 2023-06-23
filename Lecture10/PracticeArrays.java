import java.util.Scanner;

public class PracticeArrays {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
//
        System.out.println("Enter size");
        int size = scn.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter arr elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
//        System.out.println("Enter element to found");
//        int d = scn.nextInt();
//
//        int idx = findElementInArr(arr, d);
//
//        if (idx == -1) {
//            System.out.println("Not Found");
//        } else {
//            System.out.println("Found at idx: " + idx);
//        }


        System.out.println("Span of Arr: " + spanOfArr(arr));
    }

    public static int spanOfArr(int[] arr) {

        int currMax = Integer.MIN_VALUE;
        int currMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currVal = arr[i];
            if (currVal > currMax) {
                currMax = currVal;
            }

            if (currVal < currMin) {
                currMin = currVal;
            }
        }

        int span = currMax - currMin;
        return span;

    }

    public static int findElementInArr(int[] arr, int d) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return -1;
    }

}