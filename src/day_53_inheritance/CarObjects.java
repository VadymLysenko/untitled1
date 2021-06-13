package day_53_inheritance;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla","Model Y",48190.0,2021,326);
        ec1.drive(50);
        System.out.println(ec1.toString());
    }
}
