class Students {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphysm {
    public static void main(String[] args) {
        Students newStd = new Students();
        newStd.name = "Utkarsh";
        newStd.age = 218;
        newStd.printInfo(newStd.name);
        newStd.printInfo(newStd.age);
        newStd.printInfo(newStd.name, newStd.age);

    }
}
