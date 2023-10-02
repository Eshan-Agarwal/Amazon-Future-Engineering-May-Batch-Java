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
        if (head == null) return; // Edge case
        Node temp = head;

        System.out.println("printing LL");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid case");
            return -1;
        } else {

            Node temp = head;
            while (idx > 0) {
                temp = temp.next;
                idx--;
            }

            return temp.data;

        }


    }

    public void addFirst(int val) {

        Node node = new Node(val);
        if (size == 0) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void removeLast() {

        if (size == 0) {
            System.out.println("List is Empty");

        } else if (size == 1) {

            head = tail = null;

        } else if (size > 1) {

            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }

    }



}