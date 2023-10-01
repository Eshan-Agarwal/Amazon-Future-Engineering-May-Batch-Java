public class CycleDetection {

    public boolean isCycle(Node head) {
        if (head == null && head.next == null) return false; // Edge case
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // return: cyclic node
    public Node cyclicPoint(Node head) {

        if (head == null || head.next == null) return null; // no cycle

        Node slow = head;
        Node fast = head;

        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        
        if (isCycle) {

            slow = head; // reset slow
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }

    }

}