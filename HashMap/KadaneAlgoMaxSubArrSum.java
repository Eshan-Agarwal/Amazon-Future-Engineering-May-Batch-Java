public class KadaneAlgoMaxSubArrSum {

    public static void main(String[] args) {

        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        int maxSoFar = Integer.MIN_VALUE;
        int currMax = 0;

        for (int val: arr) {

            currMax += val;
            maxSoFar = Math.max(maxSoFar, currMax);
            if (currMax < 0) {
                currMax = 0;
            }

        }

        System.out.println(maxSoFar);

    }
}