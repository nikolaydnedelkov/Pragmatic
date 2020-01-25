package school;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String textID;
    private List<Teacher> teachers = new ArrayList<>();

    public Class(String textID) {
        this.textID = textID;
    }


    void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Class{" +
                "textID='" + textID + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
