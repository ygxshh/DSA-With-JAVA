package SortingAlgorithims;
import java.util.*;

public class QuickSort2 {
    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (i < high && arr.get(i) <= pivot) {
                i++;
            }
            while (arr.get(j) > pivot) {
                j--;
            }
            if (i < j) {
                // Swap elements
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Place pivot in correct position
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j; // Return the pivot index
    }

    // Recursive Quick Sort method
    public static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1); // Sort left part
            qs(arr, pIndex + 1, high); // Sort right part
        }
    }

    // Public method to call quickSort
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void main(String[] args) {
        // Create a mutable ArrayList
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));
        int n = arr.size();
        arr = QuickSort2.quickSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}

