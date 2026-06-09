package day3;

import java.util.Scanner;

public class TempAdapter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperature = 0;
        int TotalHours = 8;
        double sum = 0;
        boolean warning = false;
        int EcoHours = 0;

        for (int i = 1; i <= TotalHours; i++) {

            System.out.println("Enter your temperature " + i);
            temperature = sc.nextDouble();

            sum += temperature;

            if (temperature > 26) {
                System.out.println("AC IS ON");
            }
            else if (temperature >= 20 && temperature <= 26) {
                System.out.println("AC IS ECO MODE");
                EcoHours++;
            }
            else {
                System.out.println("AC IS OFF");
            }

            if (temperature >= 30) {
                warning = true;
            }
        }

        double av = sum / TotalHours;

        System.out.println("TEMP AVG = " + av);
        System.out.println("TOTAL ECO HOURS = " + EcoHours);

        if (warning) {
            System.out.println("Alert: Severe Overheating!");
        }

        sc.close();
    }
}