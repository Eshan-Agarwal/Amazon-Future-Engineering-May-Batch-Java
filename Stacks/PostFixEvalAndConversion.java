import java.util.Stack;

public class PostFixEvalAndConversion {

    public static void main(String[] args) {
        String str = "264*8/+3-";

        postFixEvalAndConvert(str);
    }

    public static void postFixEvalAndConvert(String str) {

        Stack<Integer> evalStack = new Stack<>();
        Stack<String> prefix =  new Stack<>();
        Stack<String> infix = new Stack<>();

        for (char ch: str.toCharArray()) {

            if (Character.isDigit(ch)) {

                evalStack.push(ch - '0');
                prefix.push(ch + "");
                infix.push(ch + "");

            } else {

                char opt = ch;

                // eval
                int val2 = evalStack.pop();
                int val1 = evalStack.pop();

                int ans = operation(val1, val2, opt);
                evalStack.push(ans);

                // infix

                String inVal2 = infix.pop();
                String inVal1 = infix.pop();

                infix.push("(" + inVal1 + opt + inVal2 + ")");

                // prefix
                String preVal2 = prefix.pop();
                String preVal1 = prefix.pop();

                prefix.push(opt + preVal1 + preVal2);
            }

        }

        System.out.println(evalStack.pop());
        System.out.println(prefix.pop());
        System.out.println(infix.pop());

    }

    public static int operation(int val1, int val2, char opt) {

        int val = 0;
        switch (opt) {

            case '+':
                val =  (val1 + val2);
                break;

            case '-':
                val = val1 - val2;
                break;

            case '/' :
                val = val1/val2;
                break;

            case '*':
                val = val1 * val2;
                break;

            default:
                val = 0;


        };

        return val;
//        if (opt == '+') {
//            return (val1 + val2);
//
//        } else if (opt == '-') {
//            return (val1 - val2);
//
//        } else if (opt == '/') {
//            return (val1 / val2);
//
//        } else if (opt == '*') {
//            return (val1 * val2);
//        }
//
//        return 0; // never run
    }

}
