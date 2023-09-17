import java.util.*;

public class QueueToStackAdapter {

    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    QueueToStackAdapter() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
    }

    public void push(int val) {
        mainQ.add(val);
    }

    public int pop() {
        if (mainQ.size() == 0) {
            System.out.println("Stack UnderFlow");
            return -1;
        } else {
            while (mainQ.size() > 1) {
                helperQ.add(mainQ.remove());
            }

            int removedVal = mainQ.remove();

            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return removedVal;
        }
    }

    public int peek() {
        if (mainQ.size() == 0) {
            System.out.println("Stack UnderFlow");
            return -1;
        } else {
            while (mainQ.size() > 1) {
                helperQ.add(mainQ.remove());
            }

            int removedVal = mainQ.remove();
            helperQ.add(removedVal);

            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return removedVal;
        }
    }

    public int size() {
        return mainQ.size();
    }

}