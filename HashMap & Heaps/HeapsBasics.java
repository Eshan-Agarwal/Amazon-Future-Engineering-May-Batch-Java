import java.util.PriorityQueue;
import java.util.Collections;
public class HeapsBasics {

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min

//        pq.add(4);
//        pq.add(14);
//        pq.add(1);
//        pq.add(0);
//        pq.add(-1);
//        pq.add(5);
//
//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max
        pq.add(4);
        pq.add(14);
        pq.add(1);
        pq.add(0);
        pq.add(-1);
        pq.add(5);

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.peek());


    }



}