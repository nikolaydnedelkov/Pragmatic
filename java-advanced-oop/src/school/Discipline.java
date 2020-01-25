package school;

public class Discipline {
    private String name;
    private int numberOfLessons;
    private int numberOfExcersise;

    public Discipline(String name, int numberOfLessons, int numberOfExcersise) {
        this.name = name;
        this.numberOfLessons = numberOfLessons;
        this.numberOfExcersise = numberOfExcersise;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", numberOfLessons=" + numberOfLessons +
                ", numberOfExcersise=" + numberOfExcersise +
                '}';
    }
}
