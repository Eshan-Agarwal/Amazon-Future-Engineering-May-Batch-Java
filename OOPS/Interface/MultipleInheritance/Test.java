public class Test {

    interface I1 {
        void show();
    }

    interface I2 extends I1 {

    }

    interface I3 extends I1 {

    }

    static class MultipleInheritance implements I2, I3 {

        void show () {
            System.out.println("This is Show method");
        }
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.show();
    }

}