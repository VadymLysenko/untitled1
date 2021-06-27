package day_57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethod() {
        System.out.println("implementation is called");
    }

    /**
     * first non - abstract child class of
     * Abstract class or interface - is
     * called Concrete class
     */
    @Override
    public void methodB(){
        System.out.println("method overridden version is called");
    }
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }
    @Override
    public void absMethodD(int num){
        System.out.println("abstractMethodD overridden version is called");
    }
}
