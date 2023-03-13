package MidtermReview.Arrays;

import java.util.Random;

public class BinarySearchRandomArray {
    public static void main(String[] args) {
        // Make array
        int[] arr = new int[10];

        // Setup random object
        Random r = new Random();

        // Populate arr
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);

            // Print arr
            System.out.print(arr[i] + " ");
        }
    }
}
