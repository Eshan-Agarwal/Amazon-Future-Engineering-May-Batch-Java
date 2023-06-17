public class LogicalAndConditionalOperators {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Logical Operators

        // AND --> && --> condition1 && condition2
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
        // Amusement Kid
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the age of your kid");
        int age = scn.nextInt();

        System.out.println("Is kid with his parent");
        boolean isParent = scn.nextBoolean();
//
//        System.out.println((age >= 18) && isParent);

        // OR operator --> ||
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);

//        System.out.println((age >= 18) || isParent);

//        System.out.println(!true);
//        System.out.println(!false);

        // NOT operator
        System.out.println(!false);
        System.out.println(!true);

        //        // Comparison Operator // t or f
//        System.out.println(1 == 1); // true
//        System.out.println(12 > 12); // false
//        System.out.println(12 < 12); // false
//        System.out.println(12 >= 12); // true
//        System.out.println(12 <= 12); // true

        // Conditional Operators
//        if (age >= 18 || isParent) {
//            System.out.println("Kid is allowed");
//        } else {
//            System.out.println("Kid is not allowed");
//        }

//        if (age >= 18) {
//            System.out.println("Kid is allowed. His age is more than 18");
//        } else if (isParent) {
//            System.out.println("Kid is under 18 but he is with his parent. Allowed");
//        } else {
//            System.out.println("Kid is not allowed");
//        }    }
}