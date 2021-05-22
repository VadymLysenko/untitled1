package day_37_methods_overloading;

public class methodsWithOverloading {
    public static void main(String[] args) {
        methodsWithOverloading.sum(10,5);
        methodsWithOverloading.sum(1,5,9);
        methodsWithOverloading.sum(10,15,20,25);
        sum(10,5);
        sum(2,3,4);
        sum(2,3,4,5);
    }

    public static void sum(int a, int b) {
        System.out.println("sum(int + int)");
        System.out.println("Result = " + (a + b));

    }

    public static void sum(int a, int b, int c) {
        System.out.println("sum(int + int + int)");
        System.out.println("Result = " + (a + b + c));
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println("sum(int + int + int + int)");
        System.out.println("Result = " + (a + b + c + d));
    }
}