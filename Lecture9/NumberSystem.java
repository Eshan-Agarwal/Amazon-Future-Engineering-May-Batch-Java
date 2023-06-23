import java.util.Scanner;

public class NumberSystem {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
//        int b1 = scn.nextInt();
//        int b2 = scn.nextInt();

//        decimalToBinary(n);
//        decimalToOctal(n);
//        decimalToAnyBase(n, b);
//        System.out.println(anyBaseToAnyBase(n, b1, b2));
        System.out.println(anyBaseAddition(n1, n2, b));

    }

    public static int anyBaseAddition(int n1, int n2, int b) {

        int decimalEqN1 = anyBaseToDecimal(n1, b);
        int decimalEqN2 = anyBaseToDecimal(n2, b);

        int decimalEqAns = decimalEqN1 + decimalEqN2; // + - * / operators have default base as 10

        int ans = decimalToAnyBase(decimalEqAns, b);

        return ans;
    }

    public static int decimalToAnyBase(int n, int b) {

        int ans = 0;
        int places = 1; // 10 ^ 0

        while (n > 0) {

            int rem = n % b;
            n = n / b;
            ans = ans + rem * places;
            places *= 10;

        }
        return ans;
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

    public static int anyBaseToAnyBase(int n, int b1, int b2) {

       int decimalEquiv =  anyBaseToDecimal(n, b1);
        System.out.println("Any base to decimal --> " + decimalEquiv);
       int ans = decimalToAnyBase(decimalEquiv, b2);
        System.out.println("decimal to any base --> " + ans);
       return ans;
    }


    public static void decimalToBinary(int n) {

        int ans = 0;
        int places = 1; // 10 ^ 0

        while (n > 0) {

            int rem = n % 2;
            n = n / 2;
            ans = ans + rem * places;
            places *= 10;

        }
        System.out.println(ans);

    }

    public static void decimalToOctal(int n) {

        int ans = 0;
        int places = 1; // 10 ^ 0

        while (n > 0) {

            int rem = n % 8;
            n = n / 8;
            ans = ans + rem * places;
            places *= 10;

        }
        System.out.println(ans);

    }

}