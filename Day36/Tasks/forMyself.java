package Day36.Tasks;

import java.util.Scanner;

public class forMyself {
    public static void main(String[] args) {
        System.out.println( "Provide any User, please" );
        Scanner scanner = new Scanner( System.in );
        while (scanner.hasNext()) {
            if (scanner.nextLine().equalsIgnoreCase( "exit" )) {
                scanner.close();
            }
    /*    if (nextLine.equalsIgnoreCase( "Exit" )){
            System.out.println(scanner.close());*/
        }
    }
}
