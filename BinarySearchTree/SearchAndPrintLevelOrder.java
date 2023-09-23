public class SearchAndPrintLevelOrder {

    public void solution(BinaryTreeNode root, int key) {

        BinaryTreeNode nodeToPrint = solutionHelper(root, key);

        levelOrder(nodeToPrint);

    }

    public BinaryTreeNode solutionHelper(BinaryTreeNode node, int key) {

        if (node == null) {
            return null;
        }

        if (key > node.val) {
            return solutionHelper(node.right, key);
        } else if (key < node.val) {
            return solutionHelper(node.left, key);
        } else {
            return node;
        }

    }

}