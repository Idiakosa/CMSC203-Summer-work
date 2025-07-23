package exercise2;

public class SavingsBond {
    private double principal;
    private int monthsRemaining;
    private double interestRate;

    // Constructor
    public SavingsBond(double principal, int termMonths) {
        if (termMonths < 1 || termMonths > 60) {
            throw new IllegalArgumentException("Term must be between 1 and 60 months.");
        }
        this.principal = principal;
        this.monthsRemaining = termMonths;
        this.interestRate = determineInterestRate(termMonths);
    }

    // Determine interest rate based on term
    private double determineInterestRate(int term) {
        if (term >= 48) return 0.025;
        if (term >= 36) return 0.020;
        if (term >= 24) return 0.015;
        if (term >= 12) return 0.010;
        return 0.005;
    }

    // Apply one month's interest
    public void applyMonthlyInterest() {
        if (monthsRemaining > 0) {
            principal += principal * interestRate;
            monthsRemaining--;
        }
    }

    // Getters
    public double getPrincipal() {
        return principal;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Print bond details
    public void printBondDetails() {
        System.out.printf("Bond Principal: $%.2f\n", principal);
        System.out.println("Months Remaining: " + monthsRemaining);
        System.out.println("Monthly Interest Rate: " + (interestRate * 100) + "%");
    }
}