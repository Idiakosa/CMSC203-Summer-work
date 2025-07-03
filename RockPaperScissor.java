/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomEx;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(3); // generates 0, 1, or 2
        System.out.println(number);

    }
}
