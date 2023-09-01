public class InsertionSort {

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

            // validation of inserted element
            for (int j = iter - 1; j >= 0; j--) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else { // optimisation
                    break;
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