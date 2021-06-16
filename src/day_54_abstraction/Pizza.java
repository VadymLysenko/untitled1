package day_54_abstraction;

public class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Restaurant is preparing pizza");
    }
    @Override
    public void serve() {
        System.out.println("Restaurant is serving the pizza");
    }
}
