import java.util.Stack;
import java.lang.StringBuilder;

public class ReverseString {

    public static void main(String[] args) {

        String str = "abcdee";

        String ans = solution(str);
        System.out.println(ans);

    }

    public static String solution(String str) {

        Stack<Character> st = new Stack<>();
//
//        for (int i = 0l i <str.size(); i++) {
//
//        }

        for (char ch: str.toCharArray()) {

            st.push(ch);

        }

        StringBuilder sb = new StringBuilder();
        while(! st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

}