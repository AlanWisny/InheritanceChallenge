

public class Main {
    public static void main(String[] args){

//        Vehicle Aston = new Vehicle("DB9", 2006, "Black");
//        Aston.steer("left");
//        Aston.speed(180);
//        Aston.directionSpeed("right", 250);


        AstonMartin Martin = new AstonMartin("DB9", 2006, "Black", 6, false, 5);
       Martin.steer("Right");
        Martin.accelerate(30);
        Martin.accelerate(20);
        Martin.accelerate(-45);
        Martin.accelerate(-5);
    }



}



