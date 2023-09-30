public class FoldLL {

    public Node foldedList(Node head) {
        if (head == null || head.next == null) return head;

        MiddleLL mid = new MiddleLL();
        Node midNode = mid.middle(head);

        Node newHead = midNode.next;
        midNode.next = null;

        ReverseLL r = new ReverseLL();
        Node reversedNewHead = r.reverseIterative(newHead);

        Node t1 = head;
        Node t2 = reversedNewHead;

        while(t1 != null && t2 != null) {
            Node ft1 = t1.next;
            Node ft2 = t2.next;

            t1.next = t2;
            t2.next = ft1;

            t1 = ft1;
            t2 = ft2;
        }
       return head;
    }

    public  void printLL(Node head) {
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