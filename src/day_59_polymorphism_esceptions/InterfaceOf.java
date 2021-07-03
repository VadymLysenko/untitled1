package day_59_polymorphism_esceptions;

import day_57_abstraction_polymorphism.abstract_class_vs_interface.SHAPE.Circle;
import day_57_abstraction_polymorphism.abstract_class_vs_interface.SHAPE.Shape;
import day_57_abstraction_polymorphism.abstract_class_vs_interface.SHAPE.Square;

public class InterfaceOf {
    public static void main(String[] args) {
        Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if(shape instanceof Circle){
            System.out.println("It is circle object");
        }else if(shape instanceof Square){
            System.out.println("It is Square object");
        }
        System.out.println(shape.getClass().getSimpleName()); // just calss name of object
        System.out.println(shape.getClass().getName()); // class name of object and package name
        if(shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is Square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable " + el.getClass().getSimpleName());
    }
}
