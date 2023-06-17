public class VariablesAndDataTypes {

    public static void main(String[] args) {

        // Variables --> datatype nameOfVar (camel Casing)

        // int var
        int myAge; // variable declaration
        myAge = 24; // variable initialization

        int myAge1 = 25; // variable declaration & initialization

        System.out.println("Int var myAge: " + myAge);

        // decimal
//        float f = 11.234;
        double d = 11.234;
        System.out.println("Var double d: " + d);

        // char
        char ch = 'a';
        System.out.println("Char ch: " + ch);

//        byte b = -128; // -128 ..... 127 only
//        short s = 129;
//        int i = 122;
//        long l = 123;
//
//        int i = 2147483647;
//        System.out.println("Largest int number i : " + i);
//
//        int i1 = i + 1;
//        System.out.println("Largest int number after i  i1 : " + i1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(1 == 2);
        System.out.println(1 == 1);

        System.out.println(1 != 2);
        System.out.println(1 != 1);


        int i = 123;
        float f = i + 1;

        String str = "My name is Eshan Agarwal";
        System.out.println(str);

        boolean b = true;
        boolean b1 = false;

    }

}
