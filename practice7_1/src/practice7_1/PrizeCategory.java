package practice7_1;

public class PrizeCategory {
	    private String name;
	    private int ticketsRequired;
	    private int quantityAvailable;

	    public PrizeCategory(String name, int ticketsRequired, int quantityAvailable) {
	        this.name = name;
	        this.ticketsRequired = ticketsRequired;
	        this.quantityAvailable = quantityAvailable;
	    }

	    public String getName() {
	        return name;
	    }

	    public boolean awardPrize(Card card) {
	        if (card.getTickets() < ticketsRequired) {
	            System.out.println("Not enough tickets for: " + name);
	            return false;
	        }
	        if (quantityAvailable <= 0) {
	            System.out.println("Out of stock: " + name);
	            return false;
	        }
	        card.deductTickets(ticketsRequired);
	        quantityAvailable--;
	        System.out.println("Prize awarded: " + name +
	            " | Remaining: " + quantityAvailable + " | Card #" + card.getCardNumber());
	        return true;
	    }

}
