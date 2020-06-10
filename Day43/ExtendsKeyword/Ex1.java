package Day43.ExtendsKeyword;

public class Ex1 {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        superClass.name = "I'm Super";
        System.out.println(superClass);

        SubClass subClass = new SubClass();
        subClass.name = "Jeckie";
        System.out.println(subClass);
    }
}
