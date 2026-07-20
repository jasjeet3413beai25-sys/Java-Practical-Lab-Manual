package day_03;

import java.util.Scanner;

public class CollegeAdmissionProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Programme: ");
        String programme = sc.nextLine();

        System.out.print("Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.println("\nADMISSION PROFILE");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Programme: " + programme);
        System.out.println("Semester: " + semester);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);


    }
}