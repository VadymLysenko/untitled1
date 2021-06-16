package day_54_abstraction;

public class Salad extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("salad is preparing");

    }
    @Override
    public void serve() {
        System.out.println("salad is serving");
    }
}
