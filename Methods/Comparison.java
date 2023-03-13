package MidtermReview.Methods;

public class Comparison {
    public static void main(String[] args){
        int a = 5;
        int b = 5;

        // Check which number is larger
        compareNums(a, b);
    }

    public static void compareNums(int a, int b) {
        if(a > b) {
            System.out.printf("%d is greater than %d!", a, b);
        }
        else if(a < b) {
            System.out.printf("%d is greater than %d!", b, a);
        }
        else {
            System.out.printf("%d is equal to %d!", a, b);
        }
    }


}
