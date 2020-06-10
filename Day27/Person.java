package Day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Person {  ///class
    int ID;  ////Attributes
    String name;
    String surname;
   String[] adress;


    public static void main(String[] args) {
        Person Behruz = new Person(); ///we created an object of class person
        Behruz.ID = 331050;
        Behruz.name = "Behruz";
        Behruz.surname = "Jumaev";
        Behruz.adress = new String[]{"10101 Northeast Avenue"};

        System.out.println();
    }
}
