package day4;

import java.util.Scanner;

public class StudentAverageScore {

    public static void main(String[] args) {

        int numberOfStudents = 3;
        int numberOfCourses = 4;

        Scanner sc = new Scanner(System.in);

        double grandTotal = 0;

        for (int i = 1; i <= numberOfStudents; i++) {

            double total = 0;

            for (int j = 1; j <= numberOfCourses; j++) {

                System.out.println(
                        "Enter score for course " + j +
                                " for student " + i);

                double score = sc.nextDouble();

                total += score;
                grandTotal += score;
            }

            double average = total / numberOfCourses;

            System.out.println(
                    "The average score of student " +
                            i + " is " + average);
        }

        double overallAverage =
                grandTotal / (numberOfStudents * numberOfCourses);

        System.out.println("--------------------------------");

        System.out.println(
                "The overall average of all students is: "
                        + overallAverage);

        sc.close();
    }
}