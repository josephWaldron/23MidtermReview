package MidtermReview.Arrays;

import java.util.Random;

public class Random2DArray {
    public static void main(String[] args) {
        // Make array
        int[][] arr = new int[5][5];

        // Setup random object
        Random r = new Random();

        // Populate arr
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = r.nextInt(10);

                // Print arr
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
