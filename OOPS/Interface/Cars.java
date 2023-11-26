public class Cars implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed) {
        this.speed = newSpeed;
    }

    @Override
    public void applyBreaks() {
        System.out.println("Applying Breaks");
    }

    public void printInfo() {
        System.out.println("Gear: " + this.gear);
        System.out.println("Speed: " + this.speed);
    }

}