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
//
//        revereArrMethod2(arr);
//        printArr(arr);
//        subArrays(arr);
//        alternatePrint(arr);
//        System.out.println("Enter rotation value");
//        int r = scn.nextInt();
//        rotateArr(arr, r);
        System.out.println("Enter tar value");
        int tar = scn.nextInt();
        countPairWithGivenSum(arr, tar);

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

    public static void method() {
        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;
//        int a = 1;


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

    public static void subArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void alternatePrint(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void reverse(int[] arr, int si, int ei) {
       while (si < ei) {
           int temp = arr[si];
           arr[si] = arr[ei];
           arr[ei] = temp;
           si++; ei--;
       }
    }

    public static void rotateArr(int[] arr, int r) {
        int n = arr.length;
        // code here
        r = r % n;
        if (r < 0) {
            r += n;
        }
        reverse(arr, 0, n - 1 - r);
        reverse(arr, n - r, n - 1);
        reverse(arr, 0, n - 1);
        printArr(arr);
    }

    public static void  countOddPair(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum % 2 == 1) { // odd
                    System.out.println(arr[i] + " " + arr[j]);
                    System.out.println(arr[j] + " " + arr[i]);
                }
            }
        }

    }

    public static void  countPairWithGivenSum(int[] arr, int tar) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum == tar) {
                    System.out.println(arr[i] + " " + arr[j]);
                    System.out.println(arr[j] + " " + arr[i]);
                }
            }
        }

    }

}