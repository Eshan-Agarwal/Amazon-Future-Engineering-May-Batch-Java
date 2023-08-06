import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);

        // built in method
//        Collections.reverse(list);
//        System.out.println(list);

        reverse(list);
        System.out.println(list);

    }

    public static void reverse(ArrayList<Integer> list) {
        if (list == null) return;

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            swap(list, i, j);
            i++;
            j--;
        }

    }

    public static void swap(ArrayList<Integer> list, int i, int j) {

        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}