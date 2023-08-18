public class DisplayArr {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        solution(arr, 0);
    }

    public static void solution(int[] arr, int idx) {

        // base case
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        solution(arr, idx + 1);
    }



}