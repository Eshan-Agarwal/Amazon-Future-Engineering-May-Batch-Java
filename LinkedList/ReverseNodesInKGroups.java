public class ReverseNodesInKGroups {

    Node th = null;
    Node tt = null;
    public void addFirst(Node node) {
        if (th == null) {
            th = tt = node;
        } else {
            node.next = th;
            th = node;
        }
    }

    public int getCountTotalNodes(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public Node reversedInKGroups(Node head, int k) {
        if (head == null || head.next == null) return head;

        Node oh = null;
        Node ot = null;

        Node curr = head;
        int countTotalNodes = getCountTotalNodes(head);

        while(curr != null && countTotalNodes >= k) {

            int tempK = k;
            while(tempK > 0) {
                ListNode forw = curr.next;
                curr.next = null;
                addFirst(curr);
                curr = forw;
                tempK--;
            }

            if (oh == null) {
                oh = th;
                ot = tt;
            } else {
                ot.next = th;
                ot = tt;
            }
            countTotalNodes -= k;

            th = null;
            tt = null;
        }

        ot.next = curr;

        return oh;
    }

}