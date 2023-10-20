import java.util.*;

public class BasicsDP {

    public static void main(String[] args) {

        int n = 51;

//        long[] dp = new long[n + 1]; // 1D arr
//        Arrays.fill(dp, -1);
//        long ans = fibMemoization(n, dp);
//        int ans = fibRecursion(n);
        long ans = fibTabulation(n);
        System.out.println(ans);
//        System.out.println(dp[n]);

    }

    public static int fibRecursion(int n) {

        if (n == 0 || n == 1) return n;

        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public static long fibMemoization(int n, long[] dp) {

        if (n == 0 || n == 1) return n;

        if (dp[n] != -1) return dp[n];

        long ans = fibMemoization(n - 1, dp) + fibMemoization(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    public static long fibTabulation(int n) {
        if (n == 0 || n == 1) return n;

        long[] dp = new long[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // recurse relation
        }
        return dp[n];
    }

}