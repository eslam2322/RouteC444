package day2;

import java.util.Scanner;

public class ConditionalStatement {
    static void main(String[] args) {
        // Scanner -> allow take inputs from external source

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age, please!");
//        int personAge = sc.nextInt();

// System.out.println("Your age is: " + personAge);
// String status = personAge >= 18 ? "good to vote" : "not good to vote";
// System.out.println("Your status is: " + status);
//
//        if (personAge >= 18)
//        {
//            System.out.println("You are good to vote");
//        }
//        else
//        {
//            System.out.println("You are not good to vote");
//        }


// Program to check even or odd
        System.out.println("Enter a number to decide even or odd");

        int number = sc.nextInt();

// True
        if (number >= 0) {

            if (number == 0) {

                System.out.println("The number is zero");

            } else if (number % 2 == 0) {

                System.out.println("The number " + number + " is even");

            } else {

                System.out.println("The number " + number + " is odd");

            }

        } else {

            System.out.println("Negative number is not allowed ");

        }

    }
}
