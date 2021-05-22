package day_10_shorthand_operatprs;

public class  ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking = lot " + cars);

        //6 cars left the parking lot
        //cars = cars - 6;
        cars -= 6;
        System.out.println("cars in parking = lot " + cars);

        cars = cars - 1;
        cars -= 1;
        System.out.println("cars in parking = lot " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("electricCars in parking = lot " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word = word + " programming ";
        System.out.println(" word = " + word);
        //add "is fun"
        word += " is fun";
        System.out.println(" word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        System.out.println("selenium = " + selenium);

        word += 12345;
        System.out.println(" word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;// 'A' to 'D' adding number 3
        System.out.println("letter = " + letter);
        //add letter 'j'
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println(" normal parking fee = " + parkingFee);
        //early bird is 50% off
        parkingFee /= 2;
        System.out.println("parkingFee early bird = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parkingFee = " + parkingFee);

    }
}
