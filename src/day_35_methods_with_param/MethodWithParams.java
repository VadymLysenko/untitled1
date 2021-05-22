package day_35_methods_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(5);
        displayValue(15);
        int count = 55;
        displayValue(count);
        greetByNmae("Murodil");
        greetByNmae("Vadym");
        greetByNmae("Dartanian");
        greetByNmae("Atos");
        greetByNmae("Partos");
        greetByNmae("Aramis");
        greetByNmae("X Æ A-12 Musk");
    }

    public static void displayValue(int num) {
        System.out.println("value is  " + num);


    }

    public static void greetByNmae(String name) {
        System.out.println("Hello " + name + ", how are you");
    }
}