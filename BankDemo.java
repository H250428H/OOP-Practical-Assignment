public class BankDemo {

    public static void main(String[] args) {

        Account savings1 = new SavingsAccount("Kundiso", 1000.00, 200.00);
        Account current1 = new CurrentAccount("Tadiwa", 500.00, 300.00);
        Account savings2 = new SavingsAccount("Tawanda", 300.00, 200.00);
        Account current2 = new CurrentAccount("Ruva", 100.00, 500.00);
		Account savings3 = new SavingsAccount("Maja", 300.00, 200.00);
        Account current3 = new CurrentAccount("Makanaka", 100.00, 500.00);

        Account[] accounts = {
            savings1,
            current1,
            savings2,
            current2,
			savings3,
			current3
        };

        System.out.println("Bank Account Demo");
        System.out.println();

        System.out.println("Initial balances:");

        for (Account account : accounts) {
            System.out.printf("%s: %.2f%n",
                    account.accountNumber,
                    account.getBalance());
        }

        System.out.println();
        System.out.println("Withdraw 250 from each account:");

        for (Account account : accounts) {
            System.out.println();
            System.out.println("Account: " + account.accountNumber);

            account.withdraw(250.00);

            System.out.printf("Balance after withdrawal: %.2f%n",
                    account.getBalance());

            account.endOfMonth();

            System.out.printf("Balance after month-end: %.2f%n",
                    account.getBalance());
        }
    }
}