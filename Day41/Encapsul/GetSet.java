package Day41.Encapsul;

public class GetSet {
    /*      Getter method:
    it's a method with return type other than void, that will return values of different attributes
    and this method(Getters*) (9 times out of 10) they will not have any parameters.
     */
    /*       Setter method:
    it's a method with return type void that will set the attribute based on the argument we pass in.
    (9 times out of 10) they will have at least one parameters.
     */
    /*
     If we wish to make the variables as read-only then we have to omit the setter methods like
setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have
to omit the get methods like getName(), getAge() etc. from the above program

     */

    private String breed;
    private String name;
    private int age;

    public GetSet(String breed, String name, int age) {
        this.setBreed( breed );
        this.setName( name );
        this.setAge( age );
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "GetSet" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge();
    }
}
