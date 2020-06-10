package Day27;

public class JavaClassAndObject { //You may have just one public class in one page

    public static void main(String[] args) {
  Car toyota = new Car();
  toyota.model = "Totota Camry";
  toyota.manufacture = 2019;
  toyota.motorSize = 2.5;

  Car lexus = new Car(); //objects
  lexus.model = "RX-500";
  lexus.motorSize = 2.6;
  lexus.manufacture = 2016;

    }
}


class Car{ // we create class to represent anything by full*
    String model; ////instance variables, Attributes, fields*
    int manufacture;
    double motorSize;
}

