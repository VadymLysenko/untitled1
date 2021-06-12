package day_52_inheritance.discordusers;

public class Admin extends User {

    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                "'name='" + getName() + '\'' +
                        "'id=" + getId() + '}';
    }
}
