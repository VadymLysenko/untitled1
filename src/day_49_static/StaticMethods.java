package day_49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {

        System.out.println("message: " + message);
        //System.out.println("num = " + num); // num is instance variable
        System.out.println("count = " + count);// count is static variable
    }

    public static void anotherStaticMethod() {

        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("Num = " + num);
        System.out.println("Count = " + count);
        displayMessage("hello from instanceMethod");
    }
}
