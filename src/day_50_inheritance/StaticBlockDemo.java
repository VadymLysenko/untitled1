package day_50_inheritance;

public class StaticBlockDemo {
    static {
        System.out.println("static initializer block");
    }
    public StaticBlockDemo() {
        System.out.println("Constructor method");
    }
}
