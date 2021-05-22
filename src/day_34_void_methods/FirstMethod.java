package day_34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();

        for(int i = 0; i < 100; i++){
            displayMessage();
        }
    }

    public static void displayMessage(){
        System.out.println("Hello friends B22!");
    }

}
