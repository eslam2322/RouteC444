package day3;
import java.util.Scanner;

public class AddNumberDoWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {

            System.out.println("Enter first number");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is: " + sum);

            System.out.println(
                    "Would you like to sum another numbers? \nWrite True if you want to insert another number.\nIf not write False"
            );

            flag = sc.nextBoolean();

            if (flag == false) {
                System.out.println("Thank you for using this program");
            }

        } while (flag);
    }
}
