public class MyNormalStack {

    // instance variables
    int[] data;
    int tos;

    // Constructor
    MyNormalStack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    // Time = O(1)
    public void push(int val) {
        if (tos == data.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            tos++;
            data[tos] = val;
        }
    }

    // Time = O(1)
    public int pop() {

        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int val = data[tos];
            tos--;
            return val;
        }
    }

    // Time = O(1)
    public int peek() {

        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int val = data[tos];
            return val;
        }

    }

    // Time = O(1)
    public int size() {
        return tos + 1;
    }

    // Time = O(tos)
    public void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}