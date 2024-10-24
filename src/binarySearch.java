import java.util.Scanner;

public static void main() {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();
    int start = 0;
    int end = arr.length - 1;
    int result = -1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == k) {
            result = mid;
            break;
        }
        if (arr[mid] < k) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    if (result != -1) {
        System.out.println(result);
    } else {
        System.out.println(k);
    }

    sc.close();
}

