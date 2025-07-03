package tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        Calculator calc = new Calculator();
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
        double person1 = 10.0;
        double person2 = 12.0;
        double person3 = 9.0;
        double person4 = 8.0;
        double person5 = 7.0;
        double person6 = 15.0; // alex
        double person7 = 11.0;
        double person8 = 30.0;
        
        calc.originalPrice = person1;
        System.out.println("Person 1: ");
        calc.findTotal();
        calc.originalPrice = person2;
        System.out.println("Person 2: ");
        calc.findTotal();
        calc.originalPrice = person3;
        System.out.println("Person 3: ");
        calc.findTotal();
        calc.originalPrice = person4;
        System.out.println("Person 4: ");
        calc.findTotal();
        calc.originalPrice = person5;
        System.out.println("Person 5: ");
        calc.findTotal();
        calc.originalPrice = person6;
        System.out.println("Person 6: ");
        calc.findTotal();
        calc.originalPrice = person7;
        System.out.println("Person 7: ");
        calc.findTotal();
        calc.originalPrice = person8;
        System.out.println("Person 8: ");
        calc.findTotal();
    }
}
