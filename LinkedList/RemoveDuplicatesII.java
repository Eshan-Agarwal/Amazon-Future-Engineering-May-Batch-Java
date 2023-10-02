public class RemoveDuplicatesII {

    public Node removeDuplicates(Node head) {

        if (head == null || head.next == null) return head;

        Node dummy = new Node(-1);

        Node prev = dummy;
        Node curr = head;

        while(curr != null) {

            Node forw = curr.next;

            if (forw != null && forw.val == curr.val) {

                while(forw != null && forw.val == curr.val) {
                    forw = forw.next;
                }

                curr = forw;

            } else {
                prev.next = curr;
                curr.next = null;
                prev = curr;
                curr = forw;
            }
        }

        return dummy.next;
    }

}