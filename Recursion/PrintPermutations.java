import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

    public static void main(String[] args) {
        String str = "abc";

        System.out.println(solution(str));
    }

    public static List<String> solution(String str) {

        if (str.length() == 0) {
            List<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            List<String> recans = solution(ros);
            for (String val: recans) {
                ans.add(ch + val);
            }
        }

        return ans;
    }

}