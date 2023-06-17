public class ForLoops {
    public static void main(String[] args) {
            // Syntax
    //        for (int i = 1; i < 10; i++) {
    //            // body
    //            System.out.println(i);
    //        }

            // Syntax
    //        for (int i = 1; i < 10;) {
    //            System.out.println(i);
    //            i = i + 2; // i += 2;c
    //        }

    //        for (int i = 10; i > 0; i--) {
    //            System.out.println(i);
    //        }


    //        for (int i = 10; i > 0;) {
    //            System.out.println(i);
    //            i--;
    //        }

            // infinite for loop
    //        for (int i = 1; true; i++) {
    //            System.out.println(i);
    //        }

    //        int i = 1000;
    //
    //        for (i = 1; i < 10; i++) {
    //            System.out.println(i);
    //        }

            // Scope of a is only in for loops
    //        for (int a = 1; a < 10; a++) {
    //            System.out.println(a);
    //        }
    //
    //        System.out.println(a);

    //        for (char ch = 'a'; ch <= 'z'; ch++) {
    //            System.out.print(ch + " ");
    //        }

            //nested for loops

    //        for (int i = 1; i <= 10; i++) {
    //
    //            System.out.println("******************************");
    //            System.out.println("i: " + i);
    //            for (int j = 1; j <= 10; j++) {
    //                System.out.println("j: " + j);
    //                for (int k = 1; k < 5; k++) {
    //                    System.out.println("k: " + k);
    //                }
    //            }
    //
    //        }

    //        for (int i = 5; i > -1; i--) {
    //            for (int j = 10; j > 0; j--) {
    //                for (int k = 1; k < 5; k++) {
    //
    //                }
    //
    //                for (int k = 1; k <= 5; k++) {
    //
    //                }
    //            }
    //        }

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
    //        for (int i = 1; i <= 10; i++) {
    //            System.out.println("2 x " + i + " = " + n*i);
    //        }

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
                System.out.print(sum + " ");
            }
            System.out.println();
            System.out.println(sum);

        }
    }
}