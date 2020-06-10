package Day27.Example1;

public class main {
    public static void main(String[] args) {
        Class tsClass = new Class();
        tsClass.classTeacher = new Teacher();
        tsClass.student = new Student();

        tsClass.subject = "Java";

        tsClass.classTeacher.name = "Dos";
        tsClass.classTeacher.BADegree = "Computer Science";
        tsClass.classTeacher.yearOfExperience = 15;

        tsClass.student.name = "Behruz";
        tsClass.student.age = 24;
        tsClass.student.major = "Computer Science";
        tsClass.student.firstExamGrade = 81;
        tsClass.student.secondExamGrade = 70;
        tsClass.student.thirdExamGrade = 93;

        System.out.println(tsClass);
    }
}
