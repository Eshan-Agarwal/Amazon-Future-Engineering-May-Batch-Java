import java.util.*;

public class StringBuilderIntro {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("I Like");
        sb.append(" Coding");

//        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb.length());
        char s = sb.charAt(1);
        System.out.println(s);

//        StringBuilder sb = new StringBuilder("I Like Java");
    }

}