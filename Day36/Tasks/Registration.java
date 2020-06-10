package Day36.Tasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        ArrayList<User>users = new ArrayList<>();
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Provide any User, please" );
        String name = scanner.nextLine();
        while (!name.equalsIgnoreCase( "exit" )) {
          users.add(new User( name, LocalDateTime.now() ));
          name = scanner.nextLine();
            }
        System.out.println(users);
        }
    }
