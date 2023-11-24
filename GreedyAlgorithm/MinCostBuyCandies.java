public class MinCostBuyCandies {

    public static void main(String[] args) {

    }

    public int minimumCost(int[] cost) {

         Arrays.sort(cost);
         reverse(cost);

         int ans = 0;
         for (int i = 0; i < cost.length; i++) {
             if ((i+1) % 3 != 0) {
                 ans += cost[i];
             }
         }

         return ans;

        // HomeWork
//        int[] freq = new int[101];


    }


    public void reverse(int[] cost) {

        int i = 0; int j = cost.length - 1;

        while (i < j) {
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
            i++; j--;
        }

    }
}