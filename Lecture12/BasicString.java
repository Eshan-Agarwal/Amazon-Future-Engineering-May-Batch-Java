public class BasicString {

    public static void main(String[] args) {

        // create one method
//        String str = "I like Pizza";

//        System.out.println("I am print =" + str.charAt(1) + "this is nothing");

        // loop into it
//        for (int i = 0; i < str.length(); i++) {
//            // char
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }

//        // for-each
//        for (char ch: str.toCharArray()) {
//            System.out.println(ch);
//        }

//        String str1 = new String("I like pasta");
//
//        System.out.println(str1);
        experiment4();
    }

    public static void experiment1() {

        String str1 = "Java";
        String str2 = "C++";
        String str3 = "java";
        String str4 = "Java";

        System.out.println(str1 == str4);
        System.out.println(str1 == str3);

    }

    public static void experiment2() {
        String str1 = new String("Java");
        String str2 = new String("C++");
        String str3 = new String("java");
        String str4 = new String("Java");

        System.out.println(str1 == str4);
        System.out.println(str1 == str3);
    }

    public static void experiment3() {

        String str1 = "Java";
        String str2 = "C++";
        String str3 = "Java";

        String str4 = new String("Java");
        String str5 = new String("C++");
        String str6 = new String("Java");

        String str7 = new String("Java").intern();

        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == str7); // true

    }

    public static void experiment4() {

        // Str is immutable --> cannot update str

        String str1 = "I Like Pizza";
        System.out.println(str1);

        str1 = str1 + ", Pasta"; // update str1

        System.out.println(str1);

        String str2 = new String("I like Pizza");
        str2 = str2 + ", Pasta"

    }

}