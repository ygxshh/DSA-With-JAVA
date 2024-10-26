public class String1 {
    public static void main(String[] args) {

        String a = "Yogesh";
        String b = "Yogesh";
        System.out.println(a==b); // here in b it doesn't create a new "Kunal" and points to the same created by a so it will give true

        String name1 = new String("YogeshMishra");
        String name2 = new String("YogeshMishra");

        System.out.println(name1 == name2); // will give false
        System.out.println(name1.equals(name2)); // will give true because it checks the values and doesn't care whether it is pointing to same object or not

        System.out.println(name1.charAt(6));
    }
}
