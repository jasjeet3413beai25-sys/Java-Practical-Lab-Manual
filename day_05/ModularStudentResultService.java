package day_05;

import java.util.Scanner;

public class ModularStudentResultService {

    static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    static double calculatePercentage(int total, int maximumMarks) {
        return total * 100.0 / maximumMarks;
    }

    static boolean isPassed(double percentage) {
        return percentage >= 40;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks[0], marks[1], marks[2], marks[3], marks[4]);
        double percentage = calculatePercentage(total, 500);

        System.out.println("\nSTUDENT RESULT");
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Status: " + (isPassed(percentage) ? "PASS" : "FAIL"));

    }
}