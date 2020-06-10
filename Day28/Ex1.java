package Day28;

class Person{
    String name;
    int age;
    String surname;

    int getBirthYear(){
        return 2020-age;
    }
    String getInitials(){
        return name.charAt(0)+ " | "+ surname.charAt(0);
    }
}

public class Ex1 {

    public static void main(String[] args) {
    Person per = new Person();
    per.name = "JonSon";
    per.surname = "Baby";
    per.age = 27;
        System.out.println(per.getInitials());
        System.out.println(per.getBirthYear());
    }

}
