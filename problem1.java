package problem1;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VALID_PIN = 1234;

        System.out.print("Enter your bank PIN: ");
        int enteredPIN = scanner.nextInt();

        while (enteredPIN != VALID_PIN) {
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Enter your bank PIN: ");
            enteredPIN = scanner.nextInt();
        }

        System.out.println("Correct PIN entered. Access granted to your account.");

        scanner.close();
    }
}