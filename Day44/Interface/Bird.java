package Day44.Interface;

public class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Chick-chirik");
    }

    @Override
    public void eat() {
        System.out.println("Eats a warn");
    }
}
