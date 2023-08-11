public class RecursionIntro {


    public static void main(String[] args) {
        int n = 5;

        recursion(n);
    }

    public static void recursion(int n) {

        System.out.println("Starting Recursive Stack " + n);
        // base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);
//        n--;
        recursion(n - 1);
        System.out.println("Ending Recursive Stack " + n);


    }

}