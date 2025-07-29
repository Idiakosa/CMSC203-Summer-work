package arrayListEX;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings called students
        ArrayList<String> students = new ArrayList<>();

        // Add initial students
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");

        // Add Nick and Mike at index 0 and 1
        students.add(0, "Nick");
        students.add(1, "Mike");

        // Remove the student at index 3
        students.remove(3);

        // Print all elements using a for-each loop
        System.out.println("Updated student list:");
        for (String student : students) {
            System.out.println(student);
        }

        // Display the size of the ArrayList
        System.out.println("Total number of students: " + students.size());
    }
}