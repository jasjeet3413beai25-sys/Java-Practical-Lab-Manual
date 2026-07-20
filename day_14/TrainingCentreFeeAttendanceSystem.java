package day_14;

import java.util.Scanner;

class Learner {
    String id;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance;

    Learner(String id, String name, double courseFee, double amountPaid, int[] attendance) {
        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.amountPaid = amountPaid;
        this.attendance = attendance;
    }

    double calculatePendingFee() {
        return courseFee - amountPaid;
    }

    double calculateAttendancePercentage() {
        int present = 0;

        for (int day : attendance) {
            if (day == 1) present++;
        }

        return present * 100.0 / attendance.length;
    }

    boolean isCertificateEligible() {
        return calculatePendingFee() <= 0
                && calculateAttendancePercentage() >= 75;
    }

    void display() {
        System.out.println("\nLEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Pending Fee: Rs. %.2f%n", calculatePendingFee());
        System.out.printf("Attendance: %.2f%%%n", calculateAttendancePercentage());
        System.out.println("Certificate Eligibility: "
                + (isCertificateEligible() ? "Eligible" : "Not Eligible"));
    }
}

public class TrainingCentreFeeAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Learner ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Course fee: ");
        double fee = sc.nextDouble();

        System.out.print("Amount paid: ");
        double paid = sc.nextDouble();

        int[] attendance = new int[7];

        System.out.println("Enter attendance for 7 sessions (1-Present, 0-Absent):");

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
        }

        Learner learner = new Learner(id, name, fee, paid, attendance);
        learner.display();

        sc.close();
    }
}