public class SelectionSort {

    // Time == O(N^2)
    // Space == O(1)
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 1, 5};

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

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }

    }

    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}