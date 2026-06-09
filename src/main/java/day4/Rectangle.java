package day4;

import java.util.Scanner;

public class Rectangle {

    Scanner input = new Scanner(System.in);
    //encapsulation => data hiding, data protection, data security

    private double length; // field
    private double width;  // field

    public void setLength(double length) {
        if(length > 0){
            this.length = length;
        }
        else
            {
            System.out.println("Please enter the length");
            }

    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }
        else
        {
            System.out.println("Please enter the width");
        }
    }

    public double getWidth() {
        return width;
    }
    public double calculateArea(){
        double area = 0;
        area = width * length;
        return area;
    }
    //    public double calculateArea() {
//
//        System.out.println("Enter length of rectangle:");
//        length = input.nextDouble();
//        System.out.println("Enter width of rectangle:");
//        width = input.nextDouble();
//        double area = length * width;
//        System.out.println("The area of the rectangle is " + area);
//        return area;
//    }
}
