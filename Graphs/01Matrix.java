public class 01Matrix {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        
        int m = scn.nextInt();
        int n = scn.nextInt();
        
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scn.nextInt();
            }
        }
        
        solution(grid);
        for (int[] row: grid) {
            for (int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int[][] DIRS = new int[][] {
        {-1, 0}, 
        {1, 0},
        {0, 1},
        {0, -1}
    };


    static class Pair {

        int r;
        int c;
        int dist;
        
        Pair(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }

    }

    public static void solution(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = -1;
                } else if (grid[i][j] == 1) {
                    q.add(new Pair(i, j, 0));
                    grid[i][j] = 0;
                }
            }
        }

        while (q.size () > 0) {

            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {

                Pair rem = q.remove();

                int r = rem.r;
                int c = rem.c;
                int parentDist = rem.dist;

                for (int[] dir: DIRS) {
                    int row = r + dir[0];
                    int col = c + dir[1];

                    if (row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == -1) {
                        grid[row][col] = parentDist + 1;
                        q.add(new Pair(row, col, parentDist + 1));
                    }
                }

            }

        }

    } 

}