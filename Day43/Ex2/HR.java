package Day43.Ex2;

public class HR {
    public static void main(String[] args) {
        Employee employee = new Employee("Daulet", 100_000, 1);
        System.out.println(employee);


        SDET employee2 = new SDET("Behruz", 50_000, 2,5000);
        System.out.println(employee2);
       // employee.salary = 15000;
    }
}
