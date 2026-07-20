package day_09;

import java.util.Scanner;

public class QuizResponseEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] answerKey = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
        char[] responses = new char[10];

        for (int i = 0; i < responses.length; i++) {
            System.out.print("Response " + (i + 1) + ": ");
            responses[i] = sc.next().toUpperCase().charAt(0);
        }

        int correct = 0;
        int incorrect = 0;
        int unattempted = 0;

        for (int i = 0; i < answerKey.length; i++) {
            if (responses[i] == 'X') {
                unattempted++;
            } else if (responses[i] == answerKey[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        System.out.println("\nQUIZ RESULT");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Unattempted: " + unattempted);

       
    }
}