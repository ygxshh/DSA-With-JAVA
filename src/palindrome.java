import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            System.out.println("Palindrome");
        }
        int rev = 0;
        int original = x;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        System.out.println((x == rev || x == rev / 10));
        sc.close();
    }
}