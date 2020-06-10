package Day43.Ex2;

public class Employee {
    private String name;
    private double salary;
    private double coef;

    public Employee(String name, double salary, double coef) {
        this.name = name;
        this.salary = salary;
        this.coef = coef;
    }

    public double calculateSalary(){
        return (this.salary*this.coef);
    }

    public String toString() {
        return this.name + ": $" + this.calculateSalary();
    }
}
