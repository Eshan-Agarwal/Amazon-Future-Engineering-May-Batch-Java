import java.util.PriorityQueue;
public class kLargestElements {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min PQ

        int[] arr = new int[]{13, 12, 62, 22, 15, 37, 99, 11, 37, 98, 67, 31, 84, 99};
        int k = 4;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (pq.peek() < arr[i]) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while(pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }

}