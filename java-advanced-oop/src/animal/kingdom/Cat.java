package animal.kingdom;

public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void fight() {
        System.out.println("Cat is fighting");
    }

    @Override
    void run() {
        System.out.println("Cat is running");
    }
}
