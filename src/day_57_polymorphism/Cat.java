package day_57_polymorphism;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Cat says meow meow");
    }
}
