package day_07;

import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        int overBudget = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Expense for Day " + (i + 1) + ": ");
            expenses[i] = sc.nextDouble();
            total += expenses[i];
        }

        System.out.print("Daily budget limit: ");
        double budget = sc.nextDouble();

        for (int i = 0; i < 7; i++) {
            if (expenses[i] > budget) overBudget++;
        }

        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total Spending: Rs. %.2f%n", total);
        System.out.printf("Average Daily Spending: Rs. %.2f%n", total / 7);
        System.out.println("Days Above Budget: " + overBudget);

        
    }
}