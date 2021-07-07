package day_60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("let's create exception");
        //RuntimeException e = new RuntimeException();
        //throw e; // manually created a problem
        //throw new RuntimeException(); or you can create it right away
        String userName = "";
        if(userName.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }

    }
}
