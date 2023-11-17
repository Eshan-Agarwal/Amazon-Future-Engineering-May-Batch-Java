public class SubArrWithKDiffInt {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2,3};
        int k = 2;

        int ans = countDistincEleSubArr(arr, k) - countDistincEleSubArr(arr, k - 1);
        System.out.println(ans);
    }

    public static int countDistincEleSubArr(int[] arr, int k) {
        Map<Integer, Integer> fmap = new HashMap<>();
        int si = 0; int ei = 0; int countDistinctEle = 0; int ans = 0;

        while (ei < arr.length) {

            // aquire
            if (fmap.containsKey(arr[ei])) {
                fmap.put(arr[ei], fmap.get(arr[ei]) + 1);
            } else {
                countDistinctEle++;
                fmap.put(arr[ei], 1);
            }

            // release
            while (countDistinctEle > k) {
                fmap.put(arr[si], fmap.get(arr[si]) - 1);
                if (fmap.get(arr[si]) == 0) {
                    fmap.remove(arr[si]);
                    countDistinctEle--;
                }
                si++;
            }

            ans += (ei - si + 1);
            ei++;

        }
        return ans;
    }

}