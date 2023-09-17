import java.util.Stack;
import java.util.Scanner;

public class BasicsStacks {

    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//
//        // add element in stack
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//
//        System.out.println("Size of the stack : " + st.size());
//        System.out.println("Top of stack : " + st.peek()); // top element
//
//        int remove = st.pop();
//        System.out.println("Size of the stack : " + st.size());
//        System.out.println("Top of stack : " + st.peek()); // top element
//
//        System.out.println(st.isEmpty());

//        solution();


//        MyNormalStack myNormalStack = new MyNormalStack(5);
//
//        myNormalStack.push(10);
//        myNormalStack.push(20);
//        myNormalStack.push(30);
//        myNormalStack.push(40);
//        myNormalStack.push(50);
//        myNormalStack.display();
//
//        System.out.println("POP: " + myNormalStack.pop());
//        System.out.println("POP: " + myNormalStack.pop());
//        System.out.println("PEEK: " + myNormalStack.peek());
//        System.out.println("size: " + myNormalStack.size());
//        myNormalStack.display();
        QueueToStackAdapter stack = new QueueToStackAdapter();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }

    public static void solution() {

        Scanner scn = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int T = scn.nextInt();

        while(T > 0) {

            switch (scn.nextInt()) {
                case 1:
                    System.out.println("size: " + st.size());
                    break;

                case 2:
                    if (st.isEmpty()) {
                        System.out.println("Stack is already Empty");
                    } else {
                        st.pop();
                    }
                    break;

                case 3:
                    int val = scn.nextInt();
                    st.push(val);
                    break;

                case 4:
                    if (st.isEmpty()) {
                        System.out.println("Stack is already Empty");
                    } else {
                        System.out.println("Top : " + st.peek());
                    }
                    break;

                default:
                    System.out.println("This is default block");
            };

            T--;
        }

    }



}