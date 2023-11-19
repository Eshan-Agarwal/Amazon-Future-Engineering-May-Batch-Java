import java.util.PriorityQueue;

public class ConnectNRopes {

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val: arr) {
            pq.add(val);
        }

        int ans = 0;
        while(pq.size() > 1) {
            int min = pq.poll();
            int smin = pq.poll();
            int temp = min + smin;
            pq.add(temp);
            ans += temp;
        }
        System.out.println(ans);
    }
}