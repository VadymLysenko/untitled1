package day_08_castingScanner;

public class TypeCasting {
    public static void main(String[] args) {
        int i = (int) 3.9;
        System.out.println(i);

        // IMPLICIT CASTING
        //byte > short > int > long > float > double
        double d1 = 200;
        long l = i;
        System.out.println("d1 = " + d1);

        //EXPLICIT CASTING
        byte b1 = 5;
        short sh1 = 400;
        b1 = (byte)sh1;
        System.out.println("b1 = " + b1);

        double price = 200.55;
        int iPrice = (int)price;
        System.out.println(i);

        int int1 = (int)(5/2.0);

        //String str = "10";
        //int n1 = (int)str; we can casted like that. Only if byte > short > int > long > float > double




    }
}
