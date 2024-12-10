package Leetcode;
import java.sql.SQLOutput;
import java.util.*;

public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distance = new int[4];
        System.out.print("distance [] = ");
        for (int i = 0; i < 4; i++) {
            distance[i]= sc.nextInt();
        }
        System.out.print("Start = ");
        int start = sc.nextInt();
        System.out.print("Destination = ");
        int destination = sc.nextInt();

        int a = 0, b = 0;
        for(int i=0;i<distance.length;i++){
            if((i>=Math.min(start,destination)) && (i<Math.max(start,destination))){
                a+=distance[i];
            }else{
                b+=distance[i];
            }
        }

        System.out.print("Output = " + Math.min(a,b));
    }
}
