package Day43.Tasks;

public class Parent {
    protected final String lastname;
    protected final boolean shapeOfNose;

    public Parent(String lastname, boolean shapeOfNose) {
        this.lastname = lastname;
        this.shapeOfNose = shapeOfNose;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "lastname='" + lastname + '\'' +
                ", shapeOfNose=" + shapeOfNose +
                '}';
    }
}
