import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private String description;
    private double amount;

    public Transaction(String transactionId, Date date, String description, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
        System.out.println("Amount: $" + amount);
    }
}
