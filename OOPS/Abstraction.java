abstract class Animal {
    public void walks() {

    }
}

class Horse extends Animal {
    public void walks() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walks() {
        System.out.println("Has 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walks();
    }
}
