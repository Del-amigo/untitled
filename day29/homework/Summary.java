package day29.homework;

public class Summary {

    //Static Keyword can be used for cariables, methods, blocks an nested classes

    //Static Variables***
    public static int num = 0;

    //static method:
    static String printinfo() {
        return "My counter is: " + num;
    }

    // static blocks****
    static {
        printinfo();
    }
   //**********rule number One Everithing under static has to be static****

    static String myStaticString = "Hi"; /////variables(Static**
    String nonStatic = "Hello";

    public static void staticMethod() { }
    public void nonStaticMethod() {
        hourCountInYear();
    }

    //Access modifiers(public, private...)+non static modifiers(static)+retirn type(Boolean, void...)+name+(parametres and name){}

    static String staticsAndNonStatics(){
        staticMethod();
        return myStaticString;
        //U can not call non static methods as same like static
    }

    public static void main(String[] args) {
        staticMethod();
        //****** nonStaticMethod() ****
        System.out.println(myStaticString);
        System.out.println(hourCountInYear());
    }

    /// Rule number 2: To call s static / methodfrom another class, call it with the class name;

    public static int daysInAYear = 365;
    public static int hourCountInYear(){
        Summary summary = new Summary();
        System.out.println("We R calling non-static into static by creating an object!"+summary.nonStatic);
        return daysInAYear*24;
    }


}