class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.print(this.name);
        System.out.println(this.age);
    }
}

public class oop2 {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.name = "Yogesh ";
        s1.age = 20;

        s2.name = "Ankit ";
        s2.age = 60;

        s1.printInfo();
        s2.printInfo();
    }
}
