package practice7_1;

public class Terminal {
	    private PrizeCategory[] prizes;

	    public Terminal(PrizeCategory[] prizes) {
	        this.prizes = prizes;
	    }

	    public void loadCredits(Card card, int dollars) {
	        int credits = dollars * 2;
	        card.addCredits(credits);
	        System.out.println("Card #" + card.getCardNumber() + " loaded with " + credits + " credits.");
	    }

	    public void checkBalance(Card card) {
	        System.out.println("Card #" + card.getCardNumber() + " | Credits: " + card.getCredits() +
	            " | Tickets: " + card.getTickets());
	    }

	    public void transferCredits(Card from, Card to, int amount) {
	        if (from.getCredits() >= amount) {
	            from.deductCredits(amount);
	            to.addCredits(amount);
	            System.out.println("Transferred " + amount + " credits from Card #" +
	                from.getCardNumber() + " to Card #" + to.getCardNumber());
	        }
	        checkBalance(from);
	        checkBalance(to);
	    }

	    public void transferTickets(Card from, Card to, int amount) {
	        if (from.getTickets() >= amount) {
	            from.deductTickets(amount);
	            to.addTickets(amount);
	            System.out.println("Transferred " + amount + " tickets from Card #" +
	                from.getCardNumber() + " to Card #" + to.getCardNumber());
	        }
	        checkBalance(from);
	        checkBalance(to);
	    }

	    public void redeemPrize(Card card, String prizeName) {
	        for (PrizeCategory prize : prizes) {
	            if (prize.getName().equalsIgnoreCase(prizeName)) {
	                prize.awardPrize(card);
	                checkBalance(card);
	                return;
	            }
	        }
	        System.out.println("Prize not found: " + prizeName);
	    }

}
