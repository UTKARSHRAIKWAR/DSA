class shape {
    String color;
}

class Traingle extends shape {
// properties of shape is inherited in Triangle
}

public class Inheritance {
    public static void main(String[] args) {
        Traingle nT = new Traingle();
        nT.color = "red";
    }
}
