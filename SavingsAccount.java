public class SavingsAccount extends Account {

    private final double minimumBalance;
    private static final double INTEREST_RATE = 0.005;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal rejected. Minimum balance must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Savings withdrawal successful.");
        }
    }

    @Override
    public void endOfMonth() {
        double interest = balance * INTEREST_RATE;
        balance += interest;

        System.out.printf("Interest added: %.2f%n", interest);
    }
}