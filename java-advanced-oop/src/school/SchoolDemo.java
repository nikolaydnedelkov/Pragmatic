package school;

public class SchoolDemo {
    public static void main(String[] args) {
        Student pesho = new Student("Pesho", 22);
        Student niki = new Student("Nikolay", 21);
        Student stefan = new Student("Stefan", 24);

        Discipline maths = new Discipline("Maths",20,40);
        Discipline chemistry = new Discipline("Chemistry", 10, 20);

        Teacher ivanov = new Teacher();
        ivanov.addDiscipline(maths);
        ivanov.addDiscipline(chemistry);

        Class fouthGrade = new Class("fourthGradeID");
        fouthGrade.addTeacher(ivanov);

        School ivanVazov = new School();
        ivanVazov.addClass(fouthGrade);
        ivanVazov.addStudent(pesho);
        ivanVazov.addStudent(niki);
        ivanVazov.addStudent(stefan);

        System.out.println(ivanVazov.toString());
    }
}
