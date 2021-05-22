package day_44_custom_classes;

public class AnimalObjects {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak("english");
        // created new animal object - cheetahObject
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah"; //reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("pirogi with sour cream");
    }
}
