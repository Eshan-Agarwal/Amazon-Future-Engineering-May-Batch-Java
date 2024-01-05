public class RottenOranges {


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
        
        System.out.println(rottenOranges(grid));
    }
    
    static int[][] DIRS = new int[][] {
        {-1, 0}, 
        {1, 0},
        {0, 1},
        {0, -1}
    };

    public static int rottenOranges(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        if (m == 0) return 0;

        Queue<int[]> q = new ArrayDeque<>();

        int numOfFreshOranges = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    numOfFreshOranges++;

                } else if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                    
                }

            }
        }


        int minTimeNeededToRottenOranges = 0;

        while(q.size() > 0) {

            // processing oranges level wise
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                
                int[] rottenOrange = q.remove();

                int r = rottenOrange[0];
                int c = rottenOrange[1];

                for (int[] dir: DIRS) {
                    int row = r + dir[0];
                    int col = c + dir[1];

                    if (row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == 1) {
                        numOfFreshOranges--;
                        grid[row][col] = 2;
                        q.add(new int[]{row, col});
                    }
                }

            }

            if (q.size() > 0) {
                minTimeNeededToRottenOranges++;
            }

        }

        return (numOfFreshOranges == 0) ? minTimeNeededToRottenOranges : -1;
    }

}