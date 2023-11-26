public class Cars extends Vehicle {


    Cars() {
        super("abcd"); // parent class constructor
        System.out.println("Inside CARS constructor");

    }

    private String gearSystem;

    public String getGearSystem() {
        return gearSystem;
    }

    public void setGearSystem(String gearSystem) {
        this.gearSystem = gearSystem;
    }

    public void printCarInformation() {

        System.out.println("CARS information");

        System.out.println(super.getColor());

        System.out.println(super.getNumOfGears());

    }
}