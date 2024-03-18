package onlinebanking;
public class Transaction {
    private int tra_number;
    private String account_number;
    private String date_of_tra;
    private String tra_type;

    // Constructor
    public Transaction(int tra_number, String account_number, String date_of_tra, String tra_type) {
        this.tra_number = tra_number;
        this.account_number = account_number;
        this.date_of_tra = date_of_tra;
        this.tra_type = tra_type;
    }

    // Getters and Setters
    public int getTraNumber() {
        return tra_number;
    }

    public void setTraNumber(int tra_number) {
        this.tra_number = tra_number;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public void setAccountNumber(String account_number) {
        this.account_number = account_number;
    }

    public String getDateOfTransaction() {
        return date_of_tra;
    }

    public void setDateOfTransaction(String date_of_tra) {
        this.date_of_tra = date_of_tra;
    }

    public String getTransactionType() {
        return tra_type;
    }

    public void setTransactionType(String tra_type) {
        this.tra_type = tra_type;
    }

    // Main method for testing
    public static void main(String[] args) {
        Transaction transaction = new Transaction(12345, "ACCT123", "2024-03-14", "Deposit");

        System.out.println("Transaction Number: " + transaction.getTraNumber());
        System.out.println("Account Number: " + transaction.getAccountNumber());
        System.out.println("Date of Transaction: " + transaction.getDateOfTransaction());
        System.out.println("Transaction Type: " + transaction.getTransactionType());
    }
}