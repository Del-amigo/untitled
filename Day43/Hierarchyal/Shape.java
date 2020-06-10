package Day43.Hierarchyal;

public class Shape {
    public double radius;
    public double width;
    public double length;

    public Shape(double radius, double width, double length) {
        this.radius = radius;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "radius=" + radius +
                ", width=" + width +
                ", length=" + length +
                ", area="+getArea()+
                ", perimeter="+getPerimeter()+
                '}';
    }

    public double getArea(){
    throw new RuntimeException("Not implemented");
    }
    public double getPerimeter(){
        throw new RuntimeException("Not implemented");
    }
}
