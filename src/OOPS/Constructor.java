package OOPS;

public class Constructor{
    public static void main(String[] args) {
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Yogesh", 21); // Parameterized constructor

        student1.display();
        student2.display();
    }
}
    class Student {
        String name;
        int age;

        // Default constructor
        Student() {
            name = "Unknown";
            age = 0;
        }

        // Parameterized constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }




