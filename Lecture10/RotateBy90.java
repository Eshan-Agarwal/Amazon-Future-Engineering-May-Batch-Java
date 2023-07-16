public class RotateBy90 {

    public static void main(String[] args) {
        Input2DArray inputObj = new Input2DArray();
        int[][] arr = inputObj.input();

        transpose(arr);
        reverseRowByRow(arr);
        inputObj.print(arr);
    }

    public static void transpose(int[][] arr) {

        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }

    }

    public static void reverseRowByRow(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {
            int fc = 0; int lc = arr[row].length - 1;
            while(fc < lc) {
                int temp = arr[row][fc];
                arr[row][fc] = arr[row][lc];
                arr[row][lc] = temp;
                fc++;
                lc--;
            }
        }

    }

    public static void swap(int[][] arr, int i, int j) {

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

    }

}