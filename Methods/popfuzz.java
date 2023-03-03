package MidtermReview.Methods;

public class popfuzz {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 25;
        int num3 = 30;
        int num4 = 7;
        
        System.out.println(popOrFuzz(num1));
        System.out.println(popOrFuzz(num2));
        System.out.println(popOrFuzz(num3));
        System.out.println(popOrFuzz(num4));
    }
    
    public static String popOrFuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "popfuzz";
        } else if (num % 3 == 0) {
            return "pop";
        } else if (num % 5 == 0) {
            return "fuzz";
        } else {
            return Integer.toString(num); // return the input number as string if not divisible by 3 or 5.
        }
    }
}
