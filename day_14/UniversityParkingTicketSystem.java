
package day_14;

import java.util.Scanner;

class Vehicle {
    String number;
    int type;

    Vehicle(String number, int type) {
        this.number = number;
        this.type = type;
    }

    String getTypeName() {
        return type == 1 ? "Two-wheeler" : "Car";
    }
}

class ParkingTicket {
    Vehicle vehicle;
    int hours;
    int fee;

    ParkingTicket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
        calculateFee();
    }

    void calculateFee() {
        if (vehicle.type == 1) {
            fee = 10 + (hours - 1) * 5;
        } else {
            fee = 20 + (hours - 1) * 10;
        }
    }

    void printTicket(int number) {
        System.out.println("TICKET " + number + ": "
                + vehicle.number + ", "
                + vehicle.getTypeName() + ", "
                + hours + " hours, Fee Rs. " + fee);
    }
}

public class UniversityParkingTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        ParkingTicket[] tickets = new ParkingTicket[n];
        int totalRevenue = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Vehicle number: ");
            String number = sc.nextLine();

            System.out.print("Type (1-Two-wheeler, 2-Car): ");
            int type = sc.nextInt();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            tickets[i] = new ParkingTicket(new Vehicle(number, type), hours);
            totalRevenue += tickets[i].fee;
        }

        System.out.println("\nPARKING TICKETS");

        for (int i = 0; i < n; i++) {
            tickets[i].printTicket(i + 1);
        }

        System.out.println("Total Revenue: Rs. " + totalRevenue);


    }
}