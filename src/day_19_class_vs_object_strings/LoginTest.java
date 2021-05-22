package day_19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)){
            System.out.println("Pass - user successfully logged in " + Instant.now());
        }else{
            if(!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Incorrect user name");
            }else{
                System.out.println("Incorrect password");
            }

        }
    }
}
