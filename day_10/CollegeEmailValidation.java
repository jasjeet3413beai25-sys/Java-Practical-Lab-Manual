package day_10;

import java.util.Scanner;

public class CollegeEmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Required domain: ");
        String domain = sc.nextLine().trim();

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        boolean valid = firstAt > 0
                && firstAt == lastAt
                && email.endsWith(domain);

        System.out.println("\nEMAIL VALIDATION");
        System.out.println("Email: " + email);
        System.out.println("Status: " + (valid ? "Valid college email" : "Invalid college email"));


    }
}