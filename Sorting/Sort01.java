public class Sort01 {

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 1, 0, 1, 0, 0};

        solution(arr);
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void solution(int[] arr) {

        int i = 0; int j = 0;

        while (j < arr.length) {

            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}