package animal.kingdom;

public class Animal {
    double weight;
    double height;
    String name;

    public Animal() {
    }

    public Animal(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    void walk() {
        System.out.println("Animal is walking");
    }

    void fight() {
        System.out.println("Animal is fighting");
    }
}
