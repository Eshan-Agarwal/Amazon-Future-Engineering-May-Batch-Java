import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // using Scanner class (Scanner java file provided by java devs)
        Scanner scn = new Scanner(System.in); // scn is a variable and Scanner here is a non premitive Datatype create by me


        // input int variable
//        System.out.println("Enter a float number: ");
//        int i = scn.nextInt();

//        // input long
//        long l = scn.nextLong();

//        // float
//        float f = scn.nextFloat();
//System.out.println("f: " + f);
//        // Strings input
        String str = scn.nextLine();
        System.out.println(str);
//        String str1 = scn.nextLine();
//        System.out.println("My String is : " + str1);


//        boolean b = scn.nextBoolean();

//        char ch = scn.next().charAt(0);
//        System.out.println("Ch: " + ch);
    }

}
