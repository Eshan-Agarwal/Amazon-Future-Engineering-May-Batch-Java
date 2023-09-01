public class BubbleSort {

    // Time == O(N^2)
    // Space == O(1)
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1, 5};

        print(arr);

        solution(arr);

        print(arr);
    }

    public static void print(int[] arr) {

        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    public static void solution(int[] arr) {

        int n = arr.length;

        for (int iter = 1; iter < n; iter++) {

            for (int j = 0; j < n - iter; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }

        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}