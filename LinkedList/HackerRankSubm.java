import java.util.Scanner;
public class HackerRankSubm {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        Scanner scn = new Scanner(System.in);

        while(true) {
            String str = scn.nextLine();
            if (str.equals("quit")) {
                break;
            }
            String[] strArr = str.split(" ");
            myLinkedList.addLast(Integer.parseInt(strArr[1]));

        }

        myLinkedList.printLL();

    }

}