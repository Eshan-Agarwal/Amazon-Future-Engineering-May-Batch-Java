public class BalancedBrackets {

    public static void main(String[] args) {

        String str = "[(a + b) + {(c + d) * (e / f)}]";

        if (isBalanced(str)) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is not balanced");
        }

    }

    public static boolean isBalanced(String s)

}