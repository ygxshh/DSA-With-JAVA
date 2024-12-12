package Leetcode;
import java.util.*;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else if (result > 0) {
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Length of last word: " + lengthOfLastWord(s));
    }
}

