public class MaximumPoints {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,1};

        int k = 3;
        int minWindowSum = getMinWindowSum(arr, arr.length - k);
        int totalArrSum = getTotalArrSum(arr);

        System.out.println(totalArrSum - minWindowSum)
    }

    public static void Method2(int[] arr, int k) {

        int currSum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        ans = currSum;

        int i = k - 1; int j = arr.length - 1;

        while (i >= 0) {
            currSum = currSum - arr[i] + arr[j];
            i--; j--;
            ans = Math.max(ans, currSum);
        }

        return ans;

    }


    public static int getTotalArrSum(int[] arr) {
        int ans = 0;
        for (int val: arr) {
            ans += val;
        }
        return ans;
    }

    public static int getMinWindowSum(int[] arr, int windowLen) {

        int currSumWindow = 0;
        int minWindowSum = Integer.MAX_VALUE;

        for (int i = 0; i < windowLen; i++) {
            currSumWindow += arr[i];
        }
        minWindowSum = currSumWindow;

        int i = 0; int j = windowLen;
        while (j < arr.length) {

            currSumWindow = currSumWindow - arr[i] + arr[j];
            i++; j++;
            minWindowSum = Math.min(minWindowSum, currSumWindow);

        }

        return minWindowSum;

    }



}