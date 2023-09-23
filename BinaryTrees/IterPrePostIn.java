import java.util.Stack;
public class IterPrePostIn {

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

    public void iterPrePostIn(BinaryTreeNode root) {

        String pre = "";
        String in = "";
        String post = "";

        Stack<Edge> st = new Stack<>();
        Edge rootEdge = new Edge(root, 1);
        st.push(rootEdge);

        while(!st.isEmpty()) {

            Edge e = st.peek();

            if (e.state == 1) {

                e.state++;
                pre = pre + e.node.val + " ";
                if (e.node.left != null) {
                    st.push(new Edge(e.node.left, 1));
                }

            } else if (e.state == 2) {
                e.state++;
                in = in + e.node.val + " ";
                if (e.node.right != null) {
                    st.push(new Edge(e.node.right, 1));
                }

            }else if (e.state == 3) {
                st.pop();
                post = post + e.node.val + " ";
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

}