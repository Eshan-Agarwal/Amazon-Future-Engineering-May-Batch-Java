import java.util.Scanner;

public class Patterns {
    public static void pattern10(int n) {

        int nsp = n / 2;
        int nst = 1;

        for (int row = 1; row <=n ; row++) {

            int val = row;
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");
            }

            for (int st = 1; st <= nst; st++) {
                if (st % 2 == 1) {
                    System.out.print(val + "\t");
                    val++;
                } else {
                    System.out.print("\t");
                }

            }

            if (row <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -=2;
                nsp++;
            }

            System.out.println();

        }

    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        int n = scn.nextInt();
//        diamond(n);
//        pattern1(n);
//        diagnol(n);
//        diag(n);
//        pattern3(n); //Calling method argument
//        pattern10(7);
        hollowSquare(5);
    }

    public static void diag(int n) {

        int nst = 1;
        int nsp = n - 1;

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*\t");
                if (st < 4) {
                    for (int istsp = 1; istsp <= st; istsp++) {
                        System.out.print(" ");
                    }
                } else if(st != 4) {
                    System.out.print(" ");
                }
            }

            System.out.println();
            nst++;
            nsp--;

        }
    }

    public static void diagnol(int n) {

        int nsp = 0;
        int nst = 1;

        for (int row = 1; row <= n; row++) {
            for(int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*\t");
            }
            nsp++;
            System.out.println();

        }

    }

    public static void pattern3(int n) {

        int nos = n / 2;
        int nis = -1;

        for (int row = 1; row <= n; row++) {

            for (int os = 1; os <= nos; os++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int is = 1; is <= nis; is++) {
                System.out.print("\t");
            }

            if (row != 1 && row != n) {
                System.out.print("*\t");
            }

            System.out.println();

            if (row <= n / 2) {

                nos--;
                nis += 2;

            } else {

                nos++;
                nis -= 2;
            }

        }

    }

    public static void pattern1(int n) {

        int nst = n/2 + 1;
        int nsp = 1;

        for (int row = 1; row <= n; row++) {

            for (int st = 1; st <= nst; st++) {
                System.out.print("*\t");
            }

            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");
            }

            for (int st = 1; st <= nst; st++) {
                System.out.print("*\t");
            }

            // next row update of stars and spaces
            if (row <= n / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
            System.out.println();
        }

    }

    public static void diamond(int n) {

        int nst = 1;
        int nsp = n/2;
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*\t");
            }

            // next row update of stars and spaces
            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }


        }

    }

    public static void hollowSquare(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("\t*");
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("\t*");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
            System.out.println();
        }

    }

}
