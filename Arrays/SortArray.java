package MidtermReview.Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Make array
        int[] arr = {7, 4, 2, 1, 7, 9, 1};
        System.out.println(Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
