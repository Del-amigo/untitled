package MentoringFromYusuf.Inheritance;

public class GrandChildClass extends SuperClass {

    @Override
    public void getAJob(String companyName) {
        super.getAJob( companyName );

        System.out.println("I'm working here for a year");
    }
}
