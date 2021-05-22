package day_36_methods_with_return;

public class calculator {
    public static void main(String[] args) {
        System.out.println(add(4.4, 5.5));
        System.out.println(multi(4,5));
        System.out.println(devide(10,5));
        System.out.println(minus(1000,100));
        System.out.println(reminder(1977,11));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double multi(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double devide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public static double reminder(double num1, double num2) {
        double sum = num1 % num2;
        return sum;
    }
}