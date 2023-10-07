public class SegregateOverPivot {

    public Node stablePartition (Node head) {

        if (head == null || head.next == null) return head;

        Node pivot = head;
        while(pivot.next != null) {
            pivot = pivot.next;
        }

        Node smaller = new Node(-1);
        Node larger = new Node(-1);

        Node s = smaller;
        Node l = larger;

        Node curr = head;

        while(curr != null) {

            if (pivot.data >= curr.data) {
                s.next = curr;
                s = s.next;
            } else {
                l.next = curr;
                l = l.next;
            }
            curr = curr.next;
        }
        l.next = null;
        s.next = larger.next;
        return s;
    }

}