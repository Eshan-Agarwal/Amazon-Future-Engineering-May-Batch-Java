import java.util.Queue;
import java.util.ArrayDeque;
public class TimeNeededToBuy {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,2};
        int k = 1;

        System.out.println(solution(arr, k));

    }

    public static int solution(int[] arr, int k) {

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            q.add(i);
        }

        int time = 0;
        while (true) {
            int person = q.remove();
            arr[person]--;
            time++;

            q.add(person);
            if (person == k && arr[person] == 0) {
                return time;
            }
        }
    }

}