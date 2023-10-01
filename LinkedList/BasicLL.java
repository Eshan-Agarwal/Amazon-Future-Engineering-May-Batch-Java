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

//        System.out.println("Before Reverse");
//        myLinkedList.printLL();
//
//        System.out.println("After Reverse");
//        ReverseLL r = new ReverseLL();
////        Node nhead = r.reverseIterative(myLinkedList.head);
//        Node nhead = r.reverseRecursion(myLinkedList.head);
//        myLinkedList.head = nhead;
//        myLinkedList.printLL();
//
//        IsPalindromicLL palindromicLL = new IsPalindromicLL();
//        System.out.println(palindromicLL.isPalindromic(myLinkedList.head));

//        MiddleLL m = new MiddleLL();
//        Node midNode  = m.middle(myLinkedList.head);
//        System.out.println(midNode.data);
//
//        FoldLL foldLL = new FoldLL();
//        Node nhead = foldLL.foldedList(myLinkedList.head);
//        printLL(nhead);
//
//        String str = "1234a";
//        int num = convertToString(str);
//        System.out.println(num);

//    }

//    public static int convertToString(String str) {
//
//        int ans = 0;
//        for (char ch: str.toCharArray()) {
//
//            if (Character.isDigit(ch)) {
//                int chI = ch - '0';
//                ans = ans*10 + chI;
//            } else {
//                System.out.println("wrong input");
//                return -1;
//            }
//
//        }
//        return ans;

        RemoveDuplicates r = new RemoveDuplicates();
        printLL(r.removeDuplicates(myLinkedList.head));
    }

    public static void printLL(Node head) {
        if (head == null) return; // Edge case
        Node temp = head;

        System.out.println("printing LL");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}