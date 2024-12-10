package StriverSheet;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);


        return last+slast;
    }
}

