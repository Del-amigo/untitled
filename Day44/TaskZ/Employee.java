package Day44.TaskZ;

import com.sun.security.jgss.GSSUtil;

public class Employee extends Person {
    private School school;
    private double salary;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee->" +
            //    "school=" + school +
                ", name="+ getName()+
                ", address="+ getAddress()+
                ", salary=" + salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName( "Maxy" );
        employee.setAddress( "Lower st. 15" );
        employee.setSalary( 60_000 );
        System.out.println(employee);
    }
}
