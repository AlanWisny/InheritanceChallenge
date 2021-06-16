

public class Vehicle {
    private String model;
    private int year;
    private String color;

    private int currentSpeed;
    private String currentDirection;

    public Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;

        this.currentSpeed = 0;
        this.currentDirection = currentDirection;
    }

    public void steer(String direction) {
        this.currentDirection = direction;
        System.out.println("You steered the vehicle " + currentDirection);
    }


    public void speed(int speed) {
        this.currentSpeed = speed;
        System.out.println("You revved up the car up to " + speed + "km/h, Whoah!");
    }

    public void directionSpeed(String direction, int speed) {
        this.currentDirection = direction;
        this.currentSpeed = speed;
        System.out.println("You steered the vehicle " + currentDirection);
        System.out.println("You revved up the car up to " + speed + "km/h, Whoah!");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("You have set the car to a stop.");
    }



}
