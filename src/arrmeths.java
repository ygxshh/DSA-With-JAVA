import java.util.*;

public class arrmeths {
    public static void main() {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
