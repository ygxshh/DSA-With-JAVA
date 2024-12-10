package SortingAlgorithims;
import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop over the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element of unsorted part is the smallest
            int minIndex = i;

            // Find the actual smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update index of smallest element
                }
            }

            // Swap the found smallest element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
