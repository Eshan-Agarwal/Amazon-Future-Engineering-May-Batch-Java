public class ConstructFromPrePostOrder {

    public BinaryTreeNode construct(int[] preorder, int[] postorder) {

        return constructHelper(0, preorder.length - 1, 0, postorder.length - 1, preorder, postorder);

    }

    public BinaryTreeNode constructHelper(int psi, int pei, int posi, int poei, int[] preOrder, int[] postorder) {

        // Base case
        if (psi > pei) {
            return null;
        }

        // last element from post order is root of current subtree
        int nodeElement = preOrder[psi];
        BinaryTreeNode node = new BinaryTreeNode(nodeElement); // at the time of creation left and right is null

        // runs only when left single element
        if (psi == pei) {
            return node;
        }

        // find ending idx of post order for left tree
        int idx = posi;
        while(postorder[idx] != preOrder[psi + 1]) {
            idx++;
        }

        int totalElementInLeftTreeOfInOrder = idx - posi + 1;

        node.left = constructHelper(psi + 1, psi + totalElementInLeftTreeOfInOrder,
                posi, idx, preOrder, postorder);

        node.right = constructHelper(psi + totalElementInLeftTreeOfInOrder + 1, pei,
                idx + 1, poei - 1, preOrder, postorder);

        return node;
    }
}