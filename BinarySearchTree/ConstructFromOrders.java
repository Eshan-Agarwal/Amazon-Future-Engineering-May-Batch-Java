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

    public BinaryTreeNode constructFromPostOrder(int[] postOrder) {
        idx = postOrder.length - 1;

        constructFromPostOrderHelper(postOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public BinaryTreeNode constructFromPostOrderHelper(int[] postOrder, int low, int high) {

        if (idx == -1 || postOrder[idx] < low || idx > high) {
            return null;
        }

        BinaryTreeNode node = new BinaryTreeNode(postOrder[idx]);
        idx--;

        node.right = constructFromInorderHelper(postOrder, node.val, high);
        node.left = constructFromInorderHelper(postOrder, low, node.val);
        return node;
    }

    class Triplet {
        BinaryTreeNode node;
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;

        Triplet() {

        }

        Triplet(BinaryTreeNode node, int left, int right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }

    }

    public BinaryTreeNode constructFromLevelOrder(int[] levelOrder) {

        Queue<Triplet> que = new ArrayDeque<>();

        BinaryTreeNode root = null;

        Triplet reference = new Triplet();
        que.add(reference);

        int idx = 0;

        while(que.size() > 0 && idx < levelOrder.length) {
            Triplet triplet = que.remove();

            if (levelOrder[idx] < triplet.left || levelOrder[idx] > triplet.right) {
                continue;
            }

            BinaryTreeNode node = new BinaryTreeNode(levelOrder[idx]);
            idx++;

            if (triplet.node == null) {
                root = node;
            } else {
                if (node.val <= triplet.node.val) {
                    triplet.node.left = node;
                } else {
                    triplet.node.right = node;
                }
            }

            que.add(new Triplet(node, triplet.left, node.val)); // store left child range
            que.add(new Triplet(node, node.val, triplet.right)); // store right child range

        }

        return root;
    }

}