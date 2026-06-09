package day4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        boolean letterFound = false;

        for (int i = 0; i < fullName.length(); i++) {

            char currentLetter = fullName.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {

                letterFound = true;

                break;
            }
        }

        if (letterFound) { // take last value of letterFound = true

            System.out.println("This name contain Letter A or a");

        } else {

            System.out.println("This name doesn't contain Letter A or a");
        }

        input.close();
    }
}