package OfficeHourss;

public class CastingPractice {
    public static void main(String[] args) {
        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);

        float f = 3.54f;
        float f2 = (float)3.54;
        System.out.println("f = " + f);
        System.out.println("f2 = " + f2);

        float f3 = 5;
        float f4 = 5.5F;
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);

        long l = 22313;
        long l2 = 312312313323L;
        System.out.println((double)l);
        System.out.println((float)l);
        System.out.println(l2);

        double million = 1_000_000;
        System.out.println(million);
    }
}
