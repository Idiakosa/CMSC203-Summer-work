package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter three integers:");

        // Attempt to read three integers
        while (count < 3) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                // If input isn't an integer, print an error and skip it
                String invalid = scanner.next();
                System.out.println("Invalid input: \"" + invalid + "\" is not an integer.");
            }
        }

        System.out.println("Sum: " + sum);

        // Remember to close the Scanner
        scanner.close();
    }
}