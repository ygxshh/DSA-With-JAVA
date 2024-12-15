package Leetcode;

import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] arr, int val) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != val) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeElement(arr, val));
    }
}
