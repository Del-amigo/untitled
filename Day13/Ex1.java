package Day13;

public class Ex1 {
    public static void main(String[] args) {
        // sum numbers between 0 and 5;

        int result = 0;

        int i = 0;
        while(i < 5) {
            result = result + i;
            System.out.println( "number: " + i );
            ++i;
        }

        System.out.println( "result: " + result );

    }

}
