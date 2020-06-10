package Day14;

public class JavaForLoopEx1 {
    public static void main(String[] args) {

        // to get last value of i
        int temp_i = 0;
        for(int i = 0; i < 5; i++) {
            temp_i = i;
        }
        System.out.println( temp_i );


        // infinite loop
        for(int i = 0; ; i++) {
            System.out.println( "infinite: " + i );
        }


    }

}
