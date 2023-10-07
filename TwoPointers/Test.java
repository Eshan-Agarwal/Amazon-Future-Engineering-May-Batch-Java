import java.util.*;
public class Test {
    public static void main(String[] args) {
        ThreeSum c = new ThreeSum();
        List<List<Integer>> ans = c.getTriplets(new int[] {-1,0,1,2,-1,-4});
        System.out.println(ans);
    }
}