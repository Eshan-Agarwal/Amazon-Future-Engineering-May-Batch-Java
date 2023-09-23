public class CousinsBT {

    public boolean isCousins(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {

        int levelOfNode1 = levelOfNode(root, node1, 1);
        int levelOfNode2 = levelOfNode(root, node2, 1);

        boolean sib = isSiblings(root, node1, node2);

        return (levelOfNode1 == levelOfNode2) && !sib;

    }

    public int levelOfNode(BinaryTreeNode node, BinaryTreeNode node1, int level) {

        if (node == null) {
            return -1;
        }

        if (node1 == node) {
            return level;
        }

        int leftLevel = levelOfNode(node.left, node1, level + 1);
        // immediate return
        if (leftLevel != -1) { // node1 is found on tree
            return leftLevel;
        }

        return levelOfNode(node.right, node1, level + 1);
    }

    public boolean isSiblings(BinaryTreeNode node, BinaryTreeNode node1, BinaryTreeNode node2) {

        if (node == null) {
            return false;
        }

        if ((node.left == node1 && node.right == node2)
                || (node.left == node2 && node.right == node1)) {
            return true;
        }
        return isSiblings(node.left, node1, node2) || isSiblings(node.right, node1, node2)
    }

}