package shoppingCart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        double price = 12.00;
        double tax = 3.67;
        int quantity = 3;     
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase " + quantity + " " +itemDesc;
        
        double totalPrice = (price * quantity) * (1 + tax);
                
        System.out.println(message);
        
        System.out.println("Total cost with tax is: " + totalPrice);
    }    
}
