public class BinaryTreeNode {

    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    // default Constructor
    BinaryTreeNode() {

    }

    BinaryTreeNode(int val) {
        this.val = val;
    }

    // Param Consctructor
    BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}