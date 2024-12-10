import java.util.Scanner;

public class Number2word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String word = convertNumberToWord(number);
        System.out.println(word);
    }

    public static String convertNumberToWord(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            default:
                return "number not supported";
        }
    }

}
