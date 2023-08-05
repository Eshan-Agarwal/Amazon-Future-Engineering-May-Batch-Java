import java.util.Scanner;

public class SearchChar {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);
        int n = scn.nextInt();
        char[] chArr = new char[n];

        for (int i = 0; i < n; i++) {
            chArr[i] = scn.next().charAt(0);
        }
//        sortedInputArr(chArr, ch);
        notSorted(chArr, ch);

    }

    public static void notSorted(char[] chArr, char ch) {

        int[] fmap = getFreqMap(chArr);

        int searchIdx = (int) (ch - 'a');

        for (int i = searchIdx + 1; i < 26; i++) {
            if (fmap[i] > 0) {
                char chAns = (char) (i + (int)('a'));
                System.out.println(chAns);
                return;
            }
        }

    }

    public static int[] getFreqMap(char[] chArr) {

        int[] fmap = new int[26];

        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            int idx = (int) (ch - 'a');
            fmap[idx]++;
        }
        return fmap;
    }

    public static void sortedInputArr(char[] chArr, char ch) {

        for (char ch1: chArr) {

            if (ch1 > ch) {
                System.out.println(ch1);
                return;
            }

        }

    }

}