public class ReverseLL {

    public Node reverseIterative(Node head) {

        // Edge Case --> size == 0 || size == 1
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node forw = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forw;
        }
        head = prev;
        return head;
    }

    public Node reverseRecursion(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursion(head.next); // faith

        head.next.next = head;
        head.next = null;
        return newHead;
    }

}