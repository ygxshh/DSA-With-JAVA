import java.util.*;

public class RotationArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.println("Enter array length:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k (number of rotations)
        System.out.println("Enter number of rotations:");
        int k = sc.nextInt();

        // Rotate the array
        RotationArray rotation = new RotationArray();
        rotation.rotateArray(arr, k);

        // Output the rotated array
        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    // Main method to rotate the array
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length; // In case k is greater than the length of the array
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    // Helper method to reverse part of the array
    public void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

