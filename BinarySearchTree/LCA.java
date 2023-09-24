public class LCA {

    // Time --> O(h)
    // Space --> O(h)
    public int lcaRecur(BinaryTreeNode root, int one, int two) {

        // LCA not present
        if (root == null) {
            return -1;
        }

        if (root.val > two) {
            return lcaRecur(root.left, one, two);
        } else if (root.val < one) {
            return lcaRecur(root.right, one, two);
        }
        return root.val;
    }

    // Time --> O(h)
    // Space --> O(1)
    public int lcaIter(BinaryTreeNode root, int one, int two) {

        while(root != null) {
            if (root.val > two) {
                root = root.left;
            } else if (root.val < one) {
                root = root.right;
            }
            break;
        }

        if (root == null) {
            return -1;
        } else {
            return root.val;
        }

    }

}