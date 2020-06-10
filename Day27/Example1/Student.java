package Day27.Example1;

public class Student {

    String name;
    String major;
    int age;
    int firstExamGrade;
    int secondExamGrade;
    int thirdExamGrade;

    double avarageGrade(){
        return (firstExamGrade+secondExamGrade+thirdExamGrade)/3;
    }
}

