package day_06;

import java.util.Scanner;

public class CampusAreaUtility {

    static double area(double side) {
        return side * side;
    }

    static double area(double length, double width) {
        return length * width;
    }

    static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        double result;
        String shape;

        if (choice == 1) {
            System.out.print("Side: ");
            double side = sc.nextDouble();
            result = area(side);
            shape = "Square";
        } else if (choice == 2) {
            System.out.print("Length: ");
            double length = sc.nextDouble();
            System.out.print("Width: ");
            double width = sc.nextDouble();
            result = area(length, width);
            shape = "Rectangle";
        } else {
            System.out.print("Radius: ");
            int radius = sc.nextInt();
            result = area(radius);
            shape = "Circle";
        }

        System.out.println("\nAREA RESULT");
        System.out.println("Shape: " + shape);
        System.out.printf("Area: %.2f square units%n", result);

    }
}