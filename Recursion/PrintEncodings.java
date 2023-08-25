public class PrintEncodings {

    public static void main(String[] args) {
        String str = "655196";

        solution(str, "");
    }

    public static void solution(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {
                String ros = str.substring(1);
                int chInt = ch - '0';
                String code = (char)((int)('a') + chInt - 1) + "";
                solution(ros, ans + code);
            }
        } else { // string len >= 2

            // first char pick
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {
                String ros = str.substring(1);
                int chInt = ch - '0';
                String code = (char)((int)('a') + chInt - 1) + "";
                solution(ros, ans + code);
            }

            // two char pick
            String twoChar = str.substring(0, 2);
            String twoStrRos = str.substring(2);

            String code = (char) ((int)('a') + Integer.parseInt(twoChar) - 1) + "";

            if (Integer.parseInt(twoChar) <= 26) {
                solution(twoStrRos, ans + code);
            }

        }

    }

}