package day_36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(calculator.add(4.4,5.5));
        System.out.println(calculator.minus(100,40));
        System.out.println(calculator.devide(55,4));
        System.out.println(calculator.multi(15,2));
        System.out.println(calculator.reminder(10,20));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = calculator.minus(d1,d2);
        System.out.println("result = " + result);
    }
}
