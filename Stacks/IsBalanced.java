public class IsBalanced {
    public static void main(String[] args) {

    }
    public static boolean oppositeBrack(char closingBrack, char openBrack, Stack<Character> st) {

        if (st.isEmpty()) {
            return false;
        } else if (st.peek() != openBrack) {
            return false;
        }
        st.pop();
        return true;
    }

    public static boolean isBalanced(String str) {

        Stack<Character> st = new Stack<>();

        for (char ch: str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {

                if (! oppositeBrack(ch, '(', st)) {
                    return false;
                }

            } else if (ch == ']') {
                if (! oppositeBrack(ch, '[', st)) {
                    return false;
                }
            } else if (ch == '}') {
                if (! oppositeBrack(ch, '{', st)) {
                    return false;
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}