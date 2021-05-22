package day_46_encapsulation;

public class Dealership {

    public static void main(String[] args) {


        Car car1 = new Car();
        //car1.model = "Audi RS6";
        //car1.year = 2021;
        car1.setModel("Audi RS6");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2021);
        System.out.println("car1 year = " + car1.getCarYear());
        car1.setMileage(5);
        System.out.println("car1 millage = " +
                car1.getMileage()+" miles brand new car");
        car1.setPrice(125);
        System.out.println("car1 price = " + car1.getPrice()+ " thousand $$$ after you became senior developer only");
        System.out.println(car1.toString());
        System.out.println(car1);

    }
}
