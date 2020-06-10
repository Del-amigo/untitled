package Day32.FinalModifiers;

public class Registration {

    public void register(Person person){
        System.out.println(person.name);
        System.out.println(person.fingerprint);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        Person person1 = new Person( "Zlatan", 5658614 );
        registration.register( person1 );
    }
}
