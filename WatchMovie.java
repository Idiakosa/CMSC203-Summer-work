/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalEx;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double price = scan.nextDouble();
        System.out.println("Enter the movie rating \n");
        int rating = scan.nextInt();
        
        if(price >= 12 && rating == 5) {
        	System.out.println("I'm interessted in watching the movie");
        } else {
        	System.out.println("I'm not interested in watching the movie");
        }
    }
}
