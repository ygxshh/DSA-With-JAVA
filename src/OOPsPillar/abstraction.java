package OOPsPillar;

abstract class Shape {
    abstract void draw();  // Abstract method

    void describe() {  // Regular method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();  // Drawing a circle
        circle.describe();  // This is a shape

        rectangle.draw();  // Drawing a rectangle
        rectangle.describe();  // This is a shape
    }
}
