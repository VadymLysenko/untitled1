package day_57_abstraction_polymorphism.abstract_class_vs_interface.SHAPE;

public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("*");
        System.out.println();
    }
}
