package day29.Task3;

public class Login {
    String username;
    String password;
    String role;//admin, user

    String checkValid(String username, String password) {
        this.password = password;
        this.username = username;
        if (password.equals(username) || password.isEmpty() || username.isEmpty()) {
            return "Your password is InValid, type another password!";
        }else {
           return "You R Good";
        }
    }
}
