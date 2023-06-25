public class TimeComp {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scn.nextInt();
    }

    // Time Com = O(n)
    public static void singleLoop(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Time Com = O(n) // O(3n)
    public static void singleLoop(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Time Com = O(n^2)
    public static void doubleLoop(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + " " + j );
            }
        }
        System.out.println();

    }


    // Time Com = O(n^2) // n(n-1)
    public static void doubleLoop1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " " + j );
            }
        }
        System.out.println();

    }

    // Time Com = O(n^2) // n(n + 1)/2
    public static void doubleLoop2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(i + " " + j );
            }
        }
        System.out.println();

    }

    // Time Com = O(n^2) // n(n + 1)/2
    public static void doubleLoop2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(i + " " + j );
            }
        }
        System.out.println();

    }

    // Time Com = O(n^3)
    public static void tripleLoop(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(i + " " + j + " " + k);
                }
            }
        }
        System.out.println();

    }
}