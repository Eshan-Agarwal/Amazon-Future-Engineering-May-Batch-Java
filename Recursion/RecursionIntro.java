public class RecursionIntro {


    public static void main(String[] args) {
        int n = 5;

//        printDecreasing(n);
        recursion();
    }

    public static void recursion() {
        System.out.println("I am in recursive loop");
        recursion();
    }

    public static void printDecreasing(int n) {

        System.out.println("Starting Recursive Stack " + n);
        // base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);
//        n--;
        printDecreasing(n - 1);
        System.out.println("Ending Recursive Stack " + n);


    }

}