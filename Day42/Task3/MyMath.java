package Day42.Task3;

import java.util.ArrayList;
import java.util.List;

public class MyMath {
    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();
        numbers.add( 0 );
        numbers.add( 2 );
        numbers.add( 4 );
        numbers.add( 6 );
        numbers.add( 8 );
        MyNumber myNumber = new MyNumber(numbers);
        System.out.println(myNumber);
    }
}
