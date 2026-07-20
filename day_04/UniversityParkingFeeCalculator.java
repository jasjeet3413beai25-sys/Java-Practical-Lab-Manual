package day_04;

import java.util.Scanner;

public class UniversityParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vehicle type (1-Two-wheeler, 2-Car): ");
        int vehicleType = sc.nextInt();

        System.out.print("Parking hours: ");
        int hours = sc.nextInt();

        while (hours < 1 || hours > 12) {
            System.out.print("Hours must be between 1 and 12. Enter again: ");
            hours = sc.nextInt();
        }

        int fee;
        String vehicle;

        if (vehicleType == 1) {
            vehicle = "Two-wheeler";
            fee = 10 + (hours - 1) * 5;
        } else if (vehicleType == 2) {
            vehicle = "Car";
            fee = 20 + (hours - 1) * 10;
        } else {
            vehicle = "Invalid";
            fee = 0;
        }

        System.out.println("\nPARKING FEE");
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Hours: " + hours);
        System.out.println("Fee: Rs. " + fee);

    }
}