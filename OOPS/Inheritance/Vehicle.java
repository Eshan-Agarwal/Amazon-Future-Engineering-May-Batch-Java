public class Vehicle {

    Vehicle() {
        System.out.println("Inside Vehicle Constructor");
    }

    Vehicle(String vehicleNumber) {
        System.out.println("Inside Vehicle param Constructor");
        this.vehicleNumber = vehicleNumber;
    }

    private String color;
    private String type;
    private int numOfTyres;
    private int numOfGears;
    private String vehicleNumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOfTyres() {
        return numOfTyres;
    }

    public void setNumOfTyres(int numOfTyres) {
        this.numOfTyres = numOfTyres;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}