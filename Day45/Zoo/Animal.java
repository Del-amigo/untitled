package Day45.Zoo;

import org.w3c.dom.ls.LSOutput;

import static java.awt.Color.RED;

public class Animal {
    public String name;
    private String color;
    private int age;
    private Gender gender;

    public Animal(String name, String color, int age, Gender gender) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        speak();
        eat();
    }

    public String speak() {

        return null;
    }
    public String eat(){
        System.out.println("");
      return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return  "name='" + name+
                "\ncolor='" + color+
                "\nage=" + age +
                "\nSpeak='" + speak()+
                "\neat=" + eat() +
                "\ngender=" + gender;
    }

    public static void main(String[] args) {

    }
}

