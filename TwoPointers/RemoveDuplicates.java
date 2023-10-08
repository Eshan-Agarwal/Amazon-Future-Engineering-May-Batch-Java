public class removeDuplicates {

    public void testCode(int[] nums, int[] expectedArr, int k) {
        expectedArr = new int[]{0, 1, 2, 3, 4};

        assert k == expectedArr.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedArr[i];
        }
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int i = 0; int j = 0;

        while (j < n) {

            if (nums[i] == nums[j]) {
                j++;

            } else {
                nums[i + 1] = nums[j];
                i++; j++;
            }

        }

        return (i + 1);
    }
}