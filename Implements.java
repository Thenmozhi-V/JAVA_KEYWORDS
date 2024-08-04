interface AnimalActions {
    void sound();
}

class Cat implements AnimalActions {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Implements {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
