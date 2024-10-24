class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.print(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class oop3 {
    public static void main() {
        Student s1 = new Student("Yogesh ", 20);
        Student s2 = new Student("Ankit ", 50);
        Student s3 = new Student("Golu ", 25);

        s1.PrintInfo();
        s2.PrintInfo();
        s3.PrintInfo();
    }
}
