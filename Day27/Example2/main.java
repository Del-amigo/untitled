package Day27.Example2;

import java.util.*;

public class main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        Employee numberOne = creatNewEmpl("Behruz", "Jumaev",
                3365871, "asasd1658!");

        Employee numberTwo = creatNewEmpl("Furkat","Ali",
              1575158,"ALI3345!");

        Employee numberThree=creatNewEmpl("Haydar","Barotov",
                75158,"ALI3345!");

        Employee numberFour = creatNewEmpl("Hassan","Barotov",
                157534158,"Hass3345!");

        Employee numberFive = creatNewEmpl("Firuz","Jum'a",
                115751058,"ALI345!");

         ArrayList<Employee>list = new ArrayList<>();
         Collections.addAll(list,numberOne,numberTwo,numberThree,numberFour,numberFive);
            System.out.println("Please give an ID number: ");
             int idNum = scanner.nextInt();
             for (int i = 0; i < list.size(); i++) {
            if(list.get(i).IDNumber==idNum){
                System.out.println(list.get(i).firstName+" "+list.get(i).lastName+" "+list.get(i).password);
            }
        }


    }
    public static Employee creatNewEmpl(String firstName, String lastname, int IDNumber, String password){
        Employee employee = new Employee();
        employee.firstName  = firstName;
        employee.lastName = lastname;
        employee.IDNumber = IDNumber;
        employee.password = password;
        return employee;
    }

    public static void printEmployee(Employee employee){
        System.out.print(employee.firstName+" \\ ");
        System.out.print(employee.lastName+" \\ ");
        System.out.print(employee.IDNumber+" \\ ");
        System.out.print(employee.password+" \\ ");
        System.out.print("\n");
    }
}
