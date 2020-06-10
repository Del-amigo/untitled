package MentoringFromYusuf.Overload_And_Override;

public class LoadVSRiding {
    /*
    *             Overloading
    * 1) is heppens in the One class
    * 2) we can change the return type, parametre type, parameter count
    * 3) U can overload the private and final methods
    *             OverRiding
    * 1) is heppens int the multiple classes(parent and child*)
    * 2) we can not change the return type, parametre type, parameter count.
    * 3) U can NOT overRide the private and final methods.
     */

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.myMethod();
        childClass.myMethod("DeL");
        childClass.myMethod(126617);
    }
}
