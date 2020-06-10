package HomeworksRepl.Encapsulation;

import java.util.Scanner;

public class Encapsul1 {
    /*
    There are two classes one Main other one Student class.
In the student class
Create variables private String name and int age
Create a getter and setter methods.
In the Main class.
While calling the setter methods use studentName ( in line 6 ) and studentAge ( in line 8 )
Example:
Age = 12
Name = Steven
Student name is Steven.
Steven is 12 years old.
Note while printing use a  toString method in the Student Class.
     */
}
class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
        int studentAge = scan.nextInt();
        // DO NOT CHANGE THE CODE BEFORE THIS LINE.
   Student student = new Student();
   student.setName( studentName );
   student.setAge( studentAge );
        System.out.println("Student name is "+ student.getName());
        System.out.println(student.getName()+" is "+student.getAge()+" years old.");
    }
}
class Student{
private String name;
private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student-" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}

