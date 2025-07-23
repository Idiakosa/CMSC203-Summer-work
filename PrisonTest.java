package prisonExercise;

public class PrisonTest {
    public static void main(String[] args) {
        Cell cell1 = new Cell("A1", false, 1234);
        Cell cell2 = new Cell("B2", true, 4321);
        Cell cell3 = new Cell("C3", false, 9876);

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell1);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, cell2);
        Prisoner spike = new Prisoner("Spike", 1.80, 5, cell3);

        System.out.println("\nDisplaying Bubba:");
        bubba.printFields();

        System.out.println("\nDisplaying Twitch:");
        twitch.printFields();

        System.out.println("\nDisplaying Spike:");
        spike.printFields();

        System.out.println("\nTesting cell security (incorrect and correct codes):");
        cell1.toggleDoor(0000); // Incorrect
        cell1.toggleDoor(1234); // Opens
        cell1.toggleDoor(1234); // Closes
    }
}
