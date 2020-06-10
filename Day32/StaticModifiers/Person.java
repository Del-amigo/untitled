package Day32.StaticModifiers;

public class Person {
    static String planetName;
    static int age;
    String name;

    public void print(){
        System.out.println("Name "+name);
        System.out.println("Planet "+planetName);
        System.out.println("Age "+age);
    }

    public static void main(String[] args) {
        Person.planetName = "Earth"; //and U can acces in it without object
        Person.age = 1999;

        Person person = new Person();
        person.name = "Behruz";
        person.print();

        Person person2 = new Person();
        person.name = "Jason";
        person.print();

        System.out.println("---------------");

        Person.age++;
   //     Person.planetName = "Mars";
        System.out.println("After expedition");
        person.print();
        person2.print();
    }

}


