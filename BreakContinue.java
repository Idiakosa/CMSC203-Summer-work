package breakContinueEx;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            // Skip even numbers
            if (i % 2 == 0) {
                continue;
            }

            // Stop loop when i is 7
            if (i == 7) {
                break;
            }

            System.out.println("The number is " + i);
        }
    }
}