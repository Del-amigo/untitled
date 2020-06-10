package Day43.Hierarchyal;

public class GeometryApp {
    public static void main(String[] args) {
       // Square square = new Square( 15D,16,16,4 );
      //  System.out.println(square);

        Shape circle = new Circle(3,18,30);
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeter: "+ circle.getPerimeter());
    }
}
