package Day44.Static_inherit;

public class App {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("From A "+ A.age);


        B b = new B();
        System.out.println("From B "+ B.age);

        System.out.println("From A "+ A.age);
        //Static remembers last value
    }

}
