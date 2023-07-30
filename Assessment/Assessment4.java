public class Assessment4 {

    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 1, 5, 6, 7};

        int n = arr.length;

        int i = 1;
        if (arr[0] < arr[1]) { // increase

            while(i < n - 1 && arr[i] < arr[i + 1]) {
                i++;
            }

        } else if (arr[0] > arr[1]){ // decrease
            while(i < n - 1 && arr[i] > arr[i + 1]) {
                i++;
            }
        }

        if (i == n - 1) {
            System.out.println(-1);
            return;
        } else {
            System.out.println(i);
            return;
        }
    }

}