package day_61_execptions_collections;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverError
    myMethod();

    }

    static int counter = 0;

    public static void myMethod() {
        System.out.println(counter++);
        myMethod();
    }
}