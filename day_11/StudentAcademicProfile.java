package day_11;

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks;
    double attendance;

    void assignData(int rollNumber, String name, int marks, double attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    boolean calculateResult() {
        return marks >= 40;
    }

    void displayProfile() {
        System.out.println(rollNumber + " - " + name
                + " - Marks: " + marks
                + " - Attendance: " + attendance + "%"
                + " - " + (calculateResult() ? "PASS" : "FAIL"));
    }
}

public class StudentAcademicProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.print("Roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            students[i].assignData(roll, name, marks, attendance);
        }

        System.out.println("\nSTUDENT PROFILES");
        for (Student student : students) {
            student.displayProfile();
        }

        sc.close();
    }
}