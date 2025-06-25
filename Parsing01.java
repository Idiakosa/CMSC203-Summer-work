package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
    	String shirtPrice = "15";
    	String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        double price = Double.parseDouble(shirtPrice); // parse shirt as double
        double rate = Double.parseDouble(taxRate); // parse taxRate as double
        double tax = price * rate; // multiply the two
        System.out.println("Tax: " + tax); // print it out
        
        int rate2 = Integer.parseInt(taxRate); //throws error
        int gibberish2 = Integer.parseInt(gibberish); //throws error
    }
    
}