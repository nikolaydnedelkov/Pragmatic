package animal.kingdom;

public class AnimalKingdom {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.fight();
        cat.run();

        Eagle eagle = new Eagle(10,15,"BaldEagle",true,15);
        eagle.fly();
        eagle.run();
    }
}
