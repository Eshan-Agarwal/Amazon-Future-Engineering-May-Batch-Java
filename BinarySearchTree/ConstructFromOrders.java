public class ConstructFromOrder {

    public BinaryTreeNode constructFromInorder(int[] inOrder) {
        if (inOrder.length == 0) {
            return null;
        }
        return constructFromInorderHelper(inOrder, 0, inOrder.length - 1);
    }

    public BinaryTreeNode constructFromInorderHelper(int[] inOrder, int low, int high) {

        if (low > high) {
            return null;
        }

        int mid = (low + (high - low) / 2);

        // part of arr is even --> consider 2nd mid to make BST as Complete BST
        if ((high - low + 1) % 2 == 0) {
            mid += 1;
        }

        BinaryTreeNode root = new BinaryTreeNode(inOrder[mid]);

        root.left = constructFromInorderHelper(inOrder, low, mid - 1);
        root.right = constructFromInorderHelper(inOrder, mid + 1, high);

        return root;
    }


    public BinaryTreeNode constructFromPreOrder(int[] preOrder) {
        if (preOrder.length == 0) {
            return null;
        }

        return constructFromPreOrderHelper(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int idx = 0;

    public BinaryTreeNode constructFromPreOrderHelper(int[] preOrder, int low, int high) {

        if (idx == preOrder.length || preOrder[idx] < low || preOrder[idx] > high) {
            return null;
        }

        BinaryTreeNode node = BinaryTreeNode(preOrder[idx]);
        idx++;
        node.left = constructFromPreOrderHelper(preOrder, low, node.val);

        node.right = constructFromPreOrderHelper(preOrder, node.val, high);

        return node;

    }

}