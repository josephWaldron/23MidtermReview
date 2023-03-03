package MidtermReview.classPractice;

public class testHouse {
    public static void main(String[] args) {
        House h1 = new House();
        System.out.println("h1 toString: " + h1.toString());
        House h2 = new House("123 Main St", 3, 2.5, true);
        System.out.println("h2 toString: " + h2.toString());
        h1.setAddress("456 Main St");
        h1.setBedrooms(4);
        h1.setBathrooms(3.5);
        System.out.println("h1 toString: " + h1.toString());
        House h3 = new House(h1);
        System.out.println("h3 toString: " + h3.toString());
    }
    
}
