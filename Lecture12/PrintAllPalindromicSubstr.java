public class PrintAllPalindromicSubstr {

    public static void main(String[] args) {

        String str = "nitin";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i  + 1; j <= str.length(); j++) {

                String temp = str.substring(i, j);
                if (isPalindromicString(temp)) {
                    System.out.println(temp);
                }

            }

        }

    }

    public static boolean isPalindromicString(String str) {

        int i = 0; int j = str.length() - 1;

        while (i < j) {
            char chi = str.charAt(i);
            char chj = str.charAt(j);

            if (chi != chj) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

}