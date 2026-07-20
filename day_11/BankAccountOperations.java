package day_11;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void setData(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f%n", balance);
    }
}

public class BankAccountOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Opening balance: ");
        double balance = sc.nextDouble();

        account.setData(number, holder, balance);

        System.out.print("Deposit: ");
        account.deposit(sc.nextDouble());

        System.out.print("Withdrawal: ");
        account.withdraw(sc.nextDouble());

        System.out.println("\nACCOUNT SUMMARY");
        account.displayAccount();

        sc.close();
    }
}