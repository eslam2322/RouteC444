package day3;

import java.util.Scanner;

public class ConditionalStatement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter 1st number, please:");
//        int firstNum = sc.nextInt();
//
//        System.out.println("Enter 2nd number, please:");
//        int secondNum = sc.nextInt();
//
//        System.out.println("Enter 3rd number, please:");
//        int thirdNum = sc.nextInt();
//
//        if (firstNum == secondNum && secondNum == thirdNum) {
//
//            System.out.println("All numbers are equal");
//
//        } else if (firstNum >= secondNum && firstNum >= thirdNum) {
//
//            System.out.println("First number " + firstNum + " is the greatest");
//
//        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
//
//            System.out.println("Second number " + secondNum + " is the greatest");
//
//        } else {
//
//            System.out.println("Third number " + thirdNum + " is the greatest");
//
//        }


//        System.out.println("Enter the day number:");
//        int dayNum = sc.nextInt();
//
//        if (dayNum == 1)
//            System.out.println("Monday");
//
//        else if (dayNum == 2)
//            System.out.println("Tuesday");
//
//        else if (dayNum == 3)
//            System.out.println("Wednesday");
//
//        else if (dayNum == 4)
//            System.out.println("Thursday");
//
//        else if (dayNum == 5)
//            System.out.println("Friday");
//
//        else if (dayNum == 6)
//            System.out.println("Saturday");
//
//        else if (dayNum == 7)
//            System.out.println("Sunday");
//
//        else
//            System.out.println("Invalid input. Please enter a number from 1 to 7");
        System.out.println("Enter the day number:");
        int dayNum = sc.nextInt();

        switch (dayNum) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input. Please enter a number from 1 to 7");
        }


    }
}
