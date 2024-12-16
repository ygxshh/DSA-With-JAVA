package GFG160DAY;
import java.util.*;

public class secondLargest {
    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Array must have at least one element.");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getSecondLargest(arr));

        /*
        secondLargest solution = new secondLargest();
        System.out.println(solution.getSecondLargest(arr));
        int result = solution.getSecondLargest(arr);

        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + result);
        }*/
    }
}
