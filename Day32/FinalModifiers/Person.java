package Day32.FinalModifiers;

public class Person {
    public String name;
    public final int fingerprint;

    public Person(String name, int fingerprint) {
        this.name = name;
        this.fingerprint = fingerprint;
    }
}
