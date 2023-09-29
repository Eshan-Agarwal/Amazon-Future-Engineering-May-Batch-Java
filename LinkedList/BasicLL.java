import java.util.Scanner;
public class BasicLL {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        Scanner scn = new Scanner(System.in);

        while(true) {
            String str = scn.nextLine();
            if (str.equals("quit")) {
                break;
            }
            myLinkedList.addLast(Integer.parseInt(str));

        }

        System.out.println("Before Reverse");
        myLinkedList.printLL();

        System.out.println("After Reverse");
        ReverseLL r = new ReverseLL();
//        Node nhead = r.reverseIterative(myLinkedList.head);
        Node nhead = r.reverseRecursion(myLinkedList.head);
        myLinkedList.head = nhead;
        myLinkedList.printLL();
    }

}