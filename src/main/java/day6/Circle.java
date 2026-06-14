package day6;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    void info() {
        System.out.println("shape is Drawing Circle");
    }
}
