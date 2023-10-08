public class MoveZeros {

    public void moveZeros(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int i = 0; int j = 0;
        while (j < n) {

            if (j == 0) {
                j++;
            } else {
                swap(arr, i, j);
                i++; j++;
            }

        }

    }

    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}