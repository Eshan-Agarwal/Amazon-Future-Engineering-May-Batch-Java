public class Sort012 {

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 2, 1, 0, 0, 1, 2};

        solution(arr);
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void solution(int[] arr) {

        int n = arr.length;
        int i = 0; int j = 0; int k = n - 1;

        while (j <= k) {

            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1){
                j++;
            } else if (arr[j] == 2) {
                swap(arr, j, k);
                k--;
            }

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}