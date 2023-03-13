package MidtermReview.classPractice;

public class Student {
    // Private Data Fields
    private String firstName, lastName;
    private double gpa;
    private int graduationYear;

    // Default Constructor
    public Student() {
        this.firstName = "";
        this.lastName = "";
    }

    // Overloaded Constructor
    public Student(String firstName, String lastName, double gpa, int graduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Class Method
    public String generateGmail() {
        String email = this.firstName.charAt(0) + this.lastName + "@gmail.com";
        email = email.toLowerCase(); // Make all letters lowercase
        return email;
    }

    // Main method
    public static void main(String[] args) {
        // Create student
        Student myStudent = new Student("Jeff", "Adams", 3.4, 2023);

        // Generate email
        String myEmail = myStudent.generateGmail();
        System.out.printf("Email: %s", myEmail);
    }
}
