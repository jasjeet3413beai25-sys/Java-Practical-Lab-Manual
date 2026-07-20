
package day_14;

import java.util.Scanner;

class ProgressStudent {
    int rollNumber;
    String name;
    int[] marks;
    double attendance;

    ProgressStudent(int rollNumber, String name, int[] marks, double attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int total() {
        int total = 0;
        for (int mark : marks) total += mark;
        return total;
    }

    double average() {
        return total() / 5.0;
    }

    String result() {
        for (int mark : marks) {
            if (mark < 40) return "FAIL";
        }
        return "PASS";
    }

    String attendanceStatus() {
        return attendance >= 75 ? "Satisfactory" : "Shortage";
    }

    void display() {
        System.out.printf("%d %s - Total: %d, Average: %.2f, Result: %s, Attendance: %s%n",
                rollNumber, name, total(), average(), result(), attendanceStatus());
    }
}

public class CollegeStudentProgressManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProgressStudent[] students = new ProgressStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            for (int j = 0; j < 5; j++) {
                System.out.print("Marks " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            students[i] = new ProgressStudent(roll, name, marks, attendance);
        }

        System.out.println("\nCLASS REPORT");
        for (ProgressStudent student : students) {
            student.display();
        }

        
    }
}