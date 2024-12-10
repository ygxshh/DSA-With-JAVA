package StriverSheet;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {9,2,5,6,7,8};
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println(second_large);
    }
}
