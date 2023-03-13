package MidtermReview.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Pick a key
        int key = 8;

        // Starter array
        int[] arr = {1,3,5,7,8,10};

        // Call the binary search function
        System.out.printf("Index of %d: %d", key, binarySearch(key, arr));
    }

    private static int binarySearch(int key, int[] arr) {
        int index = 0;

        // Make sure array is sorted
        Arrays.sort(arr);

        // Setup high and low values
        int low = arr[0];
        int high = arr[arr.length-1];

        // Find index of the key
        while(low <= high) {
            int mid = (low+high) / 2;
            if(key == arr[mid])
                return mid;
            else if(key > arr[mid])
                low = mid + 1; // Increment low
            else
                high = mid - 1; // Decrement high
        }
        return index;
    }
}
