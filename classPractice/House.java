package MidtermReview.classPractice;

public class House {
    private String address;
    private int bedrooms;
    private double bathrooms;
    private boolean connectedGarage;
    public static int numOfHouses;

    public House(){
        address = "";
        bedrooms = 0;
        bathrooms = 0;
        connectedGarage = false;
        numOfHouses++;
    }
    public House(House h){
        address = h.address;
        bedrooms = h.bedrooms;
        bathrooms = h.bathrooms;
        connectedGarage = h.connectedGarage;
        numOfHouses++;
    }
    public House(String address, int bedrooms, double bathrooms, boolean connectedGarage){
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.connectedGarage = connectedGarage;
        numOfHouses++;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public double getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }
    public boolean isConnectedGarage() {
        return connectedGarage;
    }
    public void setConnectedGarage(boolean connectedGarage) {
        this.connectedGarage = connectedGarage;
    }
    public static int getNumOfHouses() {
        return numOfHouses;
    }
    public String toString() {
        return "Address: " + address + "bedrooms: " + bedrooms + "bathrooms: " + bathrooms + "connectedGarage: " + connectedGarage;
    }
}
