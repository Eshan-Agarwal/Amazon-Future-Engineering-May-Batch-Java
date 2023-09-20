public class ConstructFromInPostOrder {

    public BinaryTreeNode construct(int[] inorder, int[] postorder) {

        return constructHelper(0, inorder.length - 1, 0, postorder.length - 1, inorder, postorder);

    }

    public BinaryTreeNode constructHelper(int insi, int inei, int posi, int poei, int[] inorder, int[] postorder) {

        // Base case
        if (posi > poei) {
            return null;
        }

        // last element from post order is root of current subtree
        int nodeElement = postorder[poei];
        BinaryTreeNode node = new BinaryTreeNode(nodeElement); // at the time of creation left and right is null

        // find root at inorder
        int idx = 0;
        while(inorder[idx] != nodeElement) {
            idx++;
        }

        int totalElementInLeftTreeOfInOrder = idx - insi;

        node.left = constructHelper(insi, idx - 1, posi, posi + totalElementInLeftTreeOfInOrder - 1, inorder, postorder);

        node.right = constructHelper(idx + 1, inei, posi + totalElementInLeftTreeOfInOrder, poei - 1, inorder, postorder);

        return node;
    }

}