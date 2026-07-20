package day_08;

import java.util.Scanner;

public class ClassAttendanceAnalysis {

    static void readAttendance(double[] values, Scanner sc) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("Attendance of Student " + (i + 1) + ": ");
            values[i] = sc.nextDouble();
        }
    }

    static double calculateAverage(double[] values) {
        double total = 0;
        for (double value : values) total += value;
        return total / values.length;
    }

    static int countShortage(double[] values, double limit) {
        int count = 0;
        for (double value : values) {
            if (value < limit) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        double[] attendance = new double[n];
        readAttendance(attendance, sc);

        System.out.println("\nCLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%%n", calculateAverage(attendance));
        System.out.println("Students Below 75%: " + countShortage(attendance, 75));

        
    }
}