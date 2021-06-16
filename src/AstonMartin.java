

public class AstonMartin extends Car {
    private int roadServiceMonths;

    public AstonMartin(String model, int year, String color, int gears, boolean isManual, int roadServiceMonths) {
        super("DB9", 2006, "Black", 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate) {
        int newVelocity =  getCurrentSpeed() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity < 10){
            changeGear(1);
        } else if(newVelocity >= 10 && newVelocity < 25) {
            changeGear(2);
        } else if(newVelocity >= 25 && newVelocity < 40) {
            changeGear(3);
        } else if(newVelocity >= 40 && newVelocity < 55) {
            changeGear(4);
        } else if(newVelocity >= 55 && newVelocity < 80) {
            changeGear(5);
        } else {
            changeGear(6);
        }
        if (newVelocity > 0) {
            changeVelocity(getCurrentDirection(), newVelocity);
        }
    }


}
