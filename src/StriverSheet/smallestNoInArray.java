package StriverSheet;

public class smallestNoInArray {
    public static void main(String[] args) {
        int[] arr = {23234,32453,2563,6784,24565,2455};

        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
