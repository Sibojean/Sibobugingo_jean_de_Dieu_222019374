package onlinebanking;
public class Branch {
    private int bra_id;
    private String bra_name;
    private String bra_city;

    // Constructor
    public Branch(int bra_id, String bra_name, String bra_city) {
        this.bra_id = bra_id;
        this.bra_name = bra_name;
        this.bra_city = bra_city;
    }

    // Getters and Setters
    public int getBra_id() {
        return bra_id;
    }

    public void setBra_id(int bra_id) {
        this.bra_id = bra_id;
    }

    public String getBra_name() {
        return bra_name;
    }

    public void setBra_name(String bra_name) {
        this.bra_name = bra_name;
    }

    public String getBra_city() {
        return bra_city;
    }

    public void setBra_city(String bra_city) {
        this.bra_city = bra_city;
    }

    // Example of how to use the Branch class
    public static void main(String[] args) {
        Branch branch = new Branch(1, "Branch A", "City X");
        System.out.println("Branch ID: " + branch.getBra_id());
        System.out.println("Branch Name: " + branch.getBra_name());
        System.out.println("Branch City: " + branch.getBra_city());
    }
}
