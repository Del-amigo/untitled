package Day43.ClasseZ;

public class Shoe {
    public final String brand;
    public final double size;

    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    public Shoe(String brand, double size) {
        this.brand = brand;
        this.size = size;


    }
}
