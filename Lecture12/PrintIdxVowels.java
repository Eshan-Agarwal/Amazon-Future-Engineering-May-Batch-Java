import java.util.Scanner;

public class PrintIdxVowels {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine(); // will read whole line together, do not depends on spaces

//        String str = scn.next(); // stop reading after a space in a line

        System.out.println(str);

        printVowelsIdx(str);

    }

    public static void printVowelsIdx(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (isVowel(ch)) {
                System.out.print(i + " ");
            }

        }

    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
            return true;
        }
        return false;
    }

}