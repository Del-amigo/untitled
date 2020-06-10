package day29.Task3;

public class Task2 {
    public static void main(String[] args) {
        Login login = new Login();
        login.username= "Del";
        login.password = "Del22545";

        System.out.println(login.checkValid(login.username,login.password));


    }
}
