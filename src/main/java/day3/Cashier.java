package day3;

import java.util.Scanner;

public class Cashier {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity;

        do {
            System.out.print("Enter the number of items: ");
            quantity = sc.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0");
            }

        } while (quantity <= 0);

        double totalPrice = 0;

        for (int i = 1; i <= quantity; i++) {

            double itemPrice;

            do {
                System.out.print("Enter the price of item " + i + ": ");
                itemPrice = sc.nextDouble();

                if (itemPrice < 0) {
                    System.out.println("Price cannot be negative");
                }

            } while (itemPrice < 0);

            totalPrice += itemPrice;
        }

        double averagePrice = totalPrice / quantity;

        System.out.println("\n===== Invoice =====");
        System.out.println("Number of items : " + quantity);
        System.out.println("Total price     : $" + totalPrice);
        System.out.println("Average price   : $" + averagePrice);

    }
}
