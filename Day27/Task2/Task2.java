package Day27.Task2;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {


    public static void main(String[] args) {

       User user1 = creatUser("Delik@migo","DDD15915","Behruz",
                "Jumaev","10101 "+"NortheastAvenue","14/01/1993", 267.2667070,
                "BehruzJumayev@gmail.com");
        System.out.println("\n---------");
        printAttributes((creatUser("klerikImigo","Klaasd0x","Firuz",
                "Jumaev","26 str. Chashmassor", "24/06/1989", 900.989191,
                "Klerik89@mail.ru")));
        System.out.println("\n---------");
        printAttributes(creatUser("Dos","D0s88956","Dosmukhamet",
                "Zhangibek","600 Getty NY","15/07/1988", 1539731010,
                "DosSantoz11@yahoo.com"));
        System.out.println("\n---------");
        ArrayList<User>userOne = new ArrayList<>();
        Collections.addAll(userOne,user1);
    }

    public static User creatUser(String user123, String password, String first, String last,
                                 String adress, String bith, double phone,String mail) {
        User user = new User();
        user.firstName = first;
        user.lastname = last;
        user.password = password;
        user.username = user123;
        user.address = adress;
        user.birthDate = bith;
        user.phone = phone;
        user.email = mail;

        return user;
    }

    public static void printAttributes(User user) {
        System.out.print(user.firstName+" ");
        System.out.print(user.username+" ");
        System.out.print(user.lastname+" ");
        System.out.print(user.password+" ");
        System.out.print(user.address+" ");
        System.out.print(user.birthDate+" ");
        System.out.print(user.phone+" ");
        System.out.print(user.email+" ");
        System.out.println("");
    }
}