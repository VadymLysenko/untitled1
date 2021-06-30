package day_57_abstraction_polymorphism.abstract_class_vs_interface.SHAPE;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Shape();
        circle.draw();
        Shape square = new Square();
        square.draw();

    }
}
