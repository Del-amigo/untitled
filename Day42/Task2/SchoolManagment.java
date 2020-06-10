package Day42.Task2;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagment {
    public static void main(String[] args) {
         School school1 = new School(getStudents(),16977.86,"Techno",
                 "Getty 600","+1 267 266 70-70",50);
        System.out.println(school1);

         School school2 = new School( getStudents(),8977345.11, "TTEL",
                 "14-Chashmassor","+1 11465487844",5 );
        System.out.println(school2);
    }

    public static List<Student>getStudents(){
        List<Student> students = new ArrayList<>();
        students.add( new Student( "Behruz", "Jumaev", 5458814L ) );
        students.add( new Student( "Furkat", "Ali", 68418488 ) );
        students.add( new Student( "Machel", "Jordan", 6484854815L ) );
        return students;
    }
}
