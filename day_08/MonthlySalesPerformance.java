package day_08;

import java.util.Scanner;

public class MonthlySalesPerformance {

    static double calculateTotal(double[] sales) {
        double total = 0;
        for (double sale : sales) total += sale;
        return total;
    }

    static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    static int countTargetMonths(double[] sales, double target) {
        int count = 0;
        for (double sale : sales) {
            if (sale >= target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sales = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Sales for Month " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
        }

        System.out.print("Target: ");
        double target = sc.nextDouble();

        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f%n", calculateTotal(sales));
        System.out.printf("Average Monthly Sales: Rs. %.2f%n", calculateAverage(sales));
        System.out.println("Months Achieving Target: " + countTargetMonths(sales, target));

        
    }
}