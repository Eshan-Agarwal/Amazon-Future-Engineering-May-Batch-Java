public class Convert1DTo2D {

    public static void main(String[] args) {

        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        int p = 4;
        int q = 2;

        int[][] ans = new int[p][q];

        int idx = 0; // index for 1d Arr

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
//                ans[i][j] = a[idx];
//                idx++;
                ans[i][j] = a[idx++];
            }
        }
        for (int[] rowArr: ans) {
            for (int val: rowArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

}