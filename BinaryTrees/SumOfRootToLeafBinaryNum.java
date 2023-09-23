public class SumOfRootToLeafBinaryNum {


    public static int sol(BinaryTreeNode node, String ans) {

        if (node == null) {
            return 0;
        }

        // leaf node
        if (node.left == null && node.right == null) {
            ans = ans + node.val;
            int d = anyBaseToDecimal(Integer.parseInt(ans), 2);
            return d;
        }

        int left = sol(node.left, ans + node.val);
        int right = sol(node.right, ans + node.val);
        return left + right;
    }

    public static int anyBaseToDecimal(int n, int b1) {

        int ans = 0;
        int place = 1; // b2^0 = 1

        while (n > 0) {

            int rem = n % 10;
            n = n / 10;
            ans += rem * place;
            place = place * b1;
        }
        return ans;
    }

}