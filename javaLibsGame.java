package javaLibsGame;

import java.util.Scanner;

public class javaLibsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect 10+ inputs from user
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        System.out.print("Enter your favorite food: ");
        String food = input.nextLine();

        System.out.print("Enter a number of days (int): ");
        int days = input.nextInt();
        input.nextLine(); // Clear buffer

        System.out.print("Enter a temperature (double): ");
        double temperature = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your favorite animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a color: ");
        String color = input.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verb = input.nextLine();

        System.out.print("Enter a number (int) of friends you’ll bring: ");
        int friends = input.nextInt();
        input.nextLine();

        System.out.print("Enter a dollar amount (double): ");
        double money = input.nextDouble();
        input.nextLine();

        // Do math with int and double
        int totalDays = days * friends;
        double totalCost = friends * money;

        // Output story
        System.out.println("\n--- Your JavaLibs Story ---");
        System.out.println(name + " planned an epic trip to " + place + ".");
        System.out.println("They packed " + food + " for " + totalDays + " days of adventure.");
        System.out.println("It was " + temperature + " degrees outside, perfect weather for seeing a " + animal + ".");
        System.out.println("Wearing a " + color + " outfit, " + name + " was " + verb + " through the city.");
        System.out.println("With " + friends + " friends, they needed $" + totalCost + " to make it through the trip.");
        System.out.println("It was the most unforgettable vacation ever!");

        input.close();
    }
}