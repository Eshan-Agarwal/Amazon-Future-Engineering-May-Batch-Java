public class SpiralPrint {

    // Time --> O(N)
    // Space --> O(1) --> do not consider input arr in space comp
    public static void main(String[] args) {
        int[][] arr = new int[][]{{11,12,13,14},
                                 {21,22,23,24},
                                 {31,32,33,34}};

        sol(arr);
    }

    public static void sol(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int minr = 0;
        int minc = 0;
        int maxr = m - 1;
        int maxc = n - 1;

        int totalElements = m * n;
        int countElements = 0;
        while(countElements < totalElements) {

            // Step1
            for (int i = minr; i <= maxr && countElements < totalElements; i++) {
                System.out.print(arr[i][minc] + " ");
                countElements++;
            }
            minc++;

            // Step2
            for (int i = minc; i <= maxc && countElements < totalElements; i++) {
                System.out.print(arr[maxr][i] + " ");
                countElements++;
            }
            maxr--;

            // Step3
            for (int i = maxr; i >= minr && countElements < totalElements; i--) {
                System.out.print(arr[i][maxc] + " ");
                countElements++;
            }
            maxc--;

            //Step4
            for (int i = maxc; i >= minc && countElements < totalElements; i--) {
                System.out.print(arr[minr][i] + " ");
                countElements++;
            }
            minr++;

            System.out.println();

        }

    }

}