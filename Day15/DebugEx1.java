package Day15;

public class DebugEx1 {
    public static void main(String[] args) {

        for(int i = 0; i < 40; i++) {
            if(i / 15 == 1) {
                break;
            }
            System.out.println( i );
        }
    }
}

