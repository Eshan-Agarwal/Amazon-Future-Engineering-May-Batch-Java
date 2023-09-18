public class BinaryTreesBasics {

    public static void main(String[] args) {
//        BinaryTreeNode root = new BinaryTreeNode(10, null, null); // Tree of one node
//
//        BinaryTreeNode leftRootChild = new BinaryTreeNode(20, null, null);
//        BinaryTreeNode rightRootChild = new BinaryTreeNode(30, null, null);
//
//        root.left = leftRootChild;
//        root.right = rightRootChild;

        Integer[] arr = new Integer[]{10, 20, 50, null, 60, null, null, 30, 70, 65,null,null, 80, null, 90, null,null, 40, 100, null, null, null, null};

        ConstructTreeWithStack constructTreeWithStack = new ConstructTreeWithStack();

        BinaryTreeNode root = constructTreeWithStack.construct(arr);
//
//        LevelOrder levelOrder = new LevelOrder();
//        levelOrder.solution(root);
//
//        SumOfRootToLeafBinaryNum sumOfRootToLeafBinaryNum = new SumOfRootToLeafBinaryNum();
//        System.out.println("SUM: " + sumOfRootToLeafBinaryNum.sol(root, ""));
//
//        Diameter d = new Diameter();
//        d.solution(root);

        SumOfLeftLeaf sumOfLeftLeaf = new SumOfLeftLeaf();
        System.out.println(sumOfLeftLeaf.solution(root));
    }

}