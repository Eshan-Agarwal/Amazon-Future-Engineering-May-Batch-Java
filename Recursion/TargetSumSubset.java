public class TargetSumSubset {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50, 0, 0};

        int target = 60;

        solution(arr, target, 0, "", 0);
    }

    public static void solution(int[] arr, int tar, int idx, String set, int sum) {
        if (sum > tar) {
            return;
        }

        if (idx == arr.length) {
            if (sum == tar) {
                System.out.println(set);
                return;
            }
            return;
        }

        // element can come
        solution(arr, tar, idx + 1, set + arr[idx] + ", ", sum + arr[idx]);

        // element cannot come
        solution(arr, tar, idx + 1, set, sum);

    }

}