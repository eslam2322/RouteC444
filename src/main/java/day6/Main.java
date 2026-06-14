package day6;

public class Main {
    static void main(String[] args) {

            Animal[] animals = {
                    new Dog(),
                    new Cat(),
                    new Cow()
            };

            for (int i = 0; i < animals.length; i++) {

                animals[i].makeSound();

            }
//            Shape shape = new Circle();
//            Shape shape2 = new Squere();
//            shape.draw();
//            shape.info();
//            shape2.draw();
//            shape2.info();
//              Vehicle vehicle = new Car();
//              Vehicle vehicle1 = new Bike();
        Calculator calculator = new Calculator();
            calculator.add(5,6);
         double x =  calculator.add(20.5,15.3);
            calculator.add(3,6,9);
        System.out.println("x = " + x);

    }
}
