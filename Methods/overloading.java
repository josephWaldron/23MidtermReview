package MidtermReview.Methods;

public class overloading {
    public void addNumbers(int a, int b) { 
        System.out.println("Sum of two numbers: " + (a + b)); 
    } 
    
    public void addNumbers(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    
    public void addNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of " + numbers.length + " numbers: " + sum);
    }

}
