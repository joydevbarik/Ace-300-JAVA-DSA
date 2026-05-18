public class Main {

    public static void main(String[] args) {

        Bird parrot = new Bird();

        parrot.color = "Green";
        parrot.fly();

        System.out.println("Bird Color: " + parrot.color);
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("Animal is Eating...");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("Bird is Flying...");
    }
}