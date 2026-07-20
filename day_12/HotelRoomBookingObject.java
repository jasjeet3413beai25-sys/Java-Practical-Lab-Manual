package day_12;


import java.util.Scanner;

class Room {
    int roomNumber;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    double bookRoom(int days) {
        if (available && days > 0) {
            available = false;
            return dailyRate * days;
        }
        return 0;
    }
}

public class HotelRoomBookingObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Room type: ");
        String type = sc.nextLine();

        System.out.print("Daily rate: ");
        double rate = sc.nextDouble();

        System.out.print("Stay days: ");
        int days = sc.nextInt();

        Room room = new Room(number, type, rate);
        double amount = room.bookRoom(days);

        System.out.println("\nBOOKING DETAILS");
        System.out.println("Room: " + number + " - " + type);
        System.out.println("Days: " + days);
        System.out.printf("Total Amount: Rs. %.2f%n", amount);
        System.out.println("Status: " + (amount > 0 ? "Booked" : "Not Booked"));


    }
}