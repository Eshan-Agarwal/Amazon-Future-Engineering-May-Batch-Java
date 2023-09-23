public class RemoveNode {

    public int max(BinaryTreeNode node) {

        if (node.right == null) {
            return node.val;
        } else {
            return max(node.right);
        }

    }

    public BinaryTreeNode deleteNode(BinaryTreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {

            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int max = max(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
            }
        }

        return root;

    }

}