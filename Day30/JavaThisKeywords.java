package Day30;

class Car{
    String name;

    public void print(){
        String name = "Behruz";
        System.out.println("Name: "+ this.name);
        System.out.println(name);
    }
}
public class JavaThisKeywords {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Lexus";
        car.print();
    }
}
