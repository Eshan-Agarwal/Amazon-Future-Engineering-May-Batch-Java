public class SizeSumMaxMinFind {

    //Time O(n) --> n : num of node
    public int size(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSize = size(root.left);
        int rightSize = size(root.right);

        return leftSize + rightSize + 1;

    }


    //Time O(n) --> n : num of node
    public int sum(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.val;
    }


    //Time O(h) --> h : height of tree
    public int max(BinaryTreeNode root) {

        if (root.right == null) {
            return root.val;
        }
        return max(root.right);
    }

    //Time O(h) --> h : height of tree
    public int min(BinaryTreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return min(root.left);
    }

    //Time O(h) --> h : height of tree
    public boolean findNode(BinaryTreeNode root, BinaryTreeNode searchNode) {
        if (root == null) {
            return false;
        }

        if (searchNode.val > root.val) {
            return findNode(root.right, searchNode);
        } else if (searchNode.val < root.val) {
            return findNode(root.left, searchNode);
        } else {
            return true;
        }

    }

}