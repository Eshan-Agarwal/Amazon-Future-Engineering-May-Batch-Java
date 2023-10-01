public class DeleteNodeWithoutHead {

    public void deleteNode(Node removedNode) {
        if (removedNode == null) return;

        Node curr = removedNode;
        Node forw = removedNode.next;

        while(forw.next != null) {

            curr.data = forw.data;
            curr = forw;
            forw = forw.next;
        }
        curr.next = null;
    }

}