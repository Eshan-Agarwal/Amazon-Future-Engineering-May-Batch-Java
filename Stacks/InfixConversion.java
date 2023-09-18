import java.util.Stack;

public class InfixConversion {

    public static void main(String[] args) {

        String str = "a*(b-c+d)/e";

        convertInPostAndPre(str);
    }

    public static void convertInPostAndPre(String str) {

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char ch: str.toCharArray()) {

            if (ch == '(') {
                operators.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')
                        || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");

            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {

                while (! operators.isEmpty() && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {
                    char opt = operators.pop();

                    // prefix

                    String preVal2 = prefix.pop();
                    String preVal1 = prefix.pop();
                    String prefixAns = opt + preVal1 + preVal2;
                    prefix.push(prefixAns);

                    // postfix
                    String postVal2 = postfix.pop();
                    String postVal1 = postfix.pop();
                    String postAns = postVal1 + postVal2 + opt;
                    postfix.push(postAns);
                }

                operators.push(ch);

            } else if (ch == ')') {

                while (! operators.isEmpty() && operators.peek() != '(') {
                    char opt = operators.pop();

                    // prefix

                    String preVal2 = prefix.pop();
                    String preVal1 = prefix.pop();
                    String prefixAns = opt + preVal1 + preVal2;
                    prefix.push(prefixAns);

                    // postfix
                    String postVal2 = postfix.pop();
                    String postVal1 = postfix.pop();
                    String postAns = postVal1 + postVal2 + opt;
                    postfix.push(postAns);
                }

                if (! operators.isEmpty()) {
                    operators.pop();
                }
            }

        }

        while (! operators.isEmpty()) {
            char opt = operators.pop();

            // prefix

            String preVal2 = prefix.pop();
            String preVal1 = prefix.pop();
            String prefixAns = opt + preVal1 + preVal2;
            prefix.push(prefixAns);

            // postfix
            String postVal2 = postfix.pop();
            String postVal1 = postfix.pop();
            String postAns = postVal1 + postVal2 + opt;
            postfix.push(postAns);
        }

        System.out.println("PostFix exp: " + postfix.pop());
        System.out.println("PreFix exp: " + prefix.pop());

    }

    public static int precedence(char ch) {
        if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0; // not run
    }

}
