import java.util.Arrays;
public class TarSumPair {

    public static void main(String[] args) {
        int[] arr = new int[] {12, 9, -48, 100, 43, 84, 74, 86, 60};

        int tar = 160;
        solution(arr, tar);
    }

    public static void solution(int[] arr, int tar) {

        Arrays.sort(arr);
        int i = 0; int j = arr.length - 1;

        while (i < j) {

            int val = arr[i] + arr[j];

            if (val > tar) {
                j--;
            } else if (val < tar) {
                i++;
            } else if (val == tar) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }

        }

    }

}