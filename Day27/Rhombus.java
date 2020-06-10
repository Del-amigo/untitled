package Day27;

public class Rhombus {
    int diagonal1; //According to the above program, the Rhombus class has two attributes
                   // that are diagonal1 and diagonal2.
    int diagonal2;

    public Rhombus(int a, int b){
        diagonal1 = a;
        diagonal2 = b;
    }

    public  double calArea(){
        return ((diagonal1*diagonal2) /2);
    }

    public static void main(String[] args) {
        Rhombus r1 = new Rhombus(5,4);
        System.out.println("Area: "+r1.calArea());
    }
}
