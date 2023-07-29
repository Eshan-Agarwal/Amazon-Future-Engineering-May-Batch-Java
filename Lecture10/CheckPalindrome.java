public class CheckPalindrome {

    public static void main(String[] args) {

        Input2DArray inputArr = new Input2DArray();
        int[][] arr = inputArr.input();

        System.out.println("Number of palincromic Rows: " + countPalindromicRows(arr));

    }

    public static int countPalindromicRows(int[][] arr) {

        int countRow = 0;
        for (int row = 0; row < arr.length; row++) {
            int[] rowArr = arr[row];
            if (is1DArrPalindrome(rowArr)) {
                countRow++;
            }
        }
        return countRow;
    }

    public static boolean is1DArrPalindrome(int[] arr) {

        int n = arr.length;
        int i = 0; int j = n - 1;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++; j--;
            } else {
                return false;
            }
        }
        return true;
    }

}