package day_53_inheritance;

public class ModelX extends ElectricCar{

    public ModelX( String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome new ModelX");
    }
}
