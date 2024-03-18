package onlinebanking;
public class Card {
    private String card_number;
    private String customer_id;
    private String card_type;
    private String expiry_date;

    public Card(String card_number, String customer_id, String card_type, String expiry_date) {
        this.card_number = card_number;
        this.customer_id = customer_id;
        this.card_type = card_type;
        this.expiry_date = expiry_date;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public static void main(String[] args) {
        Card myCard = new Card("123456789", "987654321", "Visa", "12/25");

        System.out.println("Card Number: " + myCard.getCard_number());
        System.out.println("Customer ID: " + myCard.getCustomer_id());
        System.out.println("Card Type: " + myCard.getCard_type());
        System.out.println("Expiry Date: " + myCard.getExpiry_date());
    }
}