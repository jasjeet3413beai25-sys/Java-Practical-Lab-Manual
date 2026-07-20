package day_02;

import java.util.Scanner;

public class OnlineOrderBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Delivery charge: ");
        double deliveryCharge = sc.nextDouble();

        System.out.print("Discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double subtotal = price * quantity;
        double discount = subtotal * discountPercentage / 100;
        double finalAmount = subtotal - discount + deliveryCharge;

        System.out.println("\nORDER BILL");
        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Delivery Charge: Rs. %.2f%n", deliveryCharge);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", finalAmount);


    }
}