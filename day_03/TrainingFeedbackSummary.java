package day_03;

import java.util.Scanner;

public class TrainingFeedbackSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        String studentName = sc.nextLine();

        System.out.print("Content rating: ");
        int content = sc.nextInt();

        System.out.print("Explanation rating: ");
        int explanation = sc.nextInt();

        System.out.print("Practical rating: ");
        int practical = sc.nextInt();

        double average = (content + explanation + practical) / 3.0;

        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Student: " + studentName);
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5%n", average);

    }
}
