package day_07_arithmetic_operators_casting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 10;

        int sum = n1 + n2;
        int subtraction = n1 - n2;
        int division = n1 / n2;
        int multiplication = n1 / n2;
        int remainder = n1 % n2;

        System.out.println(sum+","+subtraction+","+division+","+multiplication+","+remainder);

        int num1 = 4 + 3 * 2;
        System.out.println(num1);

        num1 = (4 + 3) * 2;
        System.out.println(num1);

        num1 = (4 + 3) * 2 + 4 / 2;
        System.out.println("num1 = " + num1);

        byte b = 10;
        short sh = 20;
        //short total = b + sh; will not compile
        int total = b + sh;
        System.out.println(total);

        //sh = 200 + 2;
        double d = 10.5;
        int i = 4;
        double j = d * i;
        System.out.println(j);

        double d2 = 3.4;
        double d3 = d - d2;
        System.out.println(d3);






    }
}
