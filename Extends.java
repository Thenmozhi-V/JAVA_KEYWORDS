class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Extends {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
