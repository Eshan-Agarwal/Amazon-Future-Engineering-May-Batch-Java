public class RangeSumBST {

    public int rangeSum(BinaryTreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }

        if (root.val > high) {
            return rangeSum(root.left, low, high);
        } else if (root.val < low) {
            return rangeSum(root.right, low, high);
        } else {

            return rangeSum(root.left, low, high) + root.val + rangeSum(root.right, low, high);

        }
    }

}