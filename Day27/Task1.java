package Day27;

import java.util.ArrayList;

class Student{  //our own referense type*
    String name;  //fields
    double grade;
}
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(printThem("Haytali", 55));
        students.add( printThem("Qishkorbek", 71.10));
        students.add(printThem("BehruzJane", 100));
        System.out.println(average(students));

    }
    public static Student printThem (String str, double nums){
        Student student = new Student();
        System.out.println( student.name = str);
        System.out.println( student.grade = nums);
        return student;
    }

    public static double average (ArrayList<Student> students){
    double sum = 0;
        for (Student student : students) {
            sum+=student.grade;
        }
        return sum/students.size();
    }

}


