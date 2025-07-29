package arrayListEX;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        // Create an ArrayList with a list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // Display the contents using an Iterator
        System.out.println("Original list:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove all even numbers
        iterator = numbers.iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        // Display the contents after removing even numbers
        System.out.println("List after removing even numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}