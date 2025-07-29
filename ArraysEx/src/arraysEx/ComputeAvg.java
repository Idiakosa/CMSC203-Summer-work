package arraysEx;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        final int NUM_TESTS = 5;
        int[] scores = new int[NUM_TESTS];
        Scanner scanner = new Scanner(System.in);

        // Input five test scores from the console
        for (int i = 0; i < NUM_TESTS; i++) {
            System.out.print("Enter score for test " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Calculate the average score
        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = total / (double) NUM_TESTS;

        // Output the average
        System.out.println("Student's average score: " + average);

        scanner.close();
    }
}