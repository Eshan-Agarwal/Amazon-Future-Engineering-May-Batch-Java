public class SameTrees {

    public boolean isSameTrees(BinaryTreeNode node1, BinaryTreeNode node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        // Structure is not same
        if (node1 == null || node2 == null) {
            return false;
        }

        int isLeftSubtreeSame = isSameTrees(node1.left, node2.left);
        if (! isLeftSubtreeSame) {
            return false;
        }

        int isRightSubtreeSame = isSameTrees(node1.right, node2.right);
        if (! isRightSubtreeSame) {
            return false;
        }
        return (node1.val == node2.val);
    }

}