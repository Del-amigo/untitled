package Day43.Hierarchyal;

public class Rectangle extends Shape {
    public final int angle;

    public Rectangle(double radius, double width, double length, int angle) {
        super( radius, width, length);
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "angle=" + angle +
                ", radius=" + radius +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
