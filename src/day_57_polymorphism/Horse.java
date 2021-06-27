package day_57_polymorphism;

public class Horse extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Horse is saying night night");
    }
}
