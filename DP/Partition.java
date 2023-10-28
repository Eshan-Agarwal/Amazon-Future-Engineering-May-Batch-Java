public class Partition {
    public boolean canPartition(int[] nums) {

        int n = nums.length;
        int sum = 0;
        for (int val: nums) {
            sum += val;
        }

        if (sum % 2 == 1) {
            return false;
        }

        return canPartitionHelper(nums, sum/2);
    }

    public boolean canPartitionHelper(int[] nums, int tar) {
        boolean[][] dp = new boolean[nums.length + 1][tar + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else {
                    if (nums[i - 1] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                    }
                }
            }
        }

        return dp[nums.length][tar];
    }
}