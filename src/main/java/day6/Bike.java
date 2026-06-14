package day6;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike start with a kick");
    }
    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
