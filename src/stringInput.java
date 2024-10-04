import java.util.*;
public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.next();
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray[0]);
    }
}
