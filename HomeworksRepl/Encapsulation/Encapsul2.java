package HomeworksRepl.Encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Encapsul2 {
    /*
    There are two classes one Main other one Employees
In the Employees class
Create variables private String name , int salary , String dob  (date of birth )
Create a getter and setter
In the Main class.
Example:
Name is Fernando
Salary is 80000
dob is 11/23/2000

Note:  Format of the dob is MM/dd/yyyy format never change
Note: Create one method which is ageCalculator current year - dob year = employee age
In the main method
While setting the name use variable String name.
Same for salary and dob .
If the employee is older then 18 years old
Print Welcome to our company Fernando your salary is 80000.
If  Fernando younger then 18 years old
Print come back when you are 18 years old.
If Fernando 18 years old
Print we can have inter with you after that you can have a 80000 salary
     */
}
class Employees {
    private String name;
    private int salary = 0;
    private String dob;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public String getDob() {
        return dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
            this.salary = salary;
        }
    public void setDob(String dob) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dob12 = LocalDate.parse(dob,format);
        LocalDate today = LocalDate.now();
       int age = today.getYear()-dob12.getYear();
        try {
            if (age > 18) {
                System.out.println( "Welcome to our company " + getName() + " your salary is " + getSalary());
            } else if (age < 18) {
                System.out.println( "Come back when you are 18 years old." );
            } else {
                System.out.println( "we can have inter with you after that you can have a " + salary + " salary" );
            }
            this.dob = dob;
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException.getMessage());
            System.out.println("Please, provide correctly");
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String dop = scan.nextLine();
        int salary = scan.nextInt();

//  DONT CHANGE THE CODE BEFORE THIS LINE AND USE THESE VARIABLES WHILE SETTING THE SETTER IN EMPLOYEES CLASS
    Employees employees = new Employees();
    employees.setName( name );
    employees.setSalary( salary );
        employees.setDob( dop );
    }
}
