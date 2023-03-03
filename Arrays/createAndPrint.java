package MidtermReview.Arrays;

public class createAndPrint {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //print the array
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //print the 2D array
        for (int i=0; i<array2D.length; i++) {
            for (int j=0; j<array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
