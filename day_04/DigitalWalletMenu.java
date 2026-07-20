package day_04;

import java.util.Scanner;

public class DigitalWalletMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial balance: Rs. ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\nDIGITAL WALLET");
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double add = sc.nextDouble();
                    if (add > 0) {
                        balance += add;
                        System.out.println("Money added successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter payment amount: ");
                    double payment = sc.nextDouble();
                    if (payment > 0 && payment <= balance) {
                        balance -= payment;
                        System.out.println("Payment completed.");
                    } else {
                        System.out.println("Payment failed.");
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance: Rs. %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);


    }
}