public class PowerLog {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        System.out.println(pow(x, y));
    }

    public static int pow(int x, int n) {

        // base case
        if (n == 0) {
            return 1;
        }

        int recAns = pow(x, n/2);

        if (n % 2 == 0) {
            return recAns * recAns;
        } else {
            return x * recAns * recAns;
        }

    }

}