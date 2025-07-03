/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsEx;
import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
    	// Declare String variables
        String firstName, middleName, lastName, fullName;

        // Create Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt and read user input
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        // Set and display fullName
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
    
}

