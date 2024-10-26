import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();


        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);



/*      list.add(23);
        list.add(45);
        list.add(267);

        System.out.println(list.contains(45));
        System.out.println(list.set(0, 99));
        System.out.println(list.remove(2));
*/
    }
}
