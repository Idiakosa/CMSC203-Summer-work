package prisonExercise;

public class Prisoner {
    private String name;
    private double height;
    private int yearsSentenced;
    private Cell cell;

    private int bookingNumber;
    private static int prisonerCount = 0;

    public Prisoner(String name, double height, int yearsSentenced, Cell cell) {
        this.name = name;
        this.height = height;
        this.yearsSentenced = yearsSentenced;
        this.cell = cell;

        prisonerCount++;
        this.bookingNumber = prisonerCount;
    }

    public void think() {
        System.out.println("I'll have my revenge.");
    } 
    
//  //Constructor 
//  public Prisoner(){
//  System.out.println("This is a constructor"); 
//  }

    public void printFields() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Years Sentenced: " + yearsSentenced);
        System.out.println("Cell Name: " + cell.getName());
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Total Prisoners: " + prisonerCount);
    }

    public void printFields(boolean shouldThink) {
        printFields();
        if (shouldThink) {
            think();
        }
    }

    // Getters and setters (from previous encapsulation exercise)
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getYearsSentenced() {
        return yearsSentenced;
    }

    public Cell getCell() {
        return cell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setYearsSentenced(int yearsSentenced) {
        this.yearsSentenced = yearsSentenced;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
