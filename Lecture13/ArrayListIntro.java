import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListIntro {

    public static void main(String[] args) {
//        Integer a = new Integer(1); // Heap memory .. new keyword
//        System.out.println(a);
//
//        Integer a = 1; // heap memory
//        System.out.println(a);

        ArrayList<Integer> list = new ArrayList<>(); // empty array list with default capacity
//
//        addInList(list);
//        basicMethods(list);
//
//        moreWayToCreateListt(list);
        inputFromUser(list);

    }

    public static void addInList(ArrayList<Integer> list) {

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        // size of ArrayList
        System.out.println(list.size());

        // printWholeList
//        System.out.println(list);
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
//
//        // with for loop
//        for (int i = 0; i < list.size(); i++) {
//
//            // get element
//            int val =  list.get(i); // arrays --> arr[i]
//            System.out.print(val + " ");
//
//        }

//        // with while loop
//        int i = 0;
//        while (i < list.size()) {
//            System.out.print(list.get(i++) + " ");
//        }

        // for each loop
        for (int val: list) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    public static void basicMethods(ArrayList<Integer> list) {

        // update an AL
        list.set(2, 300);
        System.out.println(list);

        // Sort list

        Collections.sort(list);
        System.out.println(list);

        // add in b/w
        list.add(2, 5);
        System.out.println(list);

        // Remove
        // a) remove by idx
        list.remove(2);
        System.out.println(list);

        // b) remove by element

        list.remove(new Integer(300));
        System.out.println(list);

    }

    public static void moreWayToCreateListt(ArrayList<Integer> list) {

//        // Capacity 10
//        ArrayList<Integer> list = new ArrayList<>(10);
//

        ArrayList<Integer> newList = new ArrayList<>(list);
        System.out.println(newList);

    }

    public static void inputFromUser(ArrayList<Integer> list) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while (n-- > 0) {
            list.add(scn.nextInt());
        }

        for (int val: list) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
}