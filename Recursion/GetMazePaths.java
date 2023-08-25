import java.util.ArrayList;
import java.util.List;

public class GetMazePaths {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(solution(0, 0, n - 1, m - 1));
    }

    public static List<String> solution(int si, int sj, int di, int dj) {

        // base case
        if (si > di || sj > dj) {
            return new ArrayList<>();
        }

        // base case
        if (si == di &&cd Re     sj == dj) {
            List<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }

        // horizontal call
        List<String> horizontal = solution(si, sj + 1, di, dj);
        // Vertical call
        List<String> vertical = solution(si + 1, sj, di, dj);

        List<String> myAns = new ArrayList<>();

        for (String str: horizontal) {
            myAns.add("h" + str);
        }
        for (String str: vertical) {
            myAns.add("v" + str);
        }
        return myAns;
    }

}