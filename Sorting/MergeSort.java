public class MergeSort {


    // Time = O(n logn)
    // Space = O(n)
    public static void main(String[] args) {
        int[] arr = new int[] {7, -2, 4, 1, 3};

        int[] sortedArr = solution(arr, 0, arr.length - 1);
        for (int val: sortedArr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int lo, int hi) {

        // base case
        if (lo == hi) {
            int[] bans = new int[1];
            bans[0] = arr[lo];
            return bans;
        }

        int mid = lo + (hi - lo) / 2;

        int[] lhsArr = solution(arr, lo, mid);
        int[] rhsArr = solution(arr, mid + 1, hi);

        return mergeTwoSortedArray(lhsArr, rhsArr);
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