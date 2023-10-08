import java.util.Arrays;
import java.util.*;
public class ThreeSum {

    public List<List<Integer>> getTriplets(int[] arr) {
        int n = arr.length;
        if (n == 0) return new ArrayList<>();

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int tar = -arr[i];

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[j] + arr[k];
                if (sum > tar) {
                    k--;
                } else if (sum < tar) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    break; // to remove duplicate
                }
            }
        }
        return ans;
    }

}