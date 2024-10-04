import java.util.*;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(arr));
    }
}
