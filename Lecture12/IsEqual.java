import java.util.Scanner;
public class IsEqual  {

    public static void main(String[] args) {
        System.out.println(usingNormal());
    }

    public static boolean usingNormal() {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        if (str1 == null && str2 == null) return true; //Edge case I
        if (str1 == null || str2 == null) return false; // Edge Case II

        if (str1.length() != str2.length()) return false; // Optimisation

        for (int i = 0; i < str1.length() ; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    public static void usingStringLiteral() {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine().intern(); // intern will make string in String pool memory not in heap memory
        String str2 = scn.nextLine().intern();


        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }
    }
}