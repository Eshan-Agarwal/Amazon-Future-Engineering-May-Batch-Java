import java.util.ArrayList;
public class Subsequence {

    public static void main(String[] args) {
        String str = "abc";

//        printAllSubseq1(str, "");
//        printAllSubseq2(str, "", 0);

        System.out.println(printAllSubseq4Best(str, 0));
    }


    // T(N) --> 2^N
    // S(N) --> Recusive Stack --> O(N)
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

    // T(N) --> 2^N
    // S(N) --> Recusive Stack --> O(N)
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

    // T(N) --> 2^N
    // S(N) --> Recusive Stack O(N) + O(2^n) (store output) --> O(2^n)
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


    // T(N) --> linear
    // S(N) --> Recusive Stack O(N) + O(2^n) (store output) --> O(2^n)
    public static ArrayList<String> printAllSubseq4Best(String str, int idx) {

        // base case
        if (idx == str.length()) {

            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        char ch = str.charAt(idx);

        // faith call
        ArrayList<String> recAns = printAllSubseq4Best(str, idx + 1);

        ArrayList<String> myAns = new ArrayList<>();

        // char will come
        for (String val: recAns) {
            myAns.add(ch + val);
        }

        // char will not come
        for (String val: recAns) {
            myAns.add(val);
        }

        return myAns;
    }


}