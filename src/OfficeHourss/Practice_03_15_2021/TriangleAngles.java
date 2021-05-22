package OfficeHourss.Practice_03_15_2021;

public class TriangleAngles {
    public static void main(String[] args) {
        int angleOne = 100;
        int angleTwo = 30;
        int angleThree = 50;

        int sum = angleOne + angleTwo + angleThree;
        if(sum == 180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Invalid triangle");
        }

    }
}
