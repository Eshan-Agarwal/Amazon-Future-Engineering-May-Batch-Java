public class RuntimePolyMorphism {

    static class Parent {

        public void print() {
            System.out.println("Printing Parent method");
        }

    }

    static class Child extends Parent {

        // Method overriding
        @Override
        public void print() {
            System.out.println("Priniting Child method");
        }

    }

    public static void main(String[] args) {
        Child c = new Child();

        c.print();
    }

}