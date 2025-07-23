package practice7_1;

import java.util.Random;


public class Game {
	    private String name;
	    private int costPerPlay;

	    public Game(String name, int costPerPlay) {
	        this.name = name;
	        this.costPerPlay = costPerPlay;
	    }

	    public void play(Card card) {
	        if (card.getCredits() >= costPerPlay) {
	            card.deductCredits(costPerPlay);
	            int ticketsWon = new Random().nextInt(21); // up to 20
	            card.addTickets(ticketsWon);
	            System.out.println("Card #" + card.getCardNumber() + " played " + name +
	                " | Tickets won: " + ticketsWon + " | Total tickets: " + card.getTickets());
	        } else {
	            System.out.println("Card #" + card.getCardNumber() + " has insufficient credits for " + name);
	        }
	    }
}
