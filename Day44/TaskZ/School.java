package Day44.TaskZ;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private  int maxStudents;
    private List<Student> students = new ArrayList<>();
    private List<Employee>employees = new ArrayList<>();

   public List<Student> registerStudent(Student student){
       if (students.size()>= maxStudents){
           throw new RuntimeException("Student's size exceed expectation!!!");
       }
       students.add( student );
       return new ArrayList<>(students);
    }
    public  List<Employee> registerEmployee(Employee employee){
       employees.add( employee );
       return employees;
    }

}
