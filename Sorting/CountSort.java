public class CountSort {

    public static void main(String[] args) {
        int[] arr = new int[] {7, -2, 1, 3, 4};

        int[] ans = solution(arr);
        for (int val: ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int val: arr) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        int freqArrSize = max - min + 1;
        int[] freqArr = new int[freqArrSize];

        mapFreqArr(arr, freqArr, min);

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {

            int pos = freqArr[arr[i] - min] - 1;
            ans[pos] = arr[i];
            freqArr[arr[i] - min]--;
        }

        return ans;
    }

    public static void mapFreqArr(int[] arr, int[] freqArr, int min) {

        // maping of freq
        for (int val: arr) {
            freqArr[val - min]++;
        }

        // prefix sum array
        for(int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }
    }

}