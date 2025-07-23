package exercise2;

public class CheckingAccount {
	double balance;
	String name;
	
	public CheckingAccount(double balance, String name){
		this.balance = balance;
		this.name = name;
	}
	
	public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Warning: Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Warning: Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.printf("New balance after withdrawal: $%.2f%n", balance);
        }
    }

}
