package Day31.PrivateModifiers;

public class Person {
    private String name; ///********
    public int age;
// The code is only accessible within declared class
    @Override
    public String toString() {
        return "ClassWithPrivate{" +
                "name='" + name + '\'' +//U can see private from Same class
                '}';
    }
    // private Constructor
     private Person() {
        this.name = "Del"+"Amigo"; //we R saying to other classes don't Use this one but use any other constructor
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // private Method
    private int getAge(){
        return 20;
    }
}
