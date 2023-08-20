import java.util.List;
import java.util.ArrayList;

public class getKPC {

    static String[] codes = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        String str = "78";
        System.out.println(solution(str, 0));
//
//        for (String str: solution(str, 0)) {
//            System.out.println(str);
//        }
    }

    // Time == linear
    // Space == recursive Stack O(N) + len of output
    public static List<String> solution(String str, int idx) {

        // base Case
        if (idx == str.length()) {
            List<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        char ch = str.charAt(idx); // 7

        List<String> recAns = solution(str, idx + 1);

        String currCode = codes[ch - '0'];

        List<String> myAns = new ArrayList<>();
        for (char cch: currCode.toCharArray()) {
            for (String recStr: recAns) {
                myAns.add(cch + recStr);
            }
        }

        return myAns;
    }

}