public class Combinations {

    public static void main(String[] args) {
        int nbox = 5;
        int ritems = 3;

        solution(nbox, ritems, 1, 0, "");
    }

    public static void solution(int nbox, int ritems, int currBox, int currItem, String ans) {
        if (currItem > ritems) {
            return;
        }

        if (currBox > nbox) {
            if (currItem == ritems) {
                System.out.println(ans);
            }
            return;
        }

        solution(nbox, ritems, currBox + 1, currItem + 1, ans + "i");
        solution(nbox, ritems, currBox + 1, currItem, ans + "-");
    }
}