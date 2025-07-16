package breakContinueEx;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter up to 10 numbers. Entering 0 will exit early.");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("Sum of numbers entered: " + sum);
        scanner.close();
    }
}