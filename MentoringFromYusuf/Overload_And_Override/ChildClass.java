package MentoringFromYusuf.Overload_And_Override;

public class ChildClass extends SuperClass {
    public void myMethod(){
        System.out.println("I'm the first method");
    }

    public void  myMethod(String str1){
        System.out.println("I'm the first method and my parametre is " +str1);
    }
// in OVERLOADING U need at lest one different type or parametre count
    public void myMethod(int s1){
        System.out.println("I'm the first method and my parametre is " +s1);

    }

    @Override
    public void iAmSuper() {
        super.iAmSuper();

        System.out.println("But I'm the child class");
    }
}
