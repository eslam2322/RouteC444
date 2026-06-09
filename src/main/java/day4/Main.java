package day4;

public class Main {

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        double x = rectangle.calculateArea();
//        System.out.println("The area of the rectangle is " + x);
        Rectangle r1 = new Rectangle();
        r1.setLength(20);
        r1.setWidth(10);
       double area = r1.calculateArea();
       System.out.println("Area of Rectangle is: " + area);
       Rectangle r2 = new Rectangle();
       r2.setLength(10.5);
       r2.setWidth(10.5);
       double area2 = r2.calculateArea();
       System.out.println("Area of Rectangle 2 is: " + area2);
        System.out.println("-----------------------------------");
        double sum = area + area2;
        System.out.println("Sum of Area of Rectangle is: " + sum);

//        Sum s = new Sum();
//
//        s.sum2Number(10, 20);
//
//        s.sum2Number(10, 40);
//
//        hamada();
//
//        Main obj = new Main();
//        obj.total(10, 20);

    }

    public static void hamada() {
        System.out.println("Hello, Hamada");
    }

    public void total(int x, int y) {

        int sum = x + y;

        System.out.println("The total is: " + sum);
    }
}