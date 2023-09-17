public class BinaryTreesBasics {

    public static void main(String[] args) {
//        BinaryTreeNode root = new BinaryTreeNode(10, null, null); // Tree of one node
//
//        BinaryTreeNode leftRootChild = new BinaryTreeNode(20, null, null);
//        BinaryTreeNode rightRootChild = new BinaryTreeNode(30, null, null);
//
//        root.left = leftRootChild;
//        root.right = rightRootChild;

        Integer[] arr = new Integer[]{50,25,12,null,null,37,null,null,75,67,null,null,88,null,null};

        ConstructTreeWithStack constructTreeWithStack = new ConstructTreeWithStack();

        BinaryTreeNode root = constructTreeWithStack.construct(arr);

        LevelOrder levelOrder = new LevelOrder();
        levelOrder.solution(root);
    }

}