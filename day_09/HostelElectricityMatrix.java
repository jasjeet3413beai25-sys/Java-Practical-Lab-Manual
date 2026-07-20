package day_09;

import java.util.Scanner;

public class HostelElectricityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] units = new int[4][7];
        int hostelTotal = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Room " + (i + 1));

            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                units[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nHOSTEL ELECTRICITY REPORT");

        for (int i = 0; i < 4; i++) {
            int roomTotal = 0;

            for (int j = 0; j < 7; j++) {
                roomTotal += units[i][j];
            }

            hostelTotal += roomTotal;
            System.out.println("Room " + (i + 1) + " Weekly Units: " + roomTotal);
        }

        System.out.println("Total Hostel Consumption: " + hostelTotal + " units");

        
    }
}