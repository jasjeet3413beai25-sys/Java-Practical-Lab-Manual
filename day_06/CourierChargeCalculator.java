package day_06;

import java.util.Scanner;

public class CourierChargeCalculator {

    static double calculateCharge(double weight) {
        return 50 + weight * 20;
    }

    static double calculateCharge(double weight, double distance) {
        return 50 + weight * 20 + distance * 1.5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Delivery type (1-Local, 2-Outstation): ");
        int type = sc.nextInt();

        System.out.print("Weight: ");
        double weight = sc.nextDouble();

        double charge;
        double distance = 0;
        String delivery;

        if (type == 1) {
            delivery = "Local";
            charge = calculateCharge(weight);
        } else {
            delivery = "Outstation";
            System.out.print("Distance: ");
            distance = sc.nextDouble();
            charge = calculateCharge(weight, distance);
        }

        System.out.println("\nCOURIER CHARGE");
        System.out.println("Delivery: " + delivery);
        System.out.println("Weight: " + weight + " kg");
        if (type != 1) System.out.println("Distance: " + distance + " km");
        System.out.printf("Charge: Rs. %.2f%n", charge);

    }
}