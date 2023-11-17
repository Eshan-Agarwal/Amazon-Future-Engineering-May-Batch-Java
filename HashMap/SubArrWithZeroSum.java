import java.util.HashMap;
public class SubArrWithZeroSum {

    public static void main(String[] args) {

        int[] arr = new int[]{-2, 2, -8, 1, 7};

        HashMap<Integer, Integer> fmap = new HashMap<>();

        fmap.put(0, 1); // when whole arr sum is zero

        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }

        int ans = 0;
        for (int j = 0; j < pre.length; j++) {

            int val = pre[j];
            if (fmap.containsKey(val)) {
                ans += fmap.get(val);
                fmap.put(val, fmap.get(val) + 1);
            } else {
                fmap.put(val, 1);
            }
        }
        System.out.println(ans);
    }

}