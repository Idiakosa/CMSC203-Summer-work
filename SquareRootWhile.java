package whileLoopExercise;

import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;

        System.out.print("Type a non-negative integer: ");
        number = console.nextInt();

        while (number < 0) {
            System.out.print("Invalid number, try again: ");
            number = console.nextInt();
        }

        double squareRoot = Math.sqrt(number);
        System.out.printf("The square root of %d is %.2f%n", number, squareRoot);
    }
}