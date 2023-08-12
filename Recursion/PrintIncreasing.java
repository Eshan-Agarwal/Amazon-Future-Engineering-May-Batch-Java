public class PrintIncreasing {

    public static void main(String[] args) {
        int n = 5;

        solution(n);
    }

    public static void solution(int n) {

        // base condition
        if (n == 1) {
            System.out.println(n);
            return;
        }

        solution(n - 1);
        System.out.println(n);

    }

    public static void phaseOfRecursion(int n) {

        // pre recusion phase

        phaseOfRecursion(n - 1);

        // post recursion phase

    }

}