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


//        System.out.println("Span of Arr: " + spanOfArr(arr));
//        System.out.println("enter the num");
//        int num = scn.nextInt();
//        firstAndLastIDXOfElementMethod1(arr, num);

        revereArrMethod2(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int val: arr) { // for each
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void firstAndLastIDXOfElementMethod1(int[] arr, int num) {

        int fi = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                if (fi == -1) {
                    fi = i;
                }
            }
        }
        int li = fi + count - 1;
        System.out.println("First IDX: " + fi);
        System.out.println("Last IDX: " + li);
    }

    // Space --> O(N)
    public static int[] revereArrMethod1(int[] arr) {
        // write your code

        int n = arr.length;
        int[] ansArr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            ansArr[n-i] = val;
        }

        return ansArr;
    }

    // space com = O(1)
    // Time space == O(n/2)
    public static int[] revereArrMethod2(int[] arr) {
        // write your code
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void firstAndLastIDXOfElementMethod2(int[] arr, int num) {

        int fi = -1;
        int li = -1;
//        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
//                count++;
                if (fi == -1) {
                    fi = i;
                    li = i;
                } else {
                    li = i;
                }
            }
        }
//        int li = fi + count - 1;
        System.out.println("First IDX: " + fi);
        System.out.println("Last IDX: " + li);
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