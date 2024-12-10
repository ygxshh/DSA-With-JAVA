package Leetcode;
import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n==1){
            System.out.println(1);
        }else if(n==2){
            System.out.println(2);
        }
        int n1=1;
        int n2=2;
        for(int i=3;i<=n;i++){
            sum = n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println(n2);
    }
}
