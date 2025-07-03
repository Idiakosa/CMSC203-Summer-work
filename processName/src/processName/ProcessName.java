package processName;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt user for full name
        System.out.print("Type your full name: ");
        String fullName = scanner.nextLine();

        // Step 2: Split the name into first and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Step 3: Get first initial
        char firstInitial = firstName.charAt(0);

        // Step 4: Display formatted output
        System.out.println("Your name is: " + lastName + ", " + firstInitial + ".");
    }
}