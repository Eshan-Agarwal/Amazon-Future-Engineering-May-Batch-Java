import java.util.Map;
import java.util.HashMap;

public class SubArrWithKDistinctInteger {

    public int subArrWithKDistinctIntegers(int[] arr, int k) {
        return subArrWithAtMostKDistinctInteger(arr, k) - subArrWithAtMostKDistinctInteger(arr, k - 1);
    }

    public int subArrWithAtMostKDistinctInteger(int[] arr, int k) {
        if (k < 0) return 0;

        int n = arr.length;
        if (n == 0) return 0;

        int si = 0; int ei = 0; int countDistinctIntWindow = 0; int ans = 0;

        Map<Integer, Integer> fmap = new HashMap<>(); // at most k elements

        while(ei < n) {
            if (fmap.containsKey(arr[ei])) {
                fmap.put(arr[ei], fmap.get(arr[ei]) + 1);
            } else {
                countDistinctIntWindow++;
                fmap.put(arr[ei], 1);
            }

            while (countDistinctIntWindow > k) {
                fmap.put(arr[si], fmap.get(arr[si]) - 1);
                if (fmap.get(arr[si]) == 0) {
                    countDistinctIntWindow--;
                    fmap.remove(arr[si]);
                }
                si++;
            }
            ans += (ei - si + 1);
            ei++;
        }

        return ans;

    }

    public int subArrWithAtMostKDistinctIntegerWithoutMap(int[] arr, int k) {
        if (k < 0) return 0;

        int n = arr.length;
        if (n == 0) return 0;

        int si = 0; int ei = 0; int countDistinctIntWindow = 0; int ans = 0;

        // Map<Integer, Integer> fmap = new HashMap<>(); // at most k elements

        int[] fmap = new int[20001];

        while(ei < n) {
            if (fmap[arr[ei]] > 0) {
                fmap[arr[ei]]++;
            } else {
                countDistinctIntWindow++;
                fmap[arr[ei]] = 1;
            }

            while (countDistinctIntWindow > k) {
                fmap[arr[si]]--;
                if (fmap[arr[si]] == 0) {
                    countDistinctIntWindow--;
                }
                si++;
            }
            ans += (ei - si + 1);
            ei++;
        }

        return ans;

    }

}