package onlinebanking;
public class Account {
    private int account_number;
    private int customer_id;
    private double opening_balance;
    private String account_type;

    // Constructor
    public Account(int account_number, int customer_id, double opening_balance, String account_type) {
        this.account_number = account_number;
        this.customer_id = customer_id;
        this.opening_balance = opening_balance;
        this.account_type = account_type;
    }

    // Getters and Setters
    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(double opening_balance) {
        this.opening_balance = opening_balance;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    // Example of how to use the Account class
    public static void main(String[] args) {
        Account account = new Account(123456, 789, 1000.0, "Savings");
        System.out.println("Account Number: " + account.getAccount_number());
        System.out.println("Customer ID: " + account.getCustomer_id());
        System.out.println("Opening Balance: $" + account.getOpening_balance());
        System.out.println("Account Type: " + account.getAccount_type());
    }
}



