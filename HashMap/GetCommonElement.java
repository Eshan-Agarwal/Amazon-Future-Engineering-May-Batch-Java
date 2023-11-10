import java.util.HashSet;
public class GetCommonElement {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,5,9,8,5,5,8,0,3};
        int[] arr2 = new int[]{9,7,1,0,3,6,5,9,1,1,8,0,2,4,2,9,1,5};

        getCommonElement(arr1, arr2);
    }

    public static void getCommonElement(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int val: arr1) {
            set.add(val);
        }

        for (int val: arr2) {
            if (set.contains(val)) {
                System.out.println(val);
                set.remove(val);
            }
        }
    }
}