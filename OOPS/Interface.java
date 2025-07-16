interface Animal {
    int eys = 2;// cant be changes, its a fixed value now;

    public void walks();
}

class Horse implements Animal {
    public void walks() {
        System.out.println("Walks on 4 legs");
    }

}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walks();
    }
}
