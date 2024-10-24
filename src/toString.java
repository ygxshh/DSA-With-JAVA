import java.util.Arrays;
import java.util.Scanner;

public class toString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Use Arrays.toString() to print the array
        System.out.println(Arrays.toString(arr));
    }
}
