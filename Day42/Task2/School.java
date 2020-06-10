package Day42.Task2;

import java.util.ArrayList;
import java.util.List;

public class School {


private String name;
private String address;
private String phoneNumber;
private List<Student> students;
private double budget;
private int schoolSize;

    public School(List<Student> students, double budget, String name, String address, String phoneNumber, int schoolSize) {
        this.students = students;
        this.budget = budget;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.schoolSize = schoolSize;
    }

    public School(String name, String address, String phoneNumber, double budget, int schoolSize) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
        this.schoolSize = schoolSize;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getLessons() {
        return name;
    }

    public void setLessons(String lessons) {
        this.name = lessons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public void registerStudent(Student student){
        if (students.size() < getSchoolSize()) {
            students.add( student );
        }else {
            throw new RuntimeException("You exceed student limit, can't register more students!");
        }
    }
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", students=" + students +
                ", budget=" + budget +
                ", schoolSize=" + schoolSize +
                '}';
    }
}
