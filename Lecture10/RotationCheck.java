public class RotationCheck {

    public static void main(String[] args) {
        Input2DArray inputArr = new Input2DArray();
        int[][] arr = inputArr.input();

        if (isRotationMat(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isRotationMat(int[][] arr) {

        String concatStr = "";
        for (int col = 0; col < arr.length; col++) {
            concatStr = concatStr + arr[0][col];
        }

        concatStr = concatStr + concatStr;

        for (int row = 1; row < arr.length; row++) {
            String currRowStr = "";
            for (int col = 0; col < arr.length; col++) {
                currRowStr = currRowStr + arr[row][col];
            }
            if (concatStr.indexOf(currRowStr) == -1) {
                return false;
            }
        }

        return true;
    }

}