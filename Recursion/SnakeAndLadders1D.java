import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadders1D {

    public static void main(String[] args) {
        int n = 5;
        int d = 6;

        System.out.println("Number of possible outcomes: " + solutionCount(n, d));
        System.out.println("AL: ");
        System.out.println(solutionConfig(n, d));
        solutionConfigVoid(n, d, "");
    }

    public static int solutionCount (int n, int d) {

        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        int ans = 0;
        for (int i = 1; i <= d; i++) {
            ans += solutionCount(n - i, d);
        }
        return ans;
    }

    public static List<String> solutionConfig (int n, int d) {

        if (n < 0) {
            return new ArrayList<>();
        }

        if (n == 0) {
            List<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        List<String> myAns = new ArrayList<>();
        for (int i = 1; i <= d; i++) {
            List<String> recAns = solutionConfig(n - i, d);
            for (String val: recAns) {
                myAns.add(i + val + "");
            }
        }
        return myAns;

    }

    public static void solutionConfigVoid (int n, int d, String ans) {

        if (n < 0) {
            return;
        }

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= d; i++) {
            solutionConfigVoid(n - i, d, ans + i + "");
        }

    }


}