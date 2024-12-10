package OOPsPillar;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking");
    }
}

class Bike extends Vehicle {
    void ringBell() {
        System.out.println("Bike is ringing the bell");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Inherited from Vehicle class
        car.honk();   // Specific to Car class

        Bike bike = new Bike();
        bike.start();  // Inherited from Vehicle class
        bike.ringBell();  // Specific to Bike class
    }
}
