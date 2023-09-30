public class MiddleLL {

    public Node middle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) { // first = odd || second = even (M1)

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

}