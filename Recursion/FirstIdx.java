public class FirstIdx {

    public static void main(String[] args) {
        int[] arr = new int[]{15, 11, 14, 4, 4, 9};

        int key = 10;
        System.out.println("First IDX: " + solution(arr, 0, key));
    }

    public static ArrayList<Integer> solution(int[] arr, int idx, int key) {

        if (idx == arr.length) {
            return - 1;
        }

        if (arr[idx] == key) {
            return idx;
        }

        return solution(arr, idx + 1, key);

    }

}