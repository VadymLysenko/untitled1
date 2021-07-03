package day_100_practice_my_own;

public class Swap2Nums {
    public static void main(String[] args) {
        int x = 100, y = 200;
        System.out.println("Before swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
