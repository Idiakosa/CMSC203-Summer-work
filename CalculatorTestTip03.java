package tip03;
public class CalculatorTest {
   public static void main(String[] args) {
      
      Calculator calc = new Calculator();
     
      //Use the Calculator object and arguments supplied to findTotal()
      //to print the total for each person
      double person1 = 10.0;
      double person2 = 12.0;
      double person3 = 9.0;
      double person4 = 8.0;
      double person5 = 7.0;
      double person6 = 15.0; // alex
      double person7 = 11.0;
      double person8 = 30.0;
     
      calc.findTotal(person1, ": Person 1");
      calc.findTotal(person2, ": Person 2");
      calc.findTotal(person3, ": Person 3");
      calc.findTotal(person4, ": Person 4");
      calc.findTotal(person5, ": Person 5");
      calc.findTotal(person6, ": Person 6");
      calc.findTotal(person7, ": Person 7");
      calc.findTotal(person8, ": Person 8");
     
     
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
   }   
}
