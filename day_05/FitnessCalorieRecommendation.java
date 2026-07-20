
package day_05;

import java.util.Scanner;

public class FitnessCalorieRecommendation {

    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Height in metres: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("\nFITNESS REPORT");
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + getBMICategory(bmi));
        System.out.println("Recommendation: Maintain regular exercise and balanced diet.");


    }
}