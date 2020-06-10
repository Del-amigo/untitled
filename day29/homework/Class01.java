package day29.homework;

public class Class01 {
 /*
 Global Variable => when U R creatinga variable if it is not in the method and in the class it calls as a G.Vari.

 Local Variable => when U R creating a variable if it is in the method and in the class-then it's called as a L.Vari.


 What is static?!
    -static field and static method in Java
             U can't connect to non static variable int the static method to connect to non static or variable
                U need to create an ***OBJECT***

  */

    int age = 20; // Global is in the class but not in the method


    static int age2 = 21;   //static GlobaL
    public void myMethod(){
        int carAge = 23;//local variable...
        myMethod2();
    }

    public void myMethod2(){
        System.out.println("Non-static variable--"+age);   //but U can conect to global becouse that one is outside)
     //   System.out.println(carage);--we can not conect to local outside of this method!
        System.out.println("Static variable---"+age2++);
    }

    public static void main(String[] args) {
        Class01 name = new Class01();
        name.myMethod2();
        System.out.println("--------");
        name.myMethod2();
        System.out.println("--------");
        name.myMethod2();
        System.out.println("--------");
        name.myMethod2();   //if U R calling static from non-static method it changes but non static stays as defoult!!!
                           // if U R using objects then ***STATIC*** variable is takin' the value from object))



    }

}
