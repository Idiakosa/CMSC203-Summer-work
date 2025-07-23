package practice7_1;

public class ArcadeTest {
	    public static void main(String[] args) {
	        Card card1 = new Card();
	        Card card2 = new Card();

	        PrizeCategory[] prizeTypes = {
	            new PrizeCategory("Sticker", 10, 5),
	            new PrizeCategory("Stuffed Animal", 50, 2),
	            new PrizeCategory("Drone", 100, 1)
	        };

	        Terminal terminal = new Terminal(prizeTypes);
	        Game game = new Game("Win Random Tickets!", 5);

	        // Load credits
	        terminal.loadCredits(card1, 10); // 20 credits
	        terminal.loadCredits(card2, 5);  // 10 credits

	        // Play games
	        game.play(card1);
	        game.play(card2);
	        game.play(card1);

	        // Transfer balances
	        terminal.transferCredits(card1, card2, card1.getCredits());
	        terminal.transferTickets(card1, card2, card1.getTickets());

	        // Redeem prizes
	        terminal.redeemPrize(card2, "Sticker");
	        terminal.redeemPrize(card2, "Drone");

	        // Try to use Card 1 (now empty)
	        game.play(card1);
	        terminal.redeemPrize(card1, "Stuffed Animal");
	    }
}
