public class SnakePattern {

    public static void main(String[] args) {
        Input2DArray inputObj = new Input2DArray();
        int[][] arr = inputObj.input();

        System.out.println("***************************");
        snakePattern(arr);
    }

    public static void snakePattern(int[][] arr) {

        for (int col = 0; col < arr[0].length; col++) {

            if (col % 2 == 0) {

                // print top to bottom
                for (int row = 0; row < arr.length; row++) {
                    System.out.println(arr[row][col]);
                }
            } else {
                // print bottom to top
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.println(arr[row][col]);
                }
            }

        }

    }

}