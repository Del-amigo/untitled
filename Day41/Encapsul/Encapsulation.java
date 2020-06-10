package Day41.Encapsul;

public class Encapsulation {
    //--is wrapping all your instance variables, methods...into single capsule/unit
    //-- we use private to hide our instance variables...so we be able to acces to our variables with
    //                                                                             getters and setters

    private long id;
    private String userName;
    private  String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        // is valid only when length is >6
        if (password.length()<=6){
            throw new IllegalArgumentException("Your password is too short, please provide longer password");
        }
        this.password = password;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
