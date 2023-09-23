public class SizeSumMaxHeight {

    public static void main(String[] args) {

    }

    public static int size(BinaryTreeNode node) {

        if (root == null) {
            return 0;
        }

        int leftSubTreeSize = size(node.left);
        int rightSubTreeSize = size(node.right);
        return leftSubTreeSize + rightSubTreeSize + 1;
    }

    public static int sum(BinaryTreeNode node) {

        if (root == null) {
            return 0;
        }

        int leftSubTreeSum = sum(node.left);
        int rightSubTreeSum = sum(node.right);
        return leftSubTreeSum + rightSubTreeSum + node.val;
    }

    public static int max(BinaryTreeNode node) {

        if (root == null) {
            return Integer.MIN_VALUE; // nodes can be negative
        }

        int leftMax = max(node.left);
        int rightMax = max(node.right);
        return Math.max(leftMax, Math.max(rightMax, root.val));
    }

    public static int heightInEdge(BinaryTreeNode node) {

        if (root == null) {
            return -1;
        }

        int leftHt = heightInEdge(node.left);
        int rightHt = heightInEdge(node.right);
        return Math.max(leftHt, rightHt) + 1;
    }

    public static int heightInNode(BinaryTreeNode node) {

        if (root == null) {
            return 0;
        }

        int leftHt = heightInEdge(node.left);
        int rightHt = heightInEdge(node.right);
        return Math.max(leftHt, rightHt) + 1;
    }

}