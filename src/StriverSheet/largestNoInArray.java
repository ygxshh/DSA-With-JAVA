package StriverSheet;

import java.util.Scanner;

public class largestNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5535,3478,4325,9653,2467,4674};
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i <=x; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
