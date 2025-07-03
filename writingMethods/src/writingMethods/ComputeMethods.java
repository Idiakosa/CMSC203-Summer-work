package writingMethods;

import java.util.Random;

public class ComputeMethods {

    // Converts Fahrenheit to Celsius
    public double fToC(double degreesF) {
        return (5.0 / 9) * (degreesF - 32);
    }

    // Calculates the hypotenuse given two sides
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    // Simulates rolling two dice and returns their sum
    public int roll() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; // 1 to 6
        int die2 = rand.nextInt(6) + 1; // 1 to 6
        return die1 + die2;
    }
}