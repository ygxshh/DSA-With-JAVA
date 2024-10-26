public class String4 { // operators
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println('z'-'a');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char) ('a' + 3));

        System.out.println("a"+1); // integer will be converted to integer that will call toString()
        // this is same as after a few Steps: "a" + 1

        // + -> used for primitives and any one side should be of type String
    }
}
