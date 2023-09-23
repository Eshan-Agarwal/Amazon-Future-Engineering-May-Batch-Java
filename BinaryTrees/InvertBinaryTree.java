public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    public static void levelOrder(BinaryTreeNode root) {
        Queue<BinaryTreeNode> que = new ArrayDeque<>();
        que.add(root);

        while(que.size() > 0) {

            int numOfNodeInLevel = que.size();

            for (int i = 0; i < numOfNodeInLevel; i++) {
                BinaryTreeNode node = que.remove();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
            System.out.println();
        }
    }

    public static BinaryTreeNode invert(BinaryTreeNode node) {

        if (node == null) {
            return node;
        }

        BinaryTreeNode left = invert(node.left);
        BinaryTreeNode right = invert(node.right);

        node.left = right;
        node.right = left;

    }

}