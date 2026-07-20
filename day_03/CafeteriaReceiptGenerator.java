package day_03;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item name: ");
        String itemName = sc.nextLine();

        System.out.print("Unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("GST rate: ");
        double gstRate = sc.nextDouble();

        double subtotal = unitPrice * quantity;
        double gst = subtotal * gstRate / 100;
        double grandTotal = subtotal + gst;

        System.out.println("\nCAFETERIA RECEIPT");
        System.out.println("Item: " + itemName);
        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);
        System.out.printf("GST: Rs. %.2f%n", gst);
        System.out.printf("Grand Total: Rs. %.2f%n", grandTotal);


    }
}