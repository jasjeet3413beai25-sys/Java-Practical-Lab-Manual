package day_06;

import java.util.Scanner;

public class ElectricityConsumptionEstimator {

    static double calculateBill(int units) {
        return units * 6.0;
    }

    static double calculateBill(int units, double equipmentCharge) {
        return units * 6.0 + equipmentCharge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Consumer type (1-Room, 2-Laboratory): ");
        int type = sc.nextInt();

        System.out.print("Units: ");
        int units = sc.nextInt();

        double total;
        double equipmentCharge = 0;
        String consumerType;

        if (type == 1) {
            consumerType = "Room";
            total = calculateBill(units);
        } else {
            consumerType = "Laboratory";
            System.out.print("Fixed equipment charge: ");
            equipmentCharge = sc.nextDouble();
            total = calculateBill(units, equipmentCharge);
        }

        System.out.println("\nELECTRICITY ESTIMATE");
        System.out.println("Type: " + consumerType);
        System.out.printf("Energy Charge: Rs. %.2f%n", units * 6.0);
        if (type != 1)
            System.out.printf("Equipment Charge: Rs. %.2f%n", equipmentCharge);
        System.out.printf("Total Cost: Rs. %.2f%n", total);

    }
}