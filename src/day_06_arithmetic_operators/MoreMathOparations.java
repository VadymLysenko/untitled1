package day_06_arithmetic_operators;

public class MoreMathOparations {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        //int toyotas = 431, hondas = 233, vw = 2, tesla = 20, nissan = 1, bmw = 155;
        System.out.println(toyotas);
        System.out.println(hondas);
        System.out.println(vw);
        System.out.println(tesla);
        System.out.println(nissan);
        System.out.println(bmw);
        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        //there are 2 slices per person
        System.out.println("there are " + slicesPerPerson + " slices per person");
        //We order hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("we ordered " + pizza + " pizza with "+ slices + " slices, " + people
                + " people ate " + slicesPerPerson + " slices each." );



    }
}
