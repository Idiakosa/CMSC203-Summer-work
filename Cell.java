package prisonExercise;

public class Cell {
    private String name;
    private boolean isDoorOpen;
    private int securityCode;

    public Cell(String name, boolean isDoorOpen, int securityCode) {
        this.name = name;
        this.isDoorOpen = isDoorOpen;
        this.securityCode = securityCode;
    }

    // Getters for name and door state
    public String getName() {
        return name;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    // Setter-like method for toggling door using code
    public void toggleDoor(int enteredCode) {
        if (enteredCode != securityCode) {
            System.out.println("Incorrect security code.");
            return;
        }

        if (isDoorOpen) {
            isDoorOpen = false;
            System.out.println("The door to cell " + name + " closes.");
        } else {
            isDoorOpen = true;
            System.out.println("The door to cell " + name + " opens.");
        }
    }
}
