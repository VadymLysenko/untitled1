package day_09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter currenSpeed:");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int OverTheLimit = currentSpeed - speedLimit;

        System.out.println("OverTheLimit = " + OverTheLimit + "mph over slow down!");

    }
}
