package OOPsPillar;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion roars");
    }
}

class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Elephant trumpets");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal myLion = new Lion();
        Animal myElephant = new Elephant();

        myLion.makeSound();  // Lion roars
        myElephant.makeSound();  // Elephant trumpets
    }
}
