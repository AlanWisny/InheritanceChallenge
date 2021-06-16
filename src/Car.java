

public class Car extends Vehicle {
    private int gears;
    private boolean isManual;

    private int currentGear;


    public Car(String model, int year, String color, int gears, boolean isManual) {
        super(model, year, color);
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("You changed the gear to " + currentGear + ", slow the fuckdown!");
    }

    public void changeVelocity(String direction, int speed) {
        directionSpeed(direction, speed);
        System.out.println("You now steered the vehicle " + direction);
        System.out.println("You are now riding this baby a " + speed + "km/h, you are a fucking beast bruv.");
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }
}
