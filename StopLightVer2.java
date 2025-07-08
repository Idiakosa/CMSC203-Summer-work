package problem5_3;

import java.util.Scanner;

public class StopLightVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        int currentColor = scanner.nextInt();

        switch (currentColor) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid color");
        }

        scanner.close();
    }
}