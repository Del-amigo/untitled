package Day20;

public class JavaMethodOverloading {
    /*
    Different ways of doing overloading methods:
    1. The number of parameters in two methods.
    2. The data types of the parameters of methods.
    3. The Order of the parameters of methods.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    //1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //2. The data types of the parameters of methods.
    public static double sum(double a, double b){
        return a + b;
    }




    //    3. The Order of the parameters of methods.
    public static void printNameAndAge(String name, int age){
        //you code
    }

    public static void printNameAndAge(int age, String name){
        //you code
    }

}
