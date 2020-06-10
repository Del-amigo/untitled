package Day30.taskZ;

import java.util.jar.JarOutputStream;

enum Condition{
    REALLYOLD, USED, GOOD, LIKENEW;
}
class Car{
 String brand;
 int yaer;
 Condition condition;
 double price;

    public Car(String brand, int yaer) {
        this.brand = brand;
        this.yaer = yaer;
    }

    public Car(String brand, int yaer, Condition condition, double price) {
      this(brand, yaer );
      this.condition = condition;
      this.price = price;
    }
    public String toString(){
        return "----------------"+
                "\nbrand is: "+ brand+
                "\nyear is: "+ yaer +
                "\nThe price: " + price+
                "\nconditions are: " + condition+
                "\n------------------";
    }
}

public class Task2 {
    public static void main(String[] args) {
        Car car = new Car( "Toyota",2010 );
        Car car1 = new Car( "Honda",2019,Condition.REALLYOLD,1000d );
        System.out.println(car);
        System.out.println(car1);
    }
}
