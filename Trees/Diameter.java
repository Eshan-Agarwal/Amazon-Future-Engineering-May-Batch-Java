public class Diameter {

    class Pair {
        int height;
        int dia;

        Pair(int height, int dia) {
            this.height = height;
            this.dia = dia;
        }
    }

    public void solution(BinaryTreeNode root) {
        Pair ans = diameter(root);
        System.out.println(ans.dia);
    }

    public Pair diameter(BinaryTreeNode node) {

        if (node == null) {
            Pair bPair = new Pair(-1, 0);
            return bPair;
        }

        Pair leftPair = diameter(node.left);
        Pair rightPair = diameter(node.right);

        int myHeight = Math.max(leftPair.height, rightPair.height) + 1;
        int myDia = Math.max(leftPair.height + rightPair.height + 2, Math.max(leftPair.dia, rightPair.dia));

        Pair myAns = new Pair(myHeight, myDia);
        return myAns;
    }

}