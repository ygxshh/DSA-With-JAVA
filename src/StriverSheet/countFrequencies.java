package StriverSheet;
import java.util.*;

public class countFrequencies {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 6, 7, 8, 5, 6, 7, 3, 2, 2, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
