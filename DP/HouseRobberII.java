import java.util.*;
public class HouseRobberII {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 1};

        System.out.println(rob(nums));
    }

    public static int rob1(int[] nums) {
        int inc = nums[0];
        int exc = 0;

        for (int i = 1; i < nums.length; i++) {
            int temp = inc;
            inc = nums[i] + exc;
            exc = Math.max(temp, exc);
        }

        return Math.max(inc, exc);
    }

    public static int rob2(int[] nums) {
        int inc = nums[0];
        int exc = 0;

        for (int i = 1; i < 2 * nums.length; i++) {
            int temp = inc;
            inc = nums[i % nums.length] + exc;
            exc = Math.max(temp, exc);
        }

        return Math.max(inc, exc);
    }


    public static int rob(int[] nums) {

        if (nums.length == 1) return nums[0];

        int withoutCircle = rob1(nums);
        int withCircle = rob2(nums);

        return withCircle - withoutCircle;
    }
}