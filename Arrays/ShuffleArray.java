package MidtermReview.Arrays;

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Make array
        int[] arr = {1,3,5,7,9};

        // Make Random obj
        Random r = new Random();

        // Shuffle contents of arr
        for(int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;

            // Print arr
            System.out.print(arr[i] + " ");
        }
    }
}
