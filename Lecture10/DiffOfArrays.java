public class DiffOfArrays {

    public static void main(String[] args) {

        int[] a2 = new int[]{1, 0, 0, 0};
        int[] a1 = new int[]{2, 6, 7};

        // a2 >= a1;

        int[] ans = new int[a2.length];
        int b = 0;

        int i = a2.length - 1;
        int j = a1.length - 1;
        int k = ans.length - 1;

        while (k >= 0) {
            int val1;
            int val2;
            val1 = a2[i];
            if (j >= 0) {
                val2 = a1[j];
            } else {
                val2 = 0;
            }
            if (val1 + b >= val2) {
                ans[k] = val1 + b - val2;
                b = 0;
            } else {
                ans[k] = val1 + b + 10 - val2;
                b = -1;
            }
            i--; j--; k--;
        }
        printArr(ans);
    }

    public static void printArr(int[] arr) {
        int idx = 0;

        while(idx < arr.length) {
            if (arr[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }

        for (int i = idx; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}