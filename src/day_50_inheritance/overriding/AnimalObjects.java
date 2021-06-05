package day_50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Neo";
        animal.type = "Siberian Husky";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
