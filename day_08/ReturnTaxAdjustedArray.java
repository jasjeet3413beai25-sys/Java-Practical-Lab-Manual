package day_08;

import java.util.Scanner;

public class ReturnTaxAdjustedArray {

    static double[] addTax(double[] prices, double taxRate) {
        double[] adjusted = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {
            adjusted[i] = prices[i] + prices[i] * taxRate / 100;
        }

        return adjusted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of items: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("GST percentage: ");
        double taxRate = sc.nextDouble();

        double[] adjusted = addTax(prices, taxRate);

        System.out.print("ORIGINAL PRICES: ");
        for (double price : prices) System.out.printf("%.2f ", price);

        System.out.print("\nGST-ADJUSTED PRICES: ");
        for (double price : adjusted) System.out.printf("%.2f ", price);

       
    }
}