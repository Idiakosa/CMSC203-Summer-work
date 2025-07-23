package practice7_1;

public class Card {
	    private int cardNumber;
	    private int credits;
	    private int tickets;

	    private static int nextCardNumber = 1;

	    public Card() {
	        this.cardNumber = nextCardNumber++;
	        this.credits = 0;
	        this.tickets = 0;
	    }

	    public int getCardNumber() {
	        return cardNumber;
	    }

	    public int getCredits() {
	        return credits;
	    }

	    public int getTickets() {
	        return tickets;
	    }

	    public void addCredits(int amount) {
	        if (amount > 0) credits += amount;
	    }

	    public void deductCredits(int amount) {
	        if (amount > 0 && credits >= amount) credits -= amount;
	    }

	    public void addTickets(int amount) {
	        if (amount > 0) tickets += amount;
	    }

	    public void deductTickets(int amount) {
	        if (amount > 0 && tickets >= amount) tickets -= amount;
	    }

}
