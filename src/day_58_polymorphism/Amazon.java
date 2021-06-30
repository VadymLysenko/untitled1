package day_58_polymorphism;

public class Amazon extends OnlineShopping{
    @Override
    public void buy() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2-day shipping for prime users");
    }
}
