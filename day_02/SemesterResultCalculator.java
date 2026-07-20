package day_02;

import java.util.Scanner;

public class SemesterResultCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
            }

            total += marks[i];
        }

        double percentage = total / 5.0;

        System.out.println("\nSEMESTER RESULT");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Result: " + (percentage >= 40 ? "PASS" : "FAIL"));


    }
}