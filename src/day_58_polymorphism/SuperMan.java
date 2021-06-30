package day_58_polymorphism;

public class SuperMan extends Father implements Worker {
    @Override
    public void work(String job) {
        System.out.println("Superman is working his ass off " + job);
    }

    @Override
    public double getPaid() {
        System.out.println("Superman is getting paid");
        return 11500;
    }
}
