package day5;

public class Bike extends Vehicle {

    public Bike(String brand, int year) {
    super(brand,year);

    }
    public void ringBell() {
        System.out.println("Ring Ring!");
    }
    @Override
    public void start() {
        System.out.println("Bike start!");
    }
}
