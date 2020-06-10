package Day30;

class  Student{
    String firstName;
    String lastName;
    double examResult;

    //Constructors R special method which creates an object of class**
    // and there is no any parametres its's called as defoult constructor
    // with parametres is caller overloaded**


    public Student(String firstName, String lastName, double examResult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examResult = examResult;
    }

    public Student() {
        firstName = "Leila";
        lastName = "SSS";
        examResult = 88.60;
    }
}

public class JavaConstructors {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", "Becky", 78.78);
//        student1.firstName = "Rafet";
//        student1.lastName = "El-Roman";
//        student1.examResult = 90.50;


        Student student2 = new Student();
        System.out.println(student1.firstName);
        System.out.println(student2.firstName);

    }

    public static Student creatAStudent(String fname, String lName, double exResult){
        Student student = new Student();
        student.firstName = fname;
        student.lastName = lName;
        student.examResult = exResult;
        return student;
    }
    public static void printAStudent(Student student){
        System.out.print(student.firstName+ " ");
        System.out.print(student.lastName+" ");
        System.out.print(student.examResult+" ");
        System.out.println();;
    }
}
