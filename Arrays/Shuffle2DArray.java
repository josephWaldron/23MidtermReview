package MidtermReview.Arrays;

import java.util.Random;

public class Shuffle2DArray {
    public static void main(String[] args) {
        // Make array
        int[][] arr = {{1,3,5,7,9},
                        {4,3,1,0,1}};

        // Make Random obj
        Random r = new Random();

        // Shuffle contents of arr
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                int randomRow = r.nextInt(arr.length);
                int randomCol = r.nextInt(arr.length);
                int temp = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = arr[i][j];
                arr[i][j] = temp;

                // Print arr
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}



