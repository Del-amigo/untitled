package Day27.Example;

public class Ex1 {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Bexa";
          // 1st way*
        student.school = new School();
        student.school.name = "Techno Study";
        student.school.adress = "Getty 600";
        student.school.phone = "267-266"+"7070";
        student.school.tuitionFee = 600;
    }
}
