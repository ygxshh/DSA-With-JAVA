import java.util.*;
public class tryHash {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1, "Yogesh");
        map.put(2, "Sachin");
        map.put(3, "Akshita");
        map.put(4, "Sunidhi");
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Yogesh"));
        System.out.println(map.containsValue("Shubham"));

        Set<Integer> keys = map.keySet();
        for(int i:keys){ // we can directly do map.keySet(); here
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + ": " + entry.getValue() );
        }

    }
}
