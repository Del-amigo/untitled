package Day28.Task1;

class Rectangle{
    double length;
    double width;


//P=2(l+w)
    double perimetterOfRectangle(){
        return 2*(length+width);
    }
    // A=w*l
    double areaPerime(){
        return width*length;
    }

    void printPermiter(){
        System.out.println(perimetterOfRectangle());
    }
    void printAreaPerm(){
        System.out.println("Area of Perimeter is: "+ areaPerime());
    }
    public String toString(){
       String output = "----------------"+
               "\nLength is: "+ length+
        "\nWidth is: "+ width +
        "\nThe Area: " + areaPerime()+
        "\nPermiter is: " + perimetterOfRectangle()+
        "\n------------------";
        return output;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 25;
        rectangle.length = 50;
     //   rectangle.printPermiter();
      //  rectangle.printAreaPerm();
        System.out.println(rectangle);
    }
}
