
package day_13;

import java.util.Scanner;

class Product {
    String productId;
    String name;
    double price;
    int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product: " + productId + " - " + name);
        System.out.printf("Price: Rs. %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Value: Rs. %.2f%n", calculateTotalValue());
    }
}

public class ProductBillingWithThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Product ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(id, name, price, quantity);

        System.out.println("\nPRODUCT BILL");
        product.displayProduct();
    }
}