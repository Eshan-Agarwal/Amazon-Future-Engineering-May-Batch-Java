public class SumOfLeftLeaf {

    public int solution(BinaryTreeNode root) {

        return sumOfLeftLeaf(root, false);

    }

    // return: sum of all left leafs for a particular subtree / tree
    public int sumOfLeftLeaf(BinaryTreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            if (isLeft) {
                return root.val;
            } else {
                return 0;
            }
        }

        int leftSumLeaf = sumOfLeftLeaf(root.left, true);

        int rightSumLeaf = sumOfLeftLeaf(root.right, false);

        return leftSumLeaf + rightSumLeaf;
    }

}