abstract class Cars {

    private int gearSystem;

    // abstract method
    abstract void run();
    abstract void changeGear();


    // Non Abstract methods
    public void printInfo() {
        System.out.println("Printing car Information");
    }



}