import java.util.Scanner;

public class NumberSystem {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

//        decimalToBinary(n);
        decimalToOctal(n);
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