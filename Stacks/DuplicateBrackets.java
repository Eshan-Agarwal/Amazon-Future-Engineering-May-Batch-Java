import java.util.Stack;
public class DuplicateBrackets {

    public static void main(String[] args) {
        String str = "(a+b)+((c+d))";

        if (isDuplicate(str)) {
            System.out.println("String contains duplicate brackets");
        } else {
            System.out.println("String do not contains duplicate brackets");
        }
    }

    public static boolean isDuplicate(String str) {

        Stack<Character> st = new Stack<>();

        for (char ch: str.toCharArray()) {

            if (ch == ')') {

                if (!st.isEmpty()) {
                    if (st.peek() == '(') {
                        return true;
                    } else {

                        while(st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }
                }

            } else {
                st.push(ch);
            }

        }

        if (st.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

}