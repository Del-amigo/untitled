package Day13;

public class JavaWhileLoop {
    public static void main(String[] args) {

        int i = 0;

        while(i < 5) { // 5 < 5 = false
            System.out.print( "Hi: " +(++i) );

        }

        System.out.println( "after the loop value of i:" + i );

    }

}
