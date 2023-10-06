public class Segregate01 {

    public Node segreagate(Node head) {
        if (head == null || head.next == null) return head;

        Node i = head;
        Node j = head;

        while(j != null) {

            if (j.data == 1) {
                j = j.next;

            } else {
                int temp = i.data;
                i.data = j.data;
                j.data = temp;

                i = i.next;
                j = j.next;
            }
        }

        return head;
    }

}