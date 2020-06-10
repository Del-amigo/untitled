package Day36.Tasks;

import java.time.LocalDateTime;

public class User {
   public String name;
   public LocalDateTime registration;

    public User(String name, LocalDateTime registration) {
        this.name = name;
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                '}';
    }
}
