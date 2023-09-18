import java.util.Stack;

public class ConstructTreeWithStack {

    public class Edge {
        BinaryTreeNode node;
        int state;

        Edge() {

        }


        Edge(BinaryTreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public BinaryTreeNode construct(Integer[] arr) {
        Stack<Edge> st = new Stack<>();

        // root node
        BinaryTreeNode root = new BinaryTreeNode(arr[0]);

        Edge rootEdge = new Edge(root, 1);
        st.push(rootEdge);
        int idx = 1;

        while (!st.isEmpty()) {
            Edge nodeEdge = st.peek();

            if (nodeEdge.state == 1) { // left child
                nodeEdge.state++;
                if (arr[idx] != null) {
                    BinaryTreeNode leftChild = new BinaryTreeNode(arr[idx]);
                    nodeEdge.node.left = leftChild;

                    Edge leftNodeEdge = new Edge(leftChild, 1);
                    st.push(leftNodeEdge);
                }
                idx++;

            } else if (nodeEdge.state == 2) { // right child
                nodeEdge.state++;
                if (arr[idx] != null) {
                    BinaryTreeNode rightChild = new BinaryTreeNode(arr[idx]);
                    nodeEdge.node.right = rightChild;

                    Edge rightNodeEdge = new Edge(rightChild, 1);
                    st.push(rightNodeEdge);
                }
                idx++;
            } else if (nodeEdge.state == 3) {
                st.pop();
            }
        }

        return root;
    }

}