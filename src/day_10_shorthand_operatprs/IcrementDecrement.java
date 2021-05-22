package day_10_shorthand_operatprs;

public class IcrementDecrement {
    public static void main(String[] args) {
        int apples = 0;
        System.out.println(apples);
        System.out.println(++apples);
        System.out.println(apples++);
        System.out.println(apples);
        System.out.println(apples++);
        System.out.println(apples);
        apples--;


        int pears = 3;
                       //4   * 5 / 4       +   2   =>
        int basket = ++pears * 5 / pears-- + --pears;
        System.out.println(basket);
        System.out.println("pears = " + pears);

        int counter = 10;
        counter = counter + 1;
        counter++; // shorter way
        System.out.println("counter = " + counter);
    }
}
