import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {

        // intArr();
//        inpurInArr();
//        inputInStrArr();
        timeCompArr();
    }

    public static void timeCompArr() {
        int[] arr = new int[5];
        inputArr(arr);

        //1
        // O(N)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2 --> t1 = t2
        System.out.println(arr[0]); // --> t1  --> O(1)
        System.out.println(arr[4]); // --> t2  --> O(1)




    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void inpurInArr() {

        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        printArr(arr);

    }

    public static void inputInStrArr() {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        String[] strArr = new String[size];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scn.next();
        }

        // printArr
        for(String str: strArr) {
            System.out.print(str + ", ");
        }
        System.out.println();

    }

    public static void printArr(int[] arr) {

        // for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // for-each loop
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    public static void intArr() {

        // creation of arr
        int[] arr = new int[6];

        // Addtion in arr
        // 1st position --> 0th idx
        arr[0] = 10;
        // 2nd position --> 1st idx
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
//        arr[6] = 70; // ---> Error is arrayIndexOutOfBounds

        int val = arr[0];
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);

//        // Update elements
        System.out.println("Before Update: " + arr[2]);
        arr[2] = 200;
        System.out.println("After Update: " + arr[2]);
//
//        // Default Values of cell in arr --> 0
        System.out.println("Default values of cell in arr");
        int[] defaultArr = new int[10];
        System.out.println(defaultArr[8]);
        System.out.println(defaultArr[4]);
//
//        // lenght of arr
        System.out.println("Len of arr: " + arr.length);
        System.out.println("Len of defaultArr: " + defaultArr.length);
//
//        // iteration in arr
        System.out.println("Loops in arrays");
        System.out.println("Using for loops in arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//
        System.out.println();
//
        System.out.println("Iteration in defaultArr");
        for (int i = 0; i < defaultArr.length; i++) {
            System.out.print(defaultArr[i] + " ");
        }
        System.out.println();
//
//        // while loops
        System.out.println("Using while loops in arr");
        int idx = 0;
        while(idx < arr.length) {
            System.out.print(arr[idx] + " ");
            idx++;
        }
        System.out.println();


    }

}