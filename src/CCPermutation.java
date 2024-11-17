import java.util.*;
import java.lang.*;
public class CCPermutation {
        public static void main(String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t--> 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                int m = n;
                for (int i = 0; i < n / 2; i++) {
                    arr[i] = m;
                    arr[n - i - 1] = m - 1;
                    m = m - 2;
                }
                if (n % 2 != 0) {
                    arr[n / 2] = 1;
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");

            }
    }
}
