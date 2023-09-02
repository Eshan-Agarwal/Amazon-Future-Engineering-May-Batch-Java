public class MergeTwoSortedArr {

    // Time = O(m + n)
    // Space = O(m + n)
    public static void main(String[] args) {
        int[] arr1 = new int[] {-2, 5, 9, 11};
        int[] arr2 = new int[] {4, 6, 8};

        int[] mergeTwoSortedArr = mergeTwoSortedArray(arr1, arr2);

        for (int val: mergeTwoSortedArr) {
            System.out.print(val  + " ");
        }
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArr = new int[n + m];

        int i = 0; int j = 0; int k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            mergedArr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < m) {
            mergedArr[k] = arr2[j];
            k++;
            j++;
        }

        return mergedArr;
    }

}