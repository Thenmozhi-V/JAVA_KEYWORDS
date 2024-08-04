class Animal {}

class Dog extends Animal {}

public class Instanceof {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        if (myDog instanceof Dog) {
            System.out.println("myDog is a Dog");
        }
    }
}
