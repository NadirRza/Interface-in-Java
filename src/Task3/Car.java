package Task3;

public class Car extends Vehicle implements Drivable{

    @Override
    public void accelerate() {
        System.out.println("Speed accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Speed brake");
    }
}
