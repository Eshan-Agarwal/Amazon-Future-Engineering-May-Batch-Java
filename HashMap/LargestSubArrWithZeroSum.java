public class LargestSubArrWithZeroSum {

    public static void main(String[] args) {

    }

    public static int maxSubArrLenWithZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Prefix Ele vs Index

        map.put(0, - 1); // whole arr sum is zero

        int[] preFixArr = int[arr.length];
        preFixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preFixArr[i] = arr[i] + preFixArr[i - 1];
        }

        int maxLen = 0;
        for (int i = 0; i < preFixArr.length; i++) {
            if (map.containsKey(val)) {
                int temp = i - map.get(val);
                maxLen = Math.max(maxLen, temp);

            } else {
                map.put(val, i);
            }
        }

        return maxLen;
    }

}