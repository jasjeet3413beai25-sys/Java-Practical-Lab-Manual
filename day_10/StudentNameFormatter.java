package day_10;

import java.util.Scanner;

public class StudentNameFormatter {

    static String formatName(String name) {
        name = name.trim();

        if (name.length() == 0) return name;

        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String first = formatName(sc.nextLine());

        System.out.print("Middle name: ");
        String middle = formatName(sc.nextLine());

        System.out.print("Last name: ");
        String last = formatName(sc.nextLine());

        System.out.println("Formatted Name: " + first + " " + middle + " " + last);
        System.out.println("Initial Format: "
                + first.charAt(0) + ". "
                + middle.charAt(0) + ". "
                + last);

    }
}