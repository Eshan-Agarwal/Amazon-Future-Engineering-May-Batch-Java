public class KSortedArr {

    public static void main(String[] args) {

    }

    public static int[] kSort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (i >= k) {
                arr[idx] = pq.poll(); // pq.remove();
                idx++;
            }
        }
        while (pq.size() > 0) {
            arr[idx] = pq.poll(); // pq.remove();
            idx++;
        }

        return arr;
    }
}