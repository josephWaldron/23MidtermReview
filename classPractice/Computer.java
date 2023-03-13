package MidtermReview.classPractice;

public class Computer {
    // Private Data Fields
    private String model;
    private double price;

    // Default Constructor
    public Computer() {
        this.model = "";
        this.price = 0.0;
    }

    // Overloaded Constructor
    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Setters and Getters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Unique Method
}
