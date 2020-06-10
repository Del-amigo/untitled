package Day43.Hierarchyal;

public class Square extends Rectangle {

    public Square(double radius, double width, double length, int angle) {
        super( radius, width, length, angle );
    }

    @Override
    public String toString() {
        return "Square{" +
                "angle=" + angle +
                ", radius=" + radius +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
