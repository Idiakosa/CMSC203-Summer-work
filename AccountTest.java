package exercise2;

public class AccountTest {
	public static void main(String[] args) {
		CheckingAccount myAccount = new CheckingAccount(500.34, "Alice");
		
		// test withdraw with valid amonunt
		myAccount.withdraw(100.00);
		//test withdraw with invalid amount
		myAccount.withdraw(-46.3);
		// test withdraw with too much
		myAccount.withdraw(100000.533);
		
		 // SavingsBond tests
        SavingsBond myBond = new SavingsBond(1000.00, 36); // $1000, 36-month bond
        myBond.printBondDetails();

        // Simulate passing months
        for (int i = 1; i <= 6; i++) {
            myBond.applyMonthlyInterest();
            System.out.println("\nAfter " + i + " month(s):");
            myBond.printBondDetails();
        }

	}
	
}
