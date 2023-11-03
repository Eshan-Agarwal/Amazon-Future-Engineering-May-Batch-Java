import java.util.HashMap;

public class GetCommonElementII {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,1,2,2,2,3,5};
        int[] a2 = new int[]{1,1,1,2,2,4,5};

        printCommonElements(a1, a2);
    }

    public static void printCommonElements(int[] a1, int[] a2) {
        HashMap<Integer, Integer> fMap1 = new HashMap<>();

        for (int val: a1) {
            fMap1.put(val, fMap1.getOrDefault(val, 0) + 1);
        }

        for (int val: a2) {
            if (fMap1.containsKey(val)) {
                System.out.println(val);
                fMap1.put(val, fMap1.get(val) - 1);
                if (fMap1.get(val) == 0) {
                    fMap1.remove(val);
                }
            }
        }
    }

}