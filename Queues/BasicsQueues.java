import java.util.Queue;
import java.util.ArrayDeque;

public class BasicsQueues {

    public static void main(String[] args) {
//        Queue<Integer> que = new ArrayDeque<Integer>();
//
//        // add ele
//        que.add(1);
//        que.add(2);
//        que.add(3);
//        que.add(4);
//
//        System.out.println(que.size());
//        System.out.println(que.peek());
//
//        System.out.println(que.remove());
//        System.out.println(que.size());
//        System.out.println(que.peek());

        StackToQueueAdapter stackToQueueAdapter = new StackToQueueAdapter();
        stackToQueueAdapter.push(10);
        stackToQueueAdapter.push(20);
        stackToQueueAdapter.push(30);
        stackToQueueAdapter.push(40);
        System.out.println(stackToQueueAdapter.peek());
        System.out.println(stackToQueueAdapter.pop());
        System.out.println(stackToQueueAdapter.peek());
    }

}