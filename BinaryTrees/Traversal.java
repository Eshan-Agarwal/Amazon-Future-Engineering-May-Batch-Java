public class Traversal {

    public static void main(String[] args) {

    }

    public static void preOrder(BinaryTreeNode root) {
        // base condition
        if (root == null) {
            return
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }


    public static void inOrder(BinaryTreeNode root) {
        // base condition
        if (root == null) {
            return
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }


    public static void postOrder(BinaryTreeNode root) {
        // base condition
        if (root == null) {
            return
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> leftSubTree = inorderTraversal(root.left);

        leftSubTree.add(root.val);

        List<Integer> rightSubTree = inorderTraversal(root.right);

        if (rightSubTree.size() > 0) {
            for (int val: rightSubTree) {
                leftSubTree.add(val);
            }
        }

        return leftSubTree;
    }

}