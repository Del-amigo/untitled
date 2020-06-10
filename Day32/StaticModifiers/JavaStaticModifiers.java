package Day32.StaticModifiers;
/*
static
Attributes and methods belongs to the class, rather than an object
 */
public class JavaStaticModifiers {

    public static int staticcounter = 0; //if it has "STATIC" it's class variable
public int count = 0;// it's instance variable

    public void counterA() {
        System.out.println(count++);
        System.out.println(staticcounter++);
    }

    public void counterB() {
        System.out.println("non static "+count++);
        System.out.println("static Counter "+staticcounter++);
    }

    public static void main(String[] args) {
        JavaStaticModifiers javaStaticModifiers = new JavaStaticModifiers();
        javaStaticModifiers.counterA();
        javaStaticModifiers.counterB();//so U can change how many times U want, not like final**

    }
}
