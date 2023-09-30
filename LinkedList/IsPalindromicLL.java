public class IsPalindromicLL {

    public boolean isPalindromic(Node head) {
        if (head == null || head.next == null) return true;

        MiddleLL mid = new MiddleLL();
        Node midNode = mid.middle(head);

        Node newHead = midNode.next;
        midNode.next = null;

        ReverseLL r = new ReverseLL();
        Node reversedNewHead = r.reverseIterative(newHead);

        Node temp1 = head;
        Node temp2 = reversedNewHead;
        while(temp2 != null && temp1 != null) {
            if (temp1.data != temp2.data) {
                rearrangeInput(head, reversedNewHead);
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        rearrangeInput(head, reversedNewHead);
        return true;
    }

    public void rearrangeInput(Node head, Node reversedNewHead) {
        ReverseLL r = new ReverseLL();
        Node newHead = r.reverseIterative(reversedNewHead);

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newHead;
    }
}