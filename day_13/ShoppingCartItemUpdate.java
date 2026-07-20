
package day_13;

import java.util.Scanner;

class CartItem {
    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("CART ITEM");
        System.out.println("Item: " + itemName);
        System.out.printf("Unit Price: Rs. %.2f%n", unitPrice);
        System.out.println("Updated Quantity: " + quantity);
        System.out.printf("Current Total: Rs. %.2f%n", calculateAmount());
    }
}

public class ShoppingCartItemUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        String item = sc.nextLine();

        System.out.print("Unit price: ");
        double price = sc.nextDouble();

        System.out.print("Initial quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Updated quantity: ");
        int updatedQuantity = sc.nextInt();

        CartItem cartItem = new CartItem(item, price, quantity);
        cartItem.updateQuantity(updatedQuantity).display();

    }
}