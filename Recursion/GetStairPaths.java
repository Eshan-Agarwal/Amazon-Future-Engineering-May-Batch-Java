import java.util.ArrayList;
import java.util.List;

public class GetStairPaths {

    public static void main(String[] args) {
        int n = 3;

        System.out.println(solution(n, 2));
    }


    // Time = O(3 ^ n)
    // Space = recursive Stack + output space
    public static List<String> solution(int n) {

        // base case
        if (n <= 0) {
            List<String> bans = new ArrayList<>();
            if (n == 0) {
                bans.add("");
            }
            return bans;
        }

        List<String> path1 = solution(n - 1);
        List<String> path2 = solution(n - 2);
        List<String> path3 = solution(n - 3);

        List<String> myAns = new ArrayList<>();

        // path1
        for (String str: path1) {
            myAns.add(1 + str + "");
        }
        // path2
        for (String str: path2) {
            myAns.add(2 + str + "");
        }
        // path1
        for (String str: path3) {
            myAns.add(3 + str + "");
        }
        return myAns;
    }


    // Time = O(k ^ n)
    // Space = recursive Stack + output space
    public static List<String> solution(int n, int k) {

        // base case
        if (n <= 0) {
            List<String> bans = new ArrayList<>();
            if (n == 0) {
                bans.add("");
            }
            return bans;
        }

        List<String> myAns = new ArrayList<>();
        for (int i = 1; i <=k; i++) {
            List<String> recAns = solution(n - i);
            for (String str: recAns) {
                myAns.add(i + str + "");
            }
        }
        return myAns;
    }

}