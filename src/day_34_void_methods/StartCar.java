package day_34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void seatInCar(){
        System.out.println("1. Open the door and seat in driver seat");

    }

     public static void startTheCar(){
         System.out.println("2. Insert key to ignition and turn key clockwise");
     }
    public static void shiftToDrive(){
        System.out.println("3. Shift gear to D mode let's hit the road");
    }
    public static void pressGasPedal(){
        System.out.println("4. Pedal to the metal run run run ...");
    }

}
