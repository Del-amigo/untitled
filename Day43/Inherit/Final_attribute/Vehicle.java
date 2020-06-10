package Day43.Inherit.Final_attribute;

public class Vehicle {
    public final String model= "The best Vehicle ever!!!";

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
