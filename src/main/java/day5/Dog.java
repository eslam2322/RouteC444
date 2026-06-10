package day5;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("this dog eats food");
    }
    public void bark() {
        System.out.println("this dog barks");
    }
    @Override
    public void sound() {
        System.out.println("this dog Barks");
    }
}
