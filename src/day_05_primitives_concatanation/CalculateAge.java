package day_05_primitives_concatanation;

public class CalculateAge {
    public static void main(String[] args) {
        int yearOfBirth = 1988;
        int currentYear = 2021;
        int age = currentYear - yearOfBirth;
        System.out.println(age);

        int num1 = 50;
        int num2 = 200;
        System.out.println(num1);
        System.out.println(num2);

        long a = 30L;
        long b = (short)a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int i = 100;
        double d = 123;
        float f = 300;
        d = i;

        System.out.println("5 + 2 = " + 3 +4);
        System.out.println("5 + 2 = " + (3 + 4));

    }

}

