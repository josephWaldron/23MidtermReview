package MidtermReview.Arrays;

public class arraySum {
    public static void main(String[] args) {
        //create an array of 10 integers
        //and print the sum of the array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(array));
    }
    public static int sum(int[] a) {
        int total = 0;
        for (int i=0; i<a.length; i++) {
            total += a[i];
        }
        return total;
    }
}
