package Day31.PublicModifiers.Same;

public class SerachEngine {
    public String name;

    public SerachEngine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SerachEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
