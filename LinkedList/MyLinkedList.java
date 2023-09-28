public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public void addLast(int val) {
        Node node = new Node(val);

        if (size == 0) { // it is very first node
            head = tail = node;
        }  else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void printLL() {
        if (head == null) return;
        Node temp = head;

        System.out.println("printing LL");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

    public void removeFirst() {

        if (size == 0) {
            System.out.println("LinkedList is empty");
            return;

        } else if (size == 1) {
            head = tail = null;

        } else if (size > 1) {

//            Node temp = head.next;
//            head.next = null;
//            head = temp;
            head = head.next;
        }
        size--;

    }



}