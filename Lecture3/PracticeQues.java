import java.util.Scanner;
public class PracticeQues {

    public static void main(String[] args) {


        // Ques 1 --> take an input from user and print is number is positive --> positive number else print neg number
        Scanner scn = new Scanner(System.in);


//        System.out.println("Enter a number");
//        int num = scn.nextInt();
//
//        if (num >= 0) {
//            System.out.println("Positive number");
//        } else {
//            System.out.println("Negative Number");
//        }

        /* Ques2: take 3 numbers from input
               num1, num2, num3
               you need to find max and min number among them

             num1 = 12
             num2 = -4
             num3 = -2

             max = num1; min = num2

         */

//        int num1 = scn.nextInt();
//        int num2 = scn.nextInt();
//        int num3 = scn.nextInt();
//
//        // max
//        int max = num1;
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }
//
//        System.out.println("max value: " + max);
//
//        // min
//        int min = num1;
//        if (num2 < min) {
//            min = num2;
//        }
//        if (num3 < min) {
//            min = num3;
//        }
//
//        System.out.println("Min value: " + min);

        /* Ques3: --> take input num of classes held and num of classes attended,
         now print if students can give exam or not based on his attendance, so if attendance >= 75%

            totalClasses, classesAttended
            percentage of his attendance
         */

//        int totalClasses = scn.nextInt();
//        int classesAttend = scn.nextInt();
//
//        double percAttend = (classesAttend * 1.0 / totalClasses) * 100;
//
//        if (percAttend >= 75) {
//            System.out.println("Allowed in exam");
//        } else {
//            System.out.println("Not allowed in exam");
//        }

        /* Ques4:

                Company --> bonus to employees

                bonus --> employee --> yoe > 2 company give x % of monthly basic

                i/p :
                monthly Salary = 100000
                yoe --> 3
                increment --> in percentage

                O/P:
                bonus -->

         */

//        int monthlySalary = scn.nextInt();
//        float yearOfExp = scn.nextFloat();
//        float increment = scn.nextFloat();
//
//        if (yearOfExp > 2) {
//            float bonus = monthlySalary * (increment / 100);
//            System.out.println("Bonus is applied bonusAmount: " + bonus);
//        } else {
//            System.out.println("Bonus is not applied");
//        }

        // Ques 5

//        int n = scn.nextInt();
//
//        if (n % 5 == 0 || n % 11 == 0) {
//            System.out.println("Divisible");
//        } else {
//            System.out.println("Not Divisible");
//        }

        // Ques6:

//        int len = scn.nextInt();
//        int bred = scn.nextInt();
//
//        int area = len * bred;
//        int perm = 2 * (len + bred);
//
//        if (area > perm) {
//            System.out.println("More Area");
//        } else {
//            System.out.println("More perm");
//        }

        // Ques 7

        int n = scn.nextInt();

        int ans = 0;
        while(n != 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }

        System.out.println("Rev Num is " + ans);

    }

}
