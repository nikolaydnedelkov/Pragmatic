package animal.kingdom;

public class Eagle extends Animal {
    boolean isBald;
    int age;

    public Eagle() {

    }

    @Override
    void run() {
        System.out.println("Eagle is not running, Eagle is flying");
    }

    public Eagle(boolean isBald, int age) {
        this.isBald = isBald;
        this.age = age;
    }

    public Eagle(double weight, double height, String name, boolean isBald, int age) {
        super(weight, height, name);
        this.isBald = isBald;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    void fly() {
        System.out.println("Eagle is flying");
    }
}
