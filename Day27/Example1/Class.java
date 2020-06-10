package Day27.Example1;

public class Class {
    String subject;
    Student student;
    Teacher classTeacher;

    public String toString(){
        return "Subject of the class:" + subject+
        "\nName: "+ student.name+
        "\nAge:" + student.age+
        "\nMajor: "+ student.major+
        "\nAverage grade: "+ student.avarageGrade()+
        "\nName of the teacher: "+classTeacher.name+
        "\nDegree of Dos: "+classTeacher.name +":"+ classTeacher.BADegree+
        "\nThe teacher is : "+classTeacher.howGoodIsTeacher();
    }
}
