public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[] {7, 4, -2, 1, 3};

        quickSort(arr, 0, arr.length - 1);
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int lo, int hi) {

        if (lo >= hi) {
            return;

        }

        int piviElement = arr[hi];

        int pidx = partitionArr(arr, piviElement);

        quickSort(arr, lo, pidx - 1);
        quickSort(arr, pidx + 1, hi);
    }

    public static int partitionArr(int[] arr, int pivitEle) {

        int i = 0; int j = 0;

        while(j < arr.length) {

            if (arr[j] <= pivitEle) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }

        }

        return (i - 1);
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}