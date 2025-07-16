class car {
    String colr;
    String model;

    public void caring() {
        System.out.println("Car is caring");
    }

    public void printModel() {
        System.out.println(this.model);
    }
}

class Students {
    String name;
    int rollno;

    public void pinfo() {
        System.out.println(this.name);
        System.out.println(this.rollno);
    }
}

class sName {
    String name;
    int age;

    sName(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class objectAndClass {
    public static void main(String[] args) {
        car newCar = new car();
        newCar.colr = "black";
        newCar.model = "verna";
        newCar.caring();
        newCar.printModel();

        Students newStd = new Students();
        newStd.name = "Utkarsh";
        newStd.rollno = 218;
        newStd.pinfo();

        sName newSName = new sName("Utkarsh", 21);
    }
}
