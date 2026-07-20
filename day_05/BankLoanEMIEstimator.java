package day_05;

import java.util.Scanner;

public class BankLoanEMIEstimator {

    static double calculateInterest(double principal, double rate, double years) {
        return principal * rate * years / 100;
    }

    static double calculateTotalPayable(double principal, double interest) {
        return principal + interest;
    }

    static double calculateMonthlyInstallment(double totalPayable, int months) {
        return totalPayable / months;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Annual interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Loan period in years: ");
        double years = sc.nextDouble();

        System.out.print("Number of months: ");
        int months = sc.nextInt();

        double interest = calculateInterest(principal, rate, years);
        double totalPayable = calculateTotalPayable(principal, interest);
        double installment = calculateMonthlyInstallment(totalPayable, months);

        System.out.println("\nLOAN ESTIMATE");
        System.out.printf("Simple Interest: Rs. %.2f%n", interest);
        System.out.printf("Total Payable: Rs. %.2f%n", totalPayable);
        System.out.printf("Monthly Instalment: Rs. %.2f%n", installment);

    }
}