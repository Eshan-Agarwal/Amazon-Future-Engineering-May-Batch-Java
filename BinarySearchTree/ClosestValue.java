import java.util.Math;

public class ClosestValue {

    float minDiff = Float.MAX_VALUE;
    int minNodeVal = Integer.MAX_VALUE;

    public void closest(BinaryTreeNode root, int tar) {

        if (root == null) return;

        float delta = Math.abs(root.val - tar);

        if (minDiff >= delta) {
            minDiff = delta;
            if (minNodeVal > root.val) {
                minNodeVal = root.val;
            }
        }

        if (root.val > tar) {
            closest(root.left, tar);

        } else if (root.val < tar) {
            closest(root.right, tar);

        }


    }

}