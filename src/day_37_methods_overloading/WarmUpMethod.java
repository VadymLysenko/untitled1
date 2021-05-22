package day_37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("CyberTeksTudenT", "abc123"); // sunny day
        loginVoid("cybertek", "answer"); // rainy day scenario
        loginVoid("", "");
        System.out.println(login("cybertekStudent", "abc123"));
        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Login failed");
        }
        boolean isLoginSuccessful = login("nadir", "mountains");
            System.out.println("isLoginSuccessful = " + isLoginSuccessful);



    }


    public static void loginVoid(String userName,String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)){
            System.out.println("Login successful, welcome cybertekStudent");
        }else{
            System.out.println("incorrect username or password");
        }

    }

    public static boolean login(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName)&&password.equalsIgnoreCase(secretPassword)){
            return true;
        }
            return false;

    }
}
