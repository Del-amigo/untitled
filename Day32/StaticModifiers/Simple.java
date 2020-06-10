package Day32.StaticModifiers;

public class Simple {
    //class member/bariable/filed
    static int a;
    int b;

    void increase(){
        a++;
        b++;

    }

    @Override
    public String toString() {
        return "Simple{" +
                "b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
       simple.increase();

        Simple simple1 = new Simple();//like Alice Bookstore's story///static changes
        simple.increase();
    }
}
