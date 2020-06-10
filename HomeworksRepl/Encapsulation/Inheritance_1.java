package HomeworksRepl.Encapsulation;

import java.util.Scanner;

public class Inheritance_1 {
    /*
    Create a toString method which is printing all the instance variables
For example;
Name is Emily
Salary is 60000
department is Seller
underemployed is 5

Your result should be
Name = Emily
Salary = 60000
Department = Seller
Underemployed = 5

Given class Worker (Child class)

Create a instance variable private
int hourlyIncome

add hourlyIncome to Constructor
multiply hourlyIncome with 2080 (Calculating the yearly income)
yearly income should be between 50000 to 120000

Create a toString method which is printing all the instance variables

For example:
Name is Steven
department is IT
hourlyIncome is 45

Your result should be
Name = Emily
Department = IT
Hourly income = 93600
     */
    class Main {

        Scanner dp = new Scanner(System.in);

        String ManagerName = dp.nextLine();
        String ManagerDepartment = dp.nextLine();
        int ManagerNumberOfEmployee = dp.nextInt();

        int ManagerSalary = dp.nextInt();

        String workerName = dp.nextLine();
        String workerDepartment = dp.nextLine();
        int workerHourlyIncome= dp.nextInt();
        // dont change the code before this line



    }

    class Employee {
protected String name;
protected int salary;
protected String department;

        public Employee(String name, int salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            try {
                if (salary <=50000 || salary>=120000)
                this.salary = salary;
            }catch (Exception exception){
                System.out.println(exception.getMessage());
                System.out.println("Salary should be between 50000 to 120000");
            }
        }
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }

    class Manager extends Employee  {
private int underemployed;


        public Manager(String name, int salary, String department, int underemployed) {
            super( name, salary, department );
            this.underemployed = underemployed;
        }

        public String toString() {
            return "Manager{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    ", underemployed=" + underemployed +
                    '}';
        }
    }


    class Worker extends Employee   {
        private int hourlyIncome;

        public Worker(String name, int salary, String department, int hourlyIncome) {
            super( name, salary, department );
            this.hourlyIncome = hourlyIncome;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    ", hourlyIncome=" + hourlyIncome +
                    '}';
        }
    }
}
