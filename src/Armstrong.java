import java.util.*;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num; //
        while(n > 0){ //
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, k);
            n = n / 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 153
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
