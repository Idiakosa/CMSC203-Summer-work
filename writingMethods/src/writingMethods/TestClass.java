package writingMethods;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods cm = new ComputeMethods();

        // Convert Fahrenheit to Celsius
        double celsius = cm.fToC(100.0);
        System.out.println("Temp in celsius is " + celsius);

        // Calculate hypotenuse
        double hypotenuse = cm.hypotenuse(6, 9);
        System.out.println("Hypotenuse is " + hypotenuse);

        // Simulate dice roll
        int diceSum = cm.roll();
        System.out.println("The sum of the dice values is " + diceSum);
    }
}