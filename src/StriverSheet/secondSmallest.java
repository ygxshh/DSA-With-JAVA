package StriverSheet;

public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = {9,2,5,6,7,8};
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        System.out.println(second_small);
    }
}
