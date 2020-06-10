package MentoringFromYusuf.Inheritance;

public class MainClass {

    /*
    --> Inheritance is one of the concepts/parts of OOP, tah helps to child class(subClass) to get the methods from the
    parent class. And it also known as parent-child relationship*

    --> Why we need that?!
     for method overriding.
     for code reusability.

     --> Types of Inheritance : Single(Class B extends from Class A)
                               Multilevel(Class C extend from Class B and B extends from A)  (C->B->A)
                              Hierarchical(Class B extends from Class A and Class C also extends from Class A)
                                                                  ( Class C-> Class A <-Class B )


       ** we use Extends at public clases && Implements at interface or abstract classes **
     */

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.getAJob( "Bex Company" );
        childClass.studyInUniversity( "DDKT" );
        System.out.println("-----------------------------------------");
        GrandChildClass grandChildClass = new GrandChildClass();
        grandChildClass.getAJob( "SomeWhere" );
        grandChildClass.studyInUniversity( "EcOnOmY" );
    }
}
