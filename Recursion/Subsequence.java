import java.util.ArrayList;
public class Subsequence {

    public static void main(String[] args) {
        String str = "abc";

//        printAllSubseq1(str, "");
//        printAllSubseq2(str, "", 0);

        System.out.println(printAllSubseq3(str, "", 0));
    }


    public static void printAllSubseq1(String str, String ans) {

            // base case
            if (str.length() == 0) {
                System.out.println(ans);
                return;
            }
            char ch = str.charAt(0);
            String restOfStr = str.substring(1);

            // char can come
            printAllSubseq1(restOfStr, ans + ch);

            // char cannot come
            printAllSubseq1(restOfStr, ans);

    }

    public static void printAllSubseq2(String str, String ans, int idx) {

        // base case
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);

        // char can come
        printAllSubseq2(str, ans + ch, idx + 1);

        // char cannot come
        printAllSubseq2(str, ans, idx + 1);

    }

    public static ArrayList<String> printAllSubseq3(String str, String ans, int idx) {

        // base case
        if (idx == str.length()) {
            ArrayList<String> bans = new ArrayList<>();
            bans.add(ans);
            return bans;
        }
        char ch = str.charAt(idx);

        // char can come
        ArrayList<String> charCome = printAllSubseq3(str, ans + ch, idx + 1);

        // char cannot come
        ArrayList<String> charNotCome = printAllSubseq3(str, ans, idx + 1);

        ArrayList<String> currAns = new ArrayList<>();
        for (String val: charCome) {
            currAns.add(val);
        }
        for (String val: charNotCome) {
            currAns.add(val);
        }
        return currAns;
    }


}