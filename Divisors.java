package breakContinueEx;

import java.util.Scanner;

public class Divisors {
// modified to include comments
    public static void main(String args[]) {

         Scanner console = new Scanner(System.in); // declaring scanner variable for user input
         
        System.out.print("Enter the number :  "); // asks user to enter number
        int num = console.nextInt(); // stores user input in console
         
     System.out.print("Divisors of " + num+" "+ "="+" " ); // prints out the divisors of the number inputed by the user

        for (int i = 1; i < num; i++) {
            if (num % i != 0) {
                continue;
            } // for loop that checks if the number inputed by user is divisible by all numbers less than number then outputs those as divisors
            System.out.print(i + " , "); // outputs the divisors of the number inputed by the user
        }
    }
}
