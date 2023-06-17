public class Methods {

    // Access modifier static/non-static datatype varName; --> Method Signature

    private static int a = 5;

    int b = 10;

    public static void main(String[] args) {
        //        int sumOfTwoVar = sum(10, 2);
        //        System.out.println(sumOfTwoVar);
        //
        //        float sumOfTwoFloat = sumOfFloat(10f, 2f);
        //        System.out.println(sumOfTwoFloat);
        //
        //        System.out.println("a: " + a);
        //        String fullName  = printString();
        //        System.out.println(fullName);
    }

    public static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static float sumOfFloat(float a, float b) {
        float ans = a + b;
        return ans;
    }

    public static String printString() {
        String myName = "Eshan Agarwal";
        return  myName;
    }

}