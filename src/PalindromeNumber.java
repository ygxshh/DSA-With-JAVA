import java.util.*;

public class PalindromeNumber {
    static boolean isPalindrome(int n) {
        int x = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + lastDigit;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minimum value: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum value: ");
        int max = sc.nextInt();
        System.out.println("Palindrome numbers between " + min + " and " + max + ":");
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

