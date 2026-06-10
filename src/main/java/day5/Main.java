package day5;

import day4.Sum;

public class Main {
    static void main(String[] args) {
//        Person person = new Person("eslam",25,'m');
//        person.printdata();
//        BankAccount bankAccount = new BankAccount(2000);
//        bankAccount.getBalance();
//        bankAccount.deposit(10000);
//        bankAccount.getBalance();
//        Dog dog = new Dog();
//        dog.bark();
//        dog.sleep();
//        dog.eat();
//        Car car = new Car("Bmw",2019);
//        System.out.println("Car Brand: " + car.brand);
//        System.out.println("Car Year: " + car.year);
//        car.start();   // inherited from Vehicle
//        car.honk();    // Car method
//        System.out.println("----------------");
//
//        Bike bike = new Bike("Yamaha",2025);
//        System.out.println("Bike Brand: " + bike.brand);
//        System.out.println("Bike Year: " + bike.year);
//        bike.start();      // inherited from Vehicle
//        bike.ringBell();   // Bike method
        //poly comp time
//        MathUtils mathUtils = new MathUtils();
//        mathUtils.sum(2,8);
//        mathUtils.sum(2,5.6);
        Shape[] shapes = {
                new Circle(),
                new Square(),
                new Triangle()
        };

        for (int i = 0; i < shapes.length; i++) {

            shapes[i].draw();

        }
    }
}
