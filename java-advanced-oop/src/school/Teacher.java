package school;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Discipline> disciplines = new ArrayList<>();

    void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "disciplines=" + disciplines +
                '}';
    }

}