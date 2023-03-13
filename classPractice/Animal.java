package MidtermReview.classPractice;

public class Animal {
    // Private Data Fields
    private String name;
    private int age;

    // Default Constructor
    public Animal() {
        this.name = "";
        this.age = 0;
    }

    // Overloaded Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Unique Method
}
