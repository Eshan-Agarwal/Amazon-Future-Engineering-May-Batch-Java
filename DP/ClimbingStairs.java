import java.util.*;
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(memoization(n, dp));
    }

    public static int memoization(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;

        if (dp[n] != -1) return dp[n];

        int ans = memoization(n - 1, dp) + memoization(n - 2, dp);
        dp[n] = ans;
        return ans;

    }
}