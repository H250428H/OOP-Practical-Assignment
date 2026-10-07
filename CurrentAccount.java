public class CurrentAccount extends Account {

    private final double overdraftLimit;
    private static final double MONTHLY_FEE = 5.00;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal rejected. Overdraft limit exceeded.");
        } else {
            balance -= amount;

            if (balance < 0) {
                System.out.println("Withdrawal successful. Account is in overdraft.");
            } else {
                System.out.println("Current account withdrawal successful.");
            }
        }
    }

    @Override
    public void endOfMonth() {
        balance -= MONTHLY_FEE;

        System.out.printf("Monthly fee deducted: %.2f%n", MONTHLY_FEE);
    }
}