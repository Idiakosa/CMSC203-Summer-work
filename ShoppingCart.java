/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsEx;
/**
 *
 * @author anshenoy
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Find the index of the space character
         spaceIdx = custName.indexOf(" ");

        // Get the first name using substring
        firstName = custName.substring(0, spaceIdx);

        // Print the first name
        System.out.println("First name: " + firstName);

    }

    
}
