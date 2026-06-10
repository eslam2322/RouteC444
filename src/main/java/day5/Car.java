package day5;

public class Car extends Vehicle {

   public Car(String brand, int year) {
       super(brand, year);

    }


    public void honk() {
        System.out.println("Beep Beep!");
    }

    @Override
    public void start() {
        System.out.println("Car start!");
    }
}