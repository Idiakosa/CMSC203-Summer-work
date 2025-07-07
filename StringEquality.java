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
public class StringEquality {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        String name;

	        System.out.print("Enter your name: ");
	        name = input.nextLine();

	        if (name.equals("Moe")) {
	            System.out.println("You are the king of rock and roll.");
	        } else {
	            System.out.println("You are not the king.");
	        }

	        input.close();
	    }
    
}

