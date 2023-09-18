import java.util.Stack;
public class StackToQueueAdapter {

    Stack<Integer> mainSt;
    Stack<Integer> helperSt;

    StackToQueueAdapter() {
        mainSt = new Stack<>();
        helperSt = new Stack<>();
    }

    public void push(int val) {
        mainSt.push(val);
    }

    public int pop() {
        if (mainSt.size() == 0) {
            System.out.println("Queue Underflow");
            return -1;
        } else {

            while(mainSt.size() > 1) {
                helperSt.push(mainSt.pop());
            }

            int valPoped = mainSt.pop();

            while(helperSt.size() > 0) {
                mainSt.push(helperSt.pop());
            }

            return valPoped;
        }

    }

    public int peek() {
        if (mainSt.size() == 0) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            while(mainSt.size() > 1) {
                helperSt.push(mainSt.pop());
            }
            int val = mainSt.peek();
            while(helperSt.size() > 0) {
                mainSt.push(helperSt.pop());
            }
            return val;
        }
    }

    public int size() {
        return mainSt.size();
    }

}