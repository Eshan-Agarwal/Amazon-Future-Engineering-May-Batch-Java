public class Factorial {

    public static void main(String[] args) {
        int n = 5;

        int ans = factorial(n);

        System.out.println("Factorial Val: " + ans);
    }

    // recurse relation --> fact(n) = n * fact(n - 1)
    public static int factorial(int n) {

        // base case
        if (n == 1) {
            return n;
        }

        int factorialNminusOne = factorial(n - 1); // faith on n - 1
        return n * factorialNminusOne; // cal my ans
    }

}