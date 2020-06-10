package Day44.TaskZ;

public class School_Managment {
    public static void main(String[] args) {
        School school = new School();
        school.registerStudent( new Student() );
        school.registerStudent( new Student() );

        school.registerEmployee( new Employee() );
        school.registerEmployee( new Employee() );
        school.registerEmployee( new Employee() );
    }
}
