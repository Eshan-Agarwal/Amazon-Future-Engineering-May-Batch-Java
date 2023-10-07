public class TwoSumSortedArr {

    public int[] solution(int[] arr, int tar) {

        int n = arr.length;
        if (n == 0) return new int[2];

        int i = 0; int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum < tar) {
                i++;
            } else if (sum > tar) {
                j--
            } else {
                int[] ans = new int[2];
                ans[0] = i + 1; // store position
                ans[1] = j + 1;
            }
        }

    }

}