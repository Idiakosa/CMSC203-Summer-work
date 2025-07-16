package problem2;

import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number: ");
        int number = scanner.nextInt();

        for (int i = 12; i >= 1; i--) {
            System.out.println(number + "x" + i + " = " + (number * i));
        }

        scanner.close();
    }
}