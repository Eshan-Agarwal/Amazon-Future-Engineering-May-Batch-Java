public class CharStringDatatype {
    public static void main(String[] args) {
//
//        // Syntax
//        char ch = 'a';
//        char ch1 = '1';
//        char ch2 = '$';
//
//        int i = 65;
//
//        System.out.println("This is char: " + (char)i);
//
//        System.out.println("This is char to int " + (int)ch);

        String str = "xyz";
        str = "xyzabcd";

        System.out.println(str);

        char ch = str.charAt(3);
        System.out.println("Char from str is : " + ch);

        System.out.println(str.length());

        // Other type
        String str1 = new String("XYZA");
        System.out.println(str1);
    }
}