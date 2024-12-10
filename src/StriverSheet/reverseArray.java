package StriverSheet;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {9,2,5,6,7,8};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

            System.out.println(Arrays.toString(arr));
        }

        /*// Collection Method
        Integer[] arr = {9,2,5,6,7,8};
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);*/
    }
}
