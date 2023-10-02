public class OddEven {

    public Node oddEven(Node head) {

        if (head == null || head.next == null) return head;

        Node oddT = head;

        Node evenH = head.next;
        Node evenT = head.next;

        while(evenT != null && evenT.next != null) {

            oddT.next = evenT.next;
            oddT = oddT.next;

            evenT.next = oddT.next;
            evenT = evenT.next;
        }

        oddT.next = evenH;

        return head;
    }

}