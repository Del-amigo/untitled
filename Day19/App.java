package Day19;

public class App {
    public static void main(String[] args) {
        System.out.println(cube(3));
int number1 = cube(2)+10;
        System.out.println("without void type: "+number1);
  // Sum(5,3);
/*        StringBuffer name =  new StringBuffer("Behruz");
        StringBuffer a = name.reverse();
        System.out.println(a);    */
    }
    public static int cube(int numberToCube){
        return numberToCube*numberToCube*numberToCube;
    }
    public static void Sum(int a, int b){
        System.out.println(a+b);
    }
}
