import java.lang.Math;

public class Power {

    public static void main(String[] args) {
        int x = 2;
        int n = -5;

        int ans = pow(x, Math.abs(n));

        if (n >= 0) {
            System.out.println("Power of X ^ N: " + ans);
        } else {
            float fans = 1.0f/ans;
            System.out.println(fans);
        }

    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int recAns = pow(x, n - 1);
        return x * recAns;

//        return x * pow(n  -1);

    }



}