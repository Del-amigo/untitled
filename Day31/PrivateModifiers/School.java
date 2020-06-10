package Day31.PrivateModifiers;

public class School {
    public static void main(String[] args) {
        Person withPrivate = new Person("Behruz", 27); //If U'll create Private Constructor, nobody won't create defoult
                                          // constructor, it's becouse puting restriction...ограничение**
       // withPrivate.name--U can't access to private
        withPrivate.age++; //becouse it is PUBLIC**

        withPrivate.toString();

      //  withPrivate.getAge(); U cannot use/ call private in different class
    }
}
