import java.util.*;
public class StringCompression {

    public static void main(String[] args) {

//        String str = "aaaabbbccddeffg";
        String str = "wwwwaaadexxxxxx";

//        solution1(str);
        solution1Followup(str);
    }

    public static void solution1Followup(String str) { // all a's then b's then c's and so on....

        if (str == null) return;

        int[] freqMap = getFreqMap(str);

        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();

        for (int i = 0; i < freqMap.length; i++)  {
            if (freqMap[i] > 0) {
                char ch = (char) (i + (int) ('a'));
                ans1.append(ch);
                ans2.append(ch + "" + freqMap[i] + "");
            }
        }

        System.out.println(ans1.toString());
        System.out.println(ans2.toString());
    }

    public static int[] getFreqMap(String str) {

        int[] freqMap = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int) (ch - 'a');
            freqMap[idx]++;
        }

        return freqMap;
    }

    public static void solution1(String str) {

        if (str == null) {
            return;
        }

        int count = 1;
        String ans1 = "";
        String ans2 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            char chp = str.charAt(i + 1);

            if (ch == chp) {
                count++;
            } else {
                ans1 = ans1 + ch;
                ans2 = ans2 + ch + count + "";
                count = 1;
            }
        }

        ans1 = ans1 + str.charAt(str.length() - 1);

        ans2 = ans2 + str.charAt(str.length() - 1) + count + "";

        System.out.println(ans1);
        System.out.println(ans2);

    }


}