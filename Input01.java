package input01;

public class Input01 {
    public static void main(String[] args) {
        // Create a JOptionPane.
        // Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Enter a number:");
        System.out.println("You entered: " + input);
        
        // Parse the input as an int.
        // Print its value +1
        int num = Integer.parseInt(input);
        System.out.println("Your number + 1 is: " + (num + 1));
        
        // Try creating a dialog, parsing it, and initializing an int in a single line.
        // You should have only one semicolon (;) in this line.
        int number = Integer.parseInt(JOptionPane.showInputDialog("??")) +1;
// doesn't work 
    }
}