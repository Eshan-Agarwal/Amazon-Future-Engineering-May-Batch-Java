public class GreateSumTree {

    int sum = 0;
    public void method1(BinaryTreeNode root) {
        if (root == null) return;

        method1(root.right);

        sum += root.val;
        root.val = sum;

        method1(root.left);

    }

    public int method2(BinaryTreeNode root, int cSum) {

        if (root == null) return 0;

        int rSum = method2(root.right, cSum);

        cSum += rSum + root.val;
        root.val = cSum;

        int lSum = method2(root.left, cSum);

        return lSum + root.val + rSum;

    }

}