public class MoveZeros {

    public void moveZeros(int[] arr) {
        // int n = arr.length;
        // if (n == 0) return;

        // int i = 0; int j = 0;
        // while (j < n) {

        //     if (j == 0) {
        //         j++;
        //     } else {
        //         swap(arr, i, j);
        //         i++; j++;
        //     }

        // }

        int nextNonZeroIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nextNonZeroIdx] = arr[i];
                nextNonZeroIdx++;
            }
        }

        int numOfZeros = arr.length - nextNonZeroIdx;
        while (numOfZeros != 0) {
            arr[nextNonZeroIdx] = 0;
            numOfZeros--;
            nextNonZeroIdx++;
        }

    }

    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}