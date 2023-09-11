import java.util.Stack;

public class InfixEval {

    public static void main(String[] args) {
        String str = "2+6*4/8-3";

        int ans = evalExp(str);
        System.out.println("Eval: " + ans);
    }

    public static int evalExp(String str) {

        Stack<Character> operators = new Stack<>();
        Stack<Integer> oprand = new Stack<>();

        for (char ch: str.toCharArray()) {

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                oprand.push(ch - '0');

            } else if (ch == '+' || ch == '-'
                    || ch == '*' || ch == '/') {

                while (! operators.isEmpty() && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {

                    int val2 = oprand.pop();
                    int val1 = oprand.pop();
                    char opt = operators.pop();

                    int val = operation(val1, val2, opt);
                    oprand.push(val);
                }
                operators.push(ch);

            } else if (ch == ')') {
                while (! operators.isEmpty() && operators.peek() != '(') {
                    int val2 = oprand.pop();
                    int val1 = oprand.pop();
                    char opt = operators.pop();

                    int val = operation(val1, val2, opt);
                    oprand.push(val);
                }
                if (! operators.isEmpty()) {
                    operators.pop(); // to pop (
                }
            }

        }

        while (! operators.isEmpty()) {
            int val2 = oprand.pop();
            int val1 = oprand.pop();
            char opt = operators.pop();

            int val = operation(val1, val2, opt);
            oprand.push(val);
        }
        return oprand.pop();
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

    public static int precedence(char ch) {
        if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0; // not run
    }

}
