/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number between 1 and 10:");
        num = in.nextInt();
        
        if (num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("The num is even " + num + ".");
            } else {
                System.out.println("The num is odd " + num + ".");
            }
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
        }

    }
}
