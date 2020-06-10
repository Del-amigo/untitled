package Day31.Task1;

public class Student {
    private String name;
    private  int age;


    private Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void updateName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student-->" +
                "name='" + name + '\'' +
                ", age=" + age;
    }

}
