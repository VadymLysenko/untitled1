package day_29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int a = 1; a <= 10; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int a = 10; a >= i; a--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}