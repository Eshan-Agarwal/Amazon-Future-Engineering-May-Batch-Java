public class House {


    // Instance Variables
    private int numOfRooms; // default value --> 0
    private int numOfKitchens;
    private nint numOfWashrooms;
    private boolean isStairs; // default value --> false
    private String address; // default value --> null

    // Default
    House() {
        System.out.println("Calling deault Constructor");
    }


    // param constructor
    House(int numOfRooms, int numOfKitchens, int numOfWashrooms) {
        System.out.println("Calling Param Constructor with 3 param");
        this.numOfRooms = numOfRooms;
        this.numOfWashrooms = numOfWashrooms;
        this.numOfKitchens = numOfKitchens;
    }

    // param constructor
    House(int numOfRooms, int numOfKitchens,
          int numOfWashrooms, String address, boolean isStairs) {
        System.out.println("Calling Param Constructor with 5 param");
        this.numOfRooms = numOfRooms;
        this.numOfWashrooms = numOfWashrooms;
        this.numOfKitchens = numOfKitchens;
        this.isStairs = isStairs;
        this.address = address;
    }


    // getters
    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getNumOfKitchens() {
        return this.numOfKitchens;
    }

    public int getNumOfWashrooms() {
        return this.numOfWashrooms;
    }

    public boolean getIsStair() {
        return this.isStairs;
    }

    public String getAddress() {
        return this.address;
    }


    // Setter methods

    public void setNumOfKitchens(int numOfKitchens) {
        this.numOfKitchens = numOfKitchens;
    }

    public void setNumOfWashrooms(int numOfWashrooms) {
        this.numOfWashrooms = numOfWashrooms;
    }

    public void setStairs(boolean stairs) {
        this.isStairs = stairs;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void printInfo(int num) {
        System.out.println("House " + num + " Information" );

        System.out.println(this.getNumOfRooms());

        System.out.println(this.getNumOfKitchens());

        System.out.println(this.getNumOfWashrooms());
    }

}