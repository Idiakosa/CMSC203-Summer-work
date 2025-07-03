
package tip04;

public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        //Name your friends
        calc.findTotal(10, "orange");
        calc.findTotal(12, "apple");
        calc.findTotal(9,  "banana");
        calc.findTotal(8,  "lime");
        calc.findTotal(7,  "mango");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "lemon");
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
      // calc.findTotal(102, "Table's total");
       System.out.println(calc.findTotal(102, "table's total"));
    } 
}
