package school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Class> classes = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    void addClass(Class c) {
        classes.add(c);
    }


    void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                ", students=" + students +
                '}';
    }
}

