public class AddNode {

    public BinaryTreeNode add(BinaryTreeNode root, int newData) {

        if (root == null) {
            BinaryTreeNode baseNode = new BinaryTreeNode(newData);
            return baseNode;
        }

        if (newData > root.val) {
            root.right = add(root.right, newData);
        } else if (newData <= root.val) {
            root.left = add(root.left, newData);
        }
        return root;
    }

}