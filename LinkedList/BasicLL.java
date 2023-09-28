import java.util.Scanner;
public class BasicLL {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        Scanner scn = new Scanner(System.in);

        while(true) {
            String str = scn.nextLine();
            if (str.equals("quit")) {
                break;
            }
            myLinkedList.addLast(Integer.parseInt(str));

        }

        myLinkedList.printLL();
    }

}