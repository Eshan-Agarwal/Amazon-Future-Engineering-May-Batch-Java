public class ContainerWithMostWater {

    public int getMostWater(int[] arr) {

        int n = arr.length;
        if (n == 0) return 0;

        int i = 0; int j = n - 1;
        int maxWaterStored = 0;
        while (i < j) {

            if (arr[i] <= arr[j]) {
                int area = arr[i] * (j - i);
                maxWaterStored = Math.max(maxWaterStored, area);
                i++;
            } else {
                int area = arr[j] * (j - i);
                maxWaterStored = Math.max(maxWaterStored, area);
                j--;
            }
        }
        return maxWaterStored;
    }

}