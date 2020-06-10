package Day33.Enum;

public class Ex2 {

    public static void main(String[] args) {
        Levels levels = Levels.HIGH;//it is not an object
  // we can use them in if statement, switch case...
        Levels high = Levels.valueOf( "HIGH" );
        System.out.println(high);

        System.out.println(high.getIntValue());

    }
}
