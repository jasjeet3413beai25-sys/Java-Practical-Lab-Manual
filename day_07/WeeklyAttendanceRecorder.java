package day_07;

import java.util.Scanner;

public class WeeklyAttendanceRecorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int present = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + " (1-Present, 0-Absent): ");
            attendance[i] = sc.nextInt();

            while (attendance[i] != 0 && attendance[i] != 1) {
                System.out.print("Enter only 0 or 1: ");
                attendance[i] = sc.nextInt();
            }

            if (attendance[i] == 1) present++;
        }

        int absent = 7 - present;
        double percentage = present * 100.0 / 7;

        System.out.println("\nWEEKLY ATTENDANCE");
        System.out.println("Present Days: " + present);
        System.out.println("Absent Days: " + absent);
        System.out.printf("Attendance: %.2f%%%n", percentage);

        
    }
}