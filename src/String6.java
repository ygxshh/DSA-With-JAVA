import java.util.*;

public class String6 { //methods
    public static void main(String[] args) {
        String name = "Yogesh Mishra";

//        System.out.println(Arrays.toString(name.toCharArray())); // Original char array
//
//        System.out.println(Arrays.toString(name.toLowerCase().toCharArray())); // Lowercase char array
//        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }

}

