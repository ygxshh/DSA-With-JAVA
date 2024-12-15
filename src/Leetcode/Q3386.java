package Leetcode;
import java.util.Scanner;

public class Q3386 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(buttonWithLongestTime(array));
    }

    public static int buttonWithLongestTime(int[][] events) {
        int maxT = events[0][1];
        int buttonIndex = events[0][0];

        for (int i = 1; i < events.length; i++) {
            int currentT = events[i][1] - events[i - 1][1];

            if (currentT > maxT || (currentT == maxT && events[i][0] < buttonIndex)) {
                maxT = currentT;
                buttonIndex = events[i][0];
            }
        }

        return buttonIndex;
    }
}

