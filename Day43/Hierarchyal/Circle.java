package Day43.Hierarchyal;

public class Circle extends Shape {
    public Circle(double radius, double width, double length) {
        super( radius, width, length );
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", width=" + width +
                ", length=" + length +
                ", area="+getArea()+
                ", perimeter="+getPerimeter()+
                '}';
    }
}
