import java.util.Date;

public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("789012", 500.0);

        // Perform transactions
        account1.deposit(200.0);
        account1.withdraw(50.0);

        account2.deposit(300.0);
        account2.withdraw(100.0);

        // Display final balances
        System.out.println("Final balance for account 1: $" + account1.getBalance());
        System.out.println("Final balance for account 2: $" + account2.getBalance());

        // Create transactions
        Transaction transaction1 = new Transaction("T123", new Date(), "Deposit", 200.0);
        Transaction transaction2 = new Transaction("T456", new Date(), "Withdrawal", 50.0);

        // Display transactions
        System.out.println("\nTransaction 1 details:");
        transaction1.displayTransaction();

        System.out.println("\nTransaction 2 details:");
        transaction2.displayTransaction();
    }
}
