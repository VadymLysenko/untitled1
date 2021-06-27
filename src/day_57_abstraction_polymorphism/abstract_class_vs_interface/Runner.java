package day_57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /**
        AbstractA abstractA = new AbstractA(); //if using curly braces {} it's annonomous class
        InterfaceA interfaceA = new InterfaceA(); // we cannot create object
         */
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); // only works with interface.staticMethodE
        ConcreteA.staticMethodC();

    }
}
