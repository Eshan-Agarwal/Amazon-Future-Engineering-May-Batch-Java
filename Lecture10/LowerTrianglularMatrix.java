public class LowerTrianglularMatrix {

    public static void main(String[] args) {

      Input2DArray inputObj = new Input2DArray();
      int[][] arr = inputObj.input();

      lowerTrianglularMatrix(arr);
    }

    public static void lowerTrianglularMatrix(int[][] arr) {

        System.out.println("*******************************");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (i >= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();

        }

    }

}