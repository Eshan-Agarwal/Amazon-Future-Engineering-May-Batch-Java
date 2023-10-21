public class HouseRobber {

    public static void main(String[] args) {
        int[] money = new int[] {2,7,9,3,1};
        System.out.println(houseRobM1(money));
    }

    public static int houseRobM1(int[] money) {

        int n = money.length;

        if (n == 1) return money[0];

        int[] dp = new int[n  + 1];

        dp[n] = money[n - 1];

        for (int i = n - 1; i >= 1; i--) {

            // HomeWork
            int max = 0;
            for (int j = i + 2; j < dp.length; j++) {
                max = Math.max(max, dp[j]);
            }
            dp[i] = money[i - 1] + max;
        }

        return Math.max(dp[1], dp[2]);
    }

    public static int houseRobM2(int[] money) {
        int n = money.length;

//        if (n == 1) return money[0];

        int include = money[0];
        int exclude = 0;

        for (int i = 1; i < n; i++) {

            int prevInclude = include;
            include = money[i] + exclude;
            exclude = 0 + Math.max(prevInclude, exclude);

        }

        return Math.max(include, exclude);
    }
}