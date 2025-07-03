package tip01;

public class Tip01 {
    public static void main(String[] args) {
    	
        //Find everyone's individual total after tax(5%) and tip(15%) 
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
    	// original amounts
    	double person1 = 10.0;
    	double person2 = 12.0; 
    	double person3 = 9.0;
    	double person4 = 8.0;
    	double person5 = 7.0;
    	double person6 = 15.0; // Alex
    	double person7 = 11.0;
    	double person8 = 30.0;
    	
    	// combined rate for tax (5%) and tip (15%) = 20%
    	double rate = 1.20;
    	
    	// final totals with tax and tip
    	double total1 = person1 * rate;
    	double total2 = person2 * rate;
    	double total3 = person3 * rate;
    	double total4 = person4 * rate;
    	double total5 = person5 * rate;
    	double total6 = person6 * rate;
    	double total7 = person7 * rate;
    	double total8 = person8 * rate;
    	
    	// display results
    	System.out.println("Person 1: $" + total1);
    	System.out.println("Person 2: $" + total2);
    	System.out.println("Person 3: $" + total3);
    	System.out.println("Person 4: $" + total4);
    	System.out.println("Person 5: $" + total5);
    	System.out.println("Person 6: $" + total6);
    	System.out.println("Person 7: $" + total7);
    	System.out.println("Person 8: $" + total8);

    }    
}