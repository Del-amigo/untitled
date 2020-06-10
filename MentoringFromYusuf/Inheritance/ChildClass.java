package MentoringFromYusuf.Inheritance;

public class ChildClass extends SuperClass {

    @Override
    public void studyInUniversity(String universityName) {
        super.studyInUniversity( universityName );
        System.out.println("I'm also get my master at this school");//Body
        // in OverRide we can NOT change:**
        // Method Name
        // Return type
        // Parameter count
        // parameter type
        //            But we Can change**
        // Especially we can change the body of method
        //
    }
}
