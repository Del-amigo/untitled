package Day44.Interface;

public class App {
    public static void main(String[] args) {
  Animal[] animals = {new Cow(), new Dog(), new Bird()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }

     /*   Bird bird = new Bird();
        bird.speack();

        Dog dog = new Dog();
        dog.speack();

        Animal MyCow = new Cow();
        MyCow.speack();        */
    }
}
