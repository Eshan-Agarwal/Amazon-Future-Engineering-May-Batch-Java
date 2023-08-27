public class FloodFill {

    public static void main(String[] args) {

        int[][] arr = new int[][] {
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        solution(arr, "", 0, 0, visited);

    }

    public static void solution(int[][] arr, String psf, int i, int j, boolean[][] visited) {

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length ||
            arr[i][j] == 1 || visited[i][j] == true) {
            return;
        }
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[i][j] = true;
        // top call
        solution(arr, psf + "t", i - 1, j, visited);
        // right call
        solution(arr, psf + "r", i, j + 1, visited);
        // down call
        solution(arr, psf + "d", i + 1, j, visited);
        // left call
        solution(arr, psf + "l", i, j - 1, visited);
        // backtracking step
        visited[i][j] = false;

    }

}